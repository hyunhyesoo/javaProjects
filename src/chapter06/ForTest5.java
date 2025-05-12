package chapter06;

public class ForTest5 {
    public static void main(String[] args) {
        int n = 1000;
        int hap = 0;
        for (int i = 500; i <= n; i+=2) {
                hap += i;
        }
//        for (int i = 500; i <=1000; i++) {
//            if (i % 2 == 0)
//                hap += i;
//        }
        System.out.println("500부터 " + n + "까지의 짝수의 합: " + hap);
    }
}
