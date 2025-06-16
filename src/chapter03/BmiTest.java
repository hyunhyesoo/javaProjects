package chapter03;

import java.util.Scanner;

public class BmiTest {
    public static void main(String[] args) {
//        double kg, cm, m, bmi;
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("체중(kg)을 입력하세요: ");
//        kg = s.nextDouble();
//        System.out.print("키(cm)를 입력하세요 ");
//        cm = s.nextDouble();
//
//        m =cm / 100;
//        bmi = kg / Math.pow(m,2);
//
//        System.out.printf("당신은 체중 %.1f kg, 키 %.1f cm이므로 BMI지수가 %.1f kg / m2 입니다.", kg, cm, bmi);
        Scanner s = new Scanner(System.in);
        System.out.print("체중 입력: ");
        double weight = s.nextDouble();
        System.out.print("키 입력: ");
        double height = s.nextDouble();

        double bmi = weight / Math.pow((height / 100), 2);

        System.out.printf("체중은 %.2f, 키는 %.2f이므로 bmi지수는 %.2f(kg/m^2)입니다. \n", weight, height, bmi);
        // m^2 = 거듭제곱 나타내기
        // ㎡ -> ㄹ + 한자 키 누르면 나옴
    }
}
