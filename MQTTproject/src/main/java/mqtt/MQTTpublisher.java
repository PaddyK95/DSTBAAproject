package mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MQTTpublisher {

    public static void main(String[] args) {

        String topic1 = "/CentralisedLogManagement/systemLogs";
        String content1 = "System Logs: 56 information, 5 Warning and 2 Errors logs found in the last 60 minutes ";

        int qos = 2;
        String broker = "tcp://localhost:1883";
        String clientId = "Publisher";
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: " + broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");

            System.out.println("Publishing message: " + content1);
            MqttMessage message1 = new MqttMessage(content1.getBytes());
            message1.setQos(qos);
            sampleClient.publish(topic1, message1);

            System.out.println("Messages published");
            sampleClient.disconnect();
            System.out.println("Disconnected");

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
