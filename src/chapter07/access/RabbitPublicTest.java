package chapter07.access;

public class RabbitPublicTest {
    public static void main(String[] args) {
        RabbitPublic r1 = new RabbitPublic();
        r1.shape = "Circle";
        r1.x = 70;
        r1.y = 30;

        System.out.println("토끼 모양: " + r1.shape);
        System.out.println("토끼 위치: (" + r1.x + "," + r1.y + ")");

        System.out.printf("토끼 모양은 [%s]입니다.", r1.shape);
        System.out.printf("토끼 위치는 (%d, %d)입니다.", r1.x, r1.y);
    }
}
