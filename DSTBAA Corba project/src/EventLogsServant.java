import EventLogService.EventLogs;
import EventLogService._EventLogsImplBase;
import org.omg.CORBA.ORB;
import java.util.ArrayList;
import java.util.*;

class EventLogsServant extends _EventLogsImplBase {
    private static ArrayList<String> eventLogs = new ArrayList<String>();
    @Override
    public String getStatus() {

        //adding items in fridgeList
        eventLogs.add("Information: Successfully scheduled Software Protection service for re-start at 2120-07-28T11:32:02Z. Reason: RulesEngine.");
        eventLogs.add("Information: Offline downlevel migration succeeded.");
        eventLogs.add("Warning: Certificate for local system with Thumbprint 2a 48 79 41 cb d6 b9 0f 23 7e 22 79 d2 79 ac be 5d 67 5d e1 is about to expire or already expired.");
        eventLogs.add("Information: PowerEvent handled successfully by the service.");
        eventLogs.add("Information: Service stopped.");
        eventLogs.add("Error: Unable to open the Server service performance object. The first four bytes (DWORD) of the Data section contains the status code.");
        String message = "The current number of Event Logs is: " + eventLogs.size() ;
        return message;
    }

    @Override
    public String search() {
        String message;
        String searchParams = "Information: Service stopped.";
        if(eventLogs.contains(searchParams))
        {
            message = "Event log found";
        }
        else
            {
                message = "Event log cannot be found";
            }
        return message;
    }

    @Override
    public String alert() {
        String message = "Email successfully sent to coworker@gmail.com";
        return message;
    }
}
