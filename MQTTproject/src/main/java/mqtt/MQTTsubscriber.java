package mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MQTTsubscriber {

    public static void main(String[] args) {

        String broker = "tcp://localhost:1883";
        String clientId = "Subscriber";
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            MqttClient Client = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            Client.setCallback(new Subscriber());

            System.out.println("Connecting to broker: " + broker);
            Client.connect(connOpts);
            System.out.println("Connected");
            Client.subscribe("/CentralisedLogManagement/systemLogs");


        } catch (MqttException me) {
            System.out.println("reason " + me.getReasonCode());
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        }
    }

}
