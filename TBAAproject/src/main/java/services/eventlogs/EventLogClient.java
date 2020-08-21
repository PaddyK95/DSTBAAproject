package services.eventlogs;

import java.util.logging.Logger;

import services.eventlogs.AlertRequest;
import services.eventlogs.SearchRequest;
import services.eventlogs.StatusRequest;
import services.eventlogs.StringResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;



public class EventLogClient {
	
	private static  Logger logger = Logger.getLogger(EventLogClient.class.getName());
	private static EventLogsServiceGrpc.EventLogsServiceBlockingStub blockingStub;
	private static EventLogsServiceGrpc.EventLogsServiceFutureStub futureStub;
	private static EventLogsServiceGrpc.EventLogsServiceStub asyncStub;
	
	
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = EventLogsServiceGrpc.newBlockingStub(channel);
		asyncStub = EventLogsServiceGrpc.newStub(channel);
		futureStub =  EventLogsServiceGrpc.newFutureStub(channel);
		
		//getStatus();
		//search();
		alert();
		
	}
	
	//Method that sends a request to the server to get Status on all current Event Logs
		public static void getStatus() {

			StatusRequest req = StatusRequest.newBuilder().setRequest("Get Status").build();

			StringResponse response = blockingStub.getStatus(req);

			System.out.println(response.getResponse());
			
			
		}
	
		//Method that sends a request to the server to search for an Event Log using search parameters
				public static void search() {

					SearchRequest searchRequest = SearchRequest.newBuilder().setRequest("Search").setParameter("Error Logs").build();

					StringResponse response = blockingStub.search(searchRequest);

					System.out.println(response.getResponse());
					
					
				}
	
				//Method that sends a request to the server to send an alert to another users via email.
				public static void alert() {

					AlertRequest alertRequest = AlertRequest.newBuilder().setRequest("Alert").setEmail("paddyk95@hotmail.com").setMessage("Message regarding event logs here").build() ;

					StringResponse response = blockingStub.alert(alertRequest);

					System.out.println(response.getResponse());
					
					
				}
	
	
	
	

}
