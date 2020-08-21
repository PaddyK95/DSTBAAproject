package services.eventlogs;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.net.InetAddress;
import java.util.logging.Logger;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import java.util.*;
import java.util.HashMap;

import javax.mail.*;
import javax.mail.internet.*;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import com.google.common.collect.ArrayListMultimap;

import javax.activation.*;
import javax.mail.Session; 
import javax.mail.Transport; 

import services.eventlogs.AlertRequest;
import services.eventlogs.SearchRequest;
import services.eventlogs.StatusRequest;
import services.eventlogs.StringResponse;
import services.eventlogs.EventLogsServiceGrpc.EventLogsServiceImplBase;

public class EventLogServer extends EventLogsServiceImplBase{

		//Variables
			private static Multimap<String, String> eventLogs = ArrayListMultimap.create();
		
	
		
		//variables containing necessary values needed for initializing the server
		private static final Logger logger = Logger.getLogger(EventLogServer.class.getName());
		private static String ServerType = "_http._tcp.local.";
		private static String ServerName = "Event Logs Service";
		private static int Port = 8080;
		private static String ServerPath = "path=index.html";
		
		public static void main(String[] args) throws InterruptedException {
			EventLogServer EventLogServer = new EventLogServer();
	    	
			eventLogs.put("Information", "Successfully scheduled Software Protection service for re-start at 2120-07-28T11:32:02Z. Reason: RulesEngine.");
			eventLogs.put("Information", "Offline downlevel migration succeeded.");
			eventLogs.put("Warning", "Certificate for local system with Thumbprint 2a 48 79 41 cb d6 b9 0f 23 7e 22 79 d2 79 ac be 5d 67 5d e1 is about to expire or already expired.");
			eventLogs.put("Information", "PowerEvent handled successfully by the service.");
			eventLogs.put("Information", "Successfully scheduled Software Protection service for re-start at 2120-07-28T10:06:55Z. Reason: RulesEngine.");
			eventLogs.put("Information", "Service stopped..");
			eventLogs.put("Warning", "The Open procedure for service \"BITS\" in DLL \"C:\\Windows\\System32\\bitsperf.dll\" failed with error code An internal error occurred.. Performance data for this service will not be available.");
			eventLogs.put("Information", "The winlogon notification subscriber <SessionEnv> was unavailable to handle a notification event.");
			eventLogs.put("Warning", "The Open procedure for service \"WmiApRpl\" in DLL \"C:\\Windows\\system32\\wbem\\wmiaprpl.dll\" failed with error code The device is not ready.. Performance data for this service will not be available.");
			eventLogs.put("Error", "Unable to open the Server service performance object. The first four bytes (DWORD) of the Data section contains the status code.");
			eventLogs.put("Error", "Office Subscription licensing exception: Error Code: 0x303; CorrelationId: {462B4447-321F-4D1F-AE36-2A0F4DEF4454}");
			eventLogs.put("Information", "Offline downlevel migration succeeded.");

			
	        try {
	        	//Initializing the server
			    Server server = ServerBuilder.forPort(Port)
			    .addService(EventLogServer)
			        .build()
			        .start();
			    
			    
			    logger.info("Server started, listening on " + Port);
			    server.awaitTermination();
			    
	            // Creating a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	            // Registering the EventLogs Manager Service to the DNS Server
	            ServiceInfo serviceInfo = ServiceInfo.create(ServerType, ServerName, Port, ServerPath);
	            jmdns.registerService(serviceInfo);

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }    
	    }
	
		//Method which gets a request from the client and gets the current status of all Event logs that have been found
		 @Override
		 public void getStatus(StatusRequest request, StreamObserver<StringResponse> responseObserver) {
			 
			 StringBuilder stb = new StringBuilder(request.getRequest());
			 String req = stb.toString();
			 StringResponse.Builder response = StringResponse.newBuilder();
			 
			//Error handling to check if a value is passed to server from client class.
			 try {
			 if(req.equals("Get Status")) {
					 response.setResponse("Current Eventlogs that have occured are: " + eventLogs.size());
					 responseObserver.onNext(response.build());
					 responseObserver.onCompleted();
	
		 }	  //Returns an exception when a null value is passed to the server from the client
			 }catch(NullPointerException e) {
				 System.out.print("NullPointerException Caught: " + e);
			 }
		 }
		 
		//Method which gets a request from the client and searches for a specific Event log and returns it.
		 @Override
		 public void search(SearchRequest request, StreamObserver<StringResponse> responseObserver) {
			 
			 StringBuilder stb = new StringBuilder(request.getRequest());
			 String req = stb.toString();
			 String params = request.getParameter().toString();
			 StringResponse.Builder response = StringResponse.newBuilder();
			 
			//Error handling to check if a value is passed to server from client class.
			 try {
			 if(req.equals("Search")) {
				 
				if(eventLogs.containsKey(params)) {
						
					
					
					
					// response.setResponse(eventLogs.));
					 responseObserver.onNext(response.build());
					 responseObserver.onCompleted();
	
					
					
					
				}
		 }	  //Returns an exception when a null value is passed to the server from the client
			 }catch(NullPointerException e) {
				 System.out.print("NullPointerException Caught: " + e);
			 }
		 }
		 
		//Method which gets a request from the client and sends an email to another users about any alerts they discovered
		 @Override
		 public void alert(AlertRequest request, StreamObserver<StringResponse> responseObserver) {
			 
			 String req = request.getRequest().toString();
			 String email = request.getEmail().toString();
			 String message = request.getMessage().toString();
			 StringResponse.Builder response = StringResponse.newBuilder();
			 
			
			 if(req.equals("Alert")) {
				 
				 String from = "test@test.com";
				

			      // Assuming you are sending email from localhost
			      String host = "127.0.0.1";

			      // Get system properties
			      Properties properties = System.getProperties();

			      // Setup mail server
			      properties.setProperty("mail.smtp.host", "localhost");
			      properties.setProperty("mail.smtp.port", "8080");
			     // properties.setProperty("mail.smtp.starttls.enable", "false");
			     // properties.setProperty("mail.smtp.ssl.enable", "true");

			      // Get the default Session object.
			      Session session = Session.getDefaultInstance(properties);
			    	  
			      try {
			         // Create a default MimeMessage object.
			         MimeMessage emailMessage = new MimeMessage(session);

			         // Set From: header field of the header.
			         emailMessage.setFrom(new InternetAddress(from));

			         // Set To: header field of the header.
			         emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));

			         // Set Subject: header field
			         emailMessage.setSubject("This is a test email");

			         // Now set the actual message
			         emailMessage.setText(message);

			         // Send message
			         Transport transport = session.getTransport("smtp");
			         transport.connect();
			         Transport.send(emailMessage);
			         transport.close();
			         System.out.println("Sent message successfully....");			         
			         response.setResponse("Email sent successful");
			         responseObserver.onNext(response.build());
			         responseObserver.onCompleted();
			      } catch (MessagingException mex) {
			         mex.printStackTrace();
			      }
			   }
		 }
		 
		 
		 
		 
		 
		 
	}
		
		

