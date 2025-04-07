package chapter03;

import java.util.Scanner;

public class Code3_07 {
    public static void main(String[] args) {
       double lb = 0.453592;
        double kg = 2.204623;
        Scanner s = new Scanner(System.in);

        System.out.print("파운드(lb)를 입력하세요: ");
        int num1 = s.nextInt();
        double result1 = num1 * lb;
        System.out.printf("%d파운드(lb)는 %.f킬로그램(kg)입니다.\n", num1, result1);

        System.out.print("킬로그램(kg)를 입력하세요: ");
        int num2 = s.nextInt();
        double result2 = num2 * kg;
        System.out.printf("%d킬로그램(kg)는 %.f파운드(lb)입니다.\n", num2, result2);
        s.close();

//        Scanner s = new Scanner(System.in);
//        double pnd, kg;
//
//        System.out.println("파운드입력 ");
//        pnd = s.nextDouble();
//        double rst = pnd * 2.204623;
//        System.out.printf("%d파운드는 %f킬로그램 \n", (int)pnd, rst);
//
//        System.out.println("킬로그램입력 ");
//        kg = s.nextDouble();
//        double rst2 = kg * 0.453592;
//        System.out.printf("%d킬로그램은 %f파운드 \n", (int)kg, rst2);
        // 위의 코드가 더 효율적임

    }
}
