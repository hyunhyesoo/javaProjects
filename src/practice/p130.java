package practice;

import java.util.Scanner;

public class p130 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("시험 과목의 수를 입력하세요: ");
        int subject = s.nextInt();
        int i;
        double totalGrade = 0;
        double totalScore = 0;
        double avg;

        for (i = 1; i <= subject; i++)
        {
            System.out.println("과목명, 이수학점, 성적을 입력하세요: ");
            String sub = s.next();
            int grade = s.nextInt();
            double score = s.nextDouble();
            System.out.println("과목명: " + sub + " 이수학점: " + grade + " 성적: " + score);
            System.out.println("");

            totalScore += grade * score;
            totalGrade += grade;
        }
        avg = totalScore / totalGrade;
        avg = Math.round(avg * 100.0) / 100.0;

        System.out.println("평균 학점: " + avg);

        s.close();
    }
}
