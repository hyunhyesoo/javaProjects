package chapter08.section04;

public class PhoneTest {
    public static void main(String[] args) {
        //Phone phone = new Phone(); 인터페이스는 NEW 연산자로 객체 생성 불가
        TelePhone telePhone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telePhone.answeringMachine("지금은 전화를 받을 수 없습니다. 음성 메시지를 남겨주세요.");
        telePhone.callPhone("010-1234-5678");
        telePhone.receivePhone("010-1234-5678");

        featurePhone.sendSMS("010-9876-5432", "인터페이스를 배우고 있어요");

        smartPhone.installApp("카카오톡");
    }
}
