package mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Subscriber implements MqttCallback {

    public Subscriber() {
    }


    public void connectionLost(Throwable thrwbl) {
    }


    public void messageArrived(String string, MqttMessage mm) throws Exception {
        System.out.println(mm + " arrived from topic " + string);
    }


    public void deliveryComplete(IMqttDeliveryToken imdt) {
    }




}
