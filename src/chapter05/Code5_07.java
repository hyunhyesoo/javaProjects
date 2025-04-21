package chapter05;

import java.util.Scanner;

public class Code5_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학점 프로그램\n");
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        String result = "";

        if (score >= 90)
            result = "A";
            else if (score >= 80)
                result = "B";
            else if (score >= 70)
                result = "C";
            else if (score >= 60)
                result = "D";
            else
                result = "F";

        System.out.printf("\n%d점은 %s학점입니다.", score, result);
    }
}
