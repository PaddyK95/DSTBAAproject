package services.systemlogs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import com.google.common.collect.ArrayListMultimap;

import services.systemlogs.StatusRequest;
import services.systemlogs.StringResponse;
import services.systemlogs.StoreRequest;
import services.systemlogs.CreateReportRequest;
import services.systemlogs.SpreadSheetRequest;



import services.systemlogs.SystemLogsServiceGrpc.SystemLogsServiceImplBase;

public class SystemLogServer extends SystemLogsServiceImplBase{

	//Variables
	private static List<String[]> systemLogs = new ArrayList<>();

		//variables containing necessary values needed for initializing the server
		private static final Logger logger = Logger.getLogger(SystemLogServer.class.getName());
		private static String ServerType = "_http._tcp.local.";
		private static String ServerName = "System Logs Service";
		private static int Port = 9090;
		private static String ServerPath = "path=index.html";
		
		public static void main(String[] args) throws InterruptedException {
			
			systemLogs.add(new String[] { "Information", "Firmware S3 times. SuspendStart: 50881274, SuspendEnd: 50881280" });
			systemLogs.add(new String[] { "Information", "The system is entering sleep mode." });
			systemLogs.add(new String[] { "Warning", "Firmware S3 times. SuspendStart: 50881274, SuspendEnd: 50881280" });
			systemLogs.add(new String[] { "Information", "Name resolution for the name wpad timed out after none of the configured DNS servers responded." });
			systemLogs.add(new String[] { "Information", "7003 - Roam Complete" });
			systemLogs.add(new String[] { "Error", "The server Microsoft.SkypeApp_15.63.76.0_x86__kzf8qxf38zg5c!App.AppXtwmqn4em5r5dpafgj4t4yyxgjfe0hr50.mca did not register with DCOM within the required timeout." });
			systemLogs.add(new String[] { "Warning", "WLAN Extensibility Module has stopped." });
			systemLogs.add(new String[] { "Warning", "Name resolution for the name sy.eu.angsrvr.com timed out after none of the configured DNS servers responded." });
			systemLogs.add(new String[] { "Error", "Installation Failure: Windows failed to install the following update with error 0x80073D02: 9MV0B5HZVK9Z-Microsoft.GamingApp." });
			systemLogs.add(new String[] { "Information", "The system has returned from a low power state"});
			
			SystemLogServer SystemLogServer = new SystemLogServer();
	    	
	        try {
	        	//Initializing the server
			    Server server = ServerBuilder.forPort(Port)
			    .addService(SystemLogServer)
			        .build()
			        .start();
			    
			    
			    logger.info("Server started, listening on " + Port);
			    server.awaitTermination();
			    
	            // Creating a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	            // Registering the System Logs Service to the DNS Server
	            ServiceInfo serviceInfo = ServiceInfo.create(ServerType, ServerName, Port, ServerPath);
	            jmdns.registerService(serviceInfo);

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }  
		}
		
		//Method which gets a request from the client and get current amount of System Logs that have been found
		 @Override
		 public void getStatus(StatusRequest request, StreamObserver<StringResponse> responseObserver) {
			 
			 StringBuilder stb = new StringBuilder(request.getRequest());
			 String req = stb.toString();
			 StringResponse.Builder response = StringResponse.newBuilder();
			 
			//Error handling to check if a value is passed to server from client class.
			 try {
			 if(req.equals("Get Status")) {
					 response.setResponse("Current Systemlogs that have occured are: " + systemLogs.size() );
					 responseObserver.onNext(response.build());
					 responseObserver.onCompleted();
	
		 }	  //Returns an exception when a null value is passed to the server from the client
			 }catch(NullPointerException e) {
				 System.out.print("NullPointerException Caught: " + e);
			 }
		 }
		 
		//Method which gets a request from the client and stores a new System log to the application.
		 @Override
		 public void store(StoreRequest request, StreamObserver<StringResponse> responseObserver) {
			 
			 String key = request.getKey().toString();
			 String value = request.getValue().toString(); 
			 StringBuilder stb = new StringBuilder(request.getRequest());
			 String req = stb.toString();
			 StringResponse.Builder response = StringResponse.newBuilder();
			 
			//Error handling to check if a value is passed to server from client class.
			 try {
			 if(req.equals("Store")) {
				 
				 systemLogs.add(new String[] { key, value });
				 response.setResponse("New log was successfully stored");
				 responseObserver.onNext(response.build());
				 responseObserver.onCompleted();
	
		 }	  //Returns an exception when a null value is passed to the server from the client
			 }catch(NullPointerException e) {
				 System.out.print("NullPointerException Caught: " + e);
			 }
		 }
		
		//Method which gets a request from the client and creates a Systems Log Report in the form of a .txt file
		 @Override
		 public void createReport(CreateReportRequest request, StreamObserver<StringResponse> responseObserver) {
			StringBuilder builder = new StringBuilder();
			 StringResponse.Builder response = StringResponse.newBuilder();
		
				//Error handling to check if a value is passed to server from client class.
				try {
					for( StringRequest streq : request.getMultirequestList()) {
						builder.append(streq.getRequest()); 
						StringResponse text = StringResponse.newBuilder().setResponse(builder.toString()).build();
				try {
					PrintWriter writer;
					writer = new PrintWriter("System Logs Report.txt");
					writer.println(text);
					writer.close();
					
					 response.setResponse("New Systems Log Report Created Successfully");
					 responseObserver.onNext(response.build());
					 responseObserver.onCompleted();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}	//Returns an exception when a null value is passed to the server from the client
				}catch(NullPointerException e) {
					System.out.print("NullPointerException Caught: " + e);
				}
			 StringResponse reply = StringResponse.newBuilder().setResponse(builder.toString()).build();
			 responseObserver.onNext(reply); 
			 responseObserver.onCompleted();
			   
		 }
		
	
		
		//Method which gets a request from the client and gets all current System Logs and converts them into a .csv file
		 @Override
		 public void createLogSpreadSheet(SpreadSheetRequest request, StreamObserver<StringResponse> responseObserver) {
			 
			 StringBuilder stb = new StringBuilder(request.getRequest());
			 String req = stb.toString();
			 StringResponse.Builder response = StringResponse.newBuilder();
			 
			//Error handling to check if a value is passed to server from client class.
			 try {
			 if(req.equals("Create SpreadSheet")) {
				 
				 
				 for (String[] logs : systemLogs) {
					    System.out.println(logs);
					}
				
					 response.setResponse("Current Systemlogs that have occured are: " + systemLogs.size() );
					 responseObserver.onNext(response.build());
					 responseObserver.onCompleted();
	
		 }	  //Returns an exception when a null value is passed to the server from the client
			 }catch(NullPointerException e) {
				 System.out.print("NullPointerException Caught: " + e);
			 }
		 }
		
	}
