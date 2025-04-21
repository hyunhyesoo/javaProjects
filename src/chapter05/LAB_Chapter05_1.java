package chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class LAB_Chapter05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------PC방 출입시간 제한-------");
        System.out.print("출생년도 입력(4자리 정수): ");
        int birthYear = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        int nowYear = cal.get(Calendar.YEAR); //Calendar.MONTH 등 여러가지 있음

        int age = nowYear - birthYear;
        String resultStr = "";

        if (age >= 18) {
            resultStr = "즐거운 시간 보내세요";
        }
        else {
            resultStr = "집에 갈 시간이에요";
        }
        System.out.println("귀하의 나이는 " + age + "세이므로 " + resultStr);
        System.out.println("협조해주셔서 감사합니다");
        sc.close();

    }
}
