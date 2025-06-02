package chapter07.rabbit;

public class Rabbit {
    //속성: 모양, x, y
    String shape;
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    //이동(기능)
    public void move() {
        System.out.println("토끼가 (" + x + ", " + y + ") 좌표로 이동한다");
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "shape='" + shape + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
