package chapter08;

public class Rabbit {
    String shape;
    int x;
    int y;
    static int count;
    static final String RABBIT_NAME = "Rabbit"; //상수는 final 붙여서 선언, 대문자 사용

    public Rabbit() {
        count++;
    }
}
