package chapter08.section03;

public class HouseRabbit extends Rabbit {

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
