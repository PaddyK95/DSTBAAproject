package services.systemlogs;

import java.util.logging.Logger;


import services.systemlogs.StatusRequest;
import services.systemlogs.StoreRequest;
import services.systemlogs.SystemLogClient;
import services.systemlogs.SystemLogsServiceGrpc;
import services.systemlogs.StringResponse;
import services.systemlogs.CreateReportRequest;
import services.systemlogs.SpreadSheetRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;




public class SystemLogClient {

	private static  Logger logger = Logger.getLogger(SystemLogClient.class.getName());
	private static SystemLogsServiceGrpc.SystemLogsServiceBlockingStub blockingStub;
	private static SystemLogsServiceGrpc.SystemLogsServiceFutureStub futureStub;
	private static SystemLogsServiceGrpc.SystemLogsServiceStub asyncStub;
	

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SystemLogsServiceGrpc.newBlockingStub(channel);
		asyncStub = SystemLogsServiceGrpc.newStub(channel);
		futureStub =  SystemLogsServiceGrpc.newFutureStub(channel);
	
	//getStatus();
	//store();
	//getStatus();
	//createReport();
	createLogSpreadSheet();

	}

	
	//Method that sends a request to the server to get status on current System Logs
			public static void getStatus() {

				StatusRequest request = StatusRequest.newBuilder().setRequest("Get Status").build();

				StringResponse response = blockingStub.getStatus(request);

				System.out.println(response.getResponse());
					
			}
	
			//Method that sends a request to the server to get status on current System Logs
			public static void store() {

				StoreRequest request = StoreRequest.newBuilder().setRequest("Store").setKey("Information").setValue("7025 - Dump after return from D3 before cmd ").build();

				StringResponse response = blockingStub.store(request);

				System.out.println(response.getResponse());
					
			}
	
			
			//Method that sends a request to the server to create a System Logs Report
			public static void createReport() {

				StringRequest line1 = StringRequest.newBuilder().setRequest("My name is Patrick Kelly, ").build();
				StringRequest line2 = StringRequest.newBuilder().setRequest("I am currently a student in NCI ").build();
				StringRequest line3 = StringRequest.newBuilder().setRequest("and I love to code").build();
			

				CreateReportRequest req = CreateReportRequest.newBuilder()
						.addMultirequest(line1)			
						.addMultirequest(line2)						
						.addMultirequest(line3)						
						.build();

				StringResponse response = blockingStub.createReport(req);

				System.out.println(response.getResponse());
					
			}
	
			
			//Method that sends a request to the server to get converts all System Logs data into a .csv file.
			public static void createLogSpreadSheet() {

				SpreadSheetRequest request = SpreadSheetRequest.newBuilder().setRequest("Create SpreadSheet").build();

				StringResponse response = blockingStub.createLogSpreadSheet(request);

				System.out.println(response.getResponse());
					
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
