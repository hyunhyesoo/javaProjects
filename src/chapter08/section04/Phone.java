package chapter08.section04;
//인터페이스
//new 연산자로 객체 생성 불가능
//필드: 상수, 메서드: 추상메서드(예외적으로 default 키워드를 붙여서 메서드 구현 가능)
// 인터페이스 용도:
//약속을 정해 놓고 약속을 지킨 클래스들만 만들 수 있다.
//공동작업으로 프로젝트할 때 많이 사용한다(메서드 이름, 반환형, 매개변수를 중간에 수정이나 삭제하지 못하도록)
//인터페이스를 상속받은 "클래스"는 추상메서드 외에 일반적인 다른 메서드도 구현 가능

//인터페이스의 필드는 상수로만 사용 가능: 항상 같은 값을 갖는 필드
//static final 키워드 생략 가능(원래 상수가 되려면 둘을 붙여서 키워드 선언해야 함)
public interface Phone {
    String name = "Phone";

    //인터페이스는 public과 abstract를 생략할 수 있다(생락해도 추상메서드로 인식)
    void callPhone(String phoneNumber);
    public abstract void receivePhone(String phoneNumber);
}
