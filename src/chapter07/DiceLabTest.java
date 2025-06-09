package chapter07;

import chapter07.access.Dice;

public class DiceLabTest {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();

        int count = 0;
        while(true) {
            count++;
            d1.setNum((int)(Math.random()*6 + 1));
            d2.setNum((int)(Math.random()*6 + 1));
            d3.setNum((int)(Math.random()*6 + 1));

            if(d1.getNum() == d2.getNum() && d1.getNum() == d3.getNum())
                break;

            System.out.printf("3개 주사위는 모두 " + d1.getNum() + "입니다.\n");
            System.out.printf("같은 숫자가 나올 때까지 " + count + "번 던졌습니다.");
        }
    }
}
