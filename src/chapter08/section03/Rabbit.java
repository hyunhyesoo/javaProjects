package chapter08.section03;
//추상클래스
//추삳클래스는 new연산자를 사용한 객체 생성이 불가능
//추상클래스가 객체화(메모리에 할당)되어서 필드와 메서드를 사용하려면
//자식(서브)클래스를 통해 객체화해서 사용한다
//추상클래스의 용도: 자식클래스들에게 특정 기능들을 표준화시키기 위해 사용한다
//표준화시키는 메서드: 추상메서드(abstract)
//중괄호로 실제 구현하지 않음(;으로 끝남)
abstract public class Rabbit {
    String shape;
    int x, y;
    abstract public void move(int x, int y);

    //중괄호는 구현 메서드, 세미콜론은 선언 메서드
    public void eat(String food) {
        System.out.println(shape + "Rabbit eat " + food);
    }
}
