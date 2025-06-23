package chapter08.LAB_section2;

public class SchoolBus extends Car{
    @Override
   public void speedUp(int speed) {
        super.speedUp(speed);

        if (getSpeed() > 60) {
            setSpeed(60);
        }
    }
}
