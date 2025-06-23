package chapter08.section04;

public class TelePhone implements Phone {

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println("TelePhone Calling " + phoneNumber);
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("TelePhone Receive " + phoneNumber);
    }

    public void answeringMachine(String message) {
        System.out.println("Telephone message " + message);
    }
}
