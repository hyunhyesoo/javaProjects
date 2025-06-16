package chapter08.section02;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit h1 = new HouseRabbit();
        MountainRabbit m1 = new MountainRabbit();
        //shape 필드와 move 메서드에 private 접근제한자로 인해 subclass가 접근 불가능
        //superclass와 subclass가 [같은] 패키지 내에 있을 대 접근 가능하려면: public, default, protected
        //superclass와 subclass가 [다른] 패키지 내에 있을 대 접근 가능하려면: public, protected
        h1.ownerName = "오폴리";
        //h1.shape = "그라미";
        //h1.move(50, 70);
        h1.eatFeed();

        m1.mountainName = "한라산";
        //m1.shape = "네모네모";
        //m1.move(200, 700);
        m1.eatWildgrass();

    }
}
