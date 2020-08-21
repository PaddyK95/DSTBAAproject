import java.io.*;
import org.omg.CORBA.*;



public class EventLogsServer {

    public static void main(String args[]) {
        try {
            //Create and initialize the ORB
            ORB orb = ORB.init(args, null);

            //Instantiate a EventLogsService servant
            EventLogsServant servRef = new EventLogsServant();

            // Register/connect the above servant with the ORB
            orb.connect(servRef);

            //Convert the object reference to a string (using the predefined object_to_string() method)
            String ior = orb.object_to_string(servRef);

            FileOutputStream fos = new FileOutputStream("EventLogServiceIOR");
            PrintStream ps = new PrintStream(fos);
            ps.print(ior);
            ps.close();

            System.out.println("Server is running");

            orb.run();

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }//end catch block
    }//end main()









}
