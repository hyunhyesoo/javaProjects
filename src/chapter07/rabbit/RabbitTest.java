package chapter07.rabbit;

public class RabbitTest {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.setShape("분홍네모");
        rabbit2.setShape("갈색동그라미");
        rabbit3.setShape("파란세모");

        rabbit1.setPosition(50, 60);
        rabbit2.setPosition(100, 80);
        rabbit3.setPosition(150, 50);

        System.out.println(rabbit1);
        System.out.println(rabbit2);
        System.out.println(rabbit3);

        rabbit1.move();
        rabbit2.move();
        rabbit3.move();
    }
}
