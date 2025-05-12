package chapter06;

public class ForTest4 {
    public static void main(String[] args) {
        int n = 1000;
        int hap = 0;
        for (int i = 1; i <= n; i++) {
            hap += i;
        }
        System.out.println("1부터 " + n + "까지의 합: " + hap);
    }
}
