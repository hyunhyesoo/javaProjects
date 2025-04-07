package chapter03;

import java.util.Scanner;

public class Code3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("운전자 합격 조회 프로그램");
        System.out.print("운전자 점수 입력: ");
        int score = s.nextInt();

        if (score >= 70)
        {
            System.out.println("합격");
        } else
        {
            System.out.println("불합격");
        }

//        String result = "";
//        if (score >= 70)
//        {
//            result = "합격";
//        } else
//        {
//          result = "불합격";
//        }
//        System.out.println(result);

        s.close();
    }
}
