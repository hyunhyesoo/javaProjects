package chapter08.section04;

public class FeaturePhone implements Phone {

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println("FeaturePhone Calling " + phoneNumber);
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("FeaturePhone Receive " + phoneNumber);
    }

    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber);
        System.out.println(message);
    }
    public void receiveSMS(String phoneNumber, String message) {
        System.out.println("Receive SMS from " + phoneNumber);
        System.out.println(message);
    }
}
