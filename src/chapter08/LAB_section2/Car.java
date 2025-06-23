package chapter08.LAB_section2;

public class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp(int speed) {
        this.speed += speed;
    }
}
