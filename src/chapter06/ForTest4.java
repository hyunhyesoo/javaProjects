package chapter06;

public class ForTest4 {
    public static void main(String[] args) {
        int n = 1000;
        int hap = 0;
        String oddeven = "";
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0)
            hap += i;
            oddeven = "홀수";
        }
        System.out.println("1부터 " + n + "까지의 " + oddeven + " 합: " + hap);
//        System.out.println("1부터 " + n + "까지의 합: " + hap);
    }
}
