import EventLogService.*;
import org.omg.CORBA.*;
import java.io.*;

public class EventLogsClient {


    public static void main(String args[]) {
        try {
            // Initialize the ORB
            ORB orb = ORB.init(args, null);

            // Read the object Reference for the EventLogServant
            BufferedReader br = new BufferedReader(new FileReader("EventLogServiceIOR"));
            String ior = br.readLine();
            // Convert the string object reference to an object
            org.omg.CORBA.Object obj = orb.string_to_object(ior);
            // Convert the object to the correct type i . e . Hello
            EventLogs eventLogsRef = EventLogsHelper.narrow(obj);
            // Call theoperation on the servant

            String status = eventLogsRef.getStatus();
            String search = eventLogsRef.search();
            String alert = eventLogsRef.alert();

            System.out.println(status);
            System.out.println(search);
            System.out.println(alert);
        } catch (Exception e) {
            System.out.println(" ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }










}
