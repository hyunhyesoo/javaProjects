package chapter08.LAB_section2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        SchoolBus schoolBus = new SchoolBus();
        SportsCar sportsCar = new SportsCar();

        Scanner s = new Scanner(System.in);
        int accel = 0;

        while (true) {
            System.out.printf("가속할 속도 (-1 입력 시 종료)==> ");
            accel = s.nextInt();
            System.out.println(accel);

            if (accel == -1) {
                System.out.println("자동차가 멈춥니다");
                break;
            }

            schoolBus.speedUp(accel);
            sportsCar.speedUp(accel);

            System.out.println("스쿨버스의 현재 속도 ==> " + schoolBus.getSpeed());
            System.out.println("스포츠카의 현재 속도 ==> " + sportsCar.getSpeed());
        }
    }

}
