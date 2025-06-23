package chapter08.section03;

public class MountainRabbit extends Rabbit {

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void run() {
        System.out.println("산토끼가 이 산 저 산 뛰어다닌다");
    }
}
