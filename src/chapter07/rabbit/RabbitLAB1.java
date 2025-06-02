package chapter07.rabbit;

import java.util.Scanner;

public class RabbitLAB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit rabbit = new Rabbit();
        int x = 0;
        int y = 0;

        while (true) {
            System.out.printf("토끼 이동 좌표 => ");
            x = sc.nextInt();
            y = sc.nextInt();

            rabbit.setPosition(x, y);
            rabbit.move();
        }
    }
}
