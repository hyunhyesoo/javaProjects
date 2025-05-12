package chapter06;

public class ForTest3 {
    public static void main(String[] args) {
        int fac = 1;
        int student = 5;
        for (int i = 1; i <= student; i++) {
            fac *= i;
        }
        System.out.println(student + "명을 순서대로 세우는 경우의 수: " + fac);
    }
}
