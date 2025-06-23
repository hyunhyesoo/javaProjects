package chapter08.section03;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit h = new HouseRabbit();
        MountainRabbit m = new MountainRabbit();

        h.move(10, 20);
        m.move(100, 200);

        m.run();

        h.shape = "Circle ";
        h.eat("grass");
    }
}
