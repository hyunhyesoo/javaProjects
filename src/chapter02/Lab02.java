package chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수1 => ");
        int num1 = s.nextInt();
        System.out.print("정수2 => ");
        int num2 = s.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = num1 / (double) num2;
        int mod = num1 % num2;

        System.out.println(num1 + " + " +  num2  + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + mod);

//        System.out.printf("%d + %d = %d\n", num1, num2, add);
//        System.out.printf("%d - %d = %d\n", num1, num2, sub);
//        System.out.printf("%d * %d = %d\n", num1, num2, mul);
//        System.out.printf("%d / %d = %d\n", num1, num2, div);
//        System.out.printf("%d %% %d = %d\n", num1, num2, mod);
        s.close();

    }
}
