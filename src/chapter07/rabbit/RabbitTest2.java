package chapter07.rabbit;

public class RabbitTest2 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        System.out.println(rabbit1);

        Rabbit rabbit2 = new Rabbit("분홍코 토끼", 70, 80);
        System.out.println(rabbit2);
    }
}
