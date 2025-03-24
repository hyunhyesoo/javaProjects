package chapter02;

public class Code02_09 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        double result;

        result = num1 + num2;
        System.out.printf("%d + %d = %.2f\n", num1, num2, result);//실수형은 어느 자리까지 출력할건지 선택 가능(.1f, .2f 등등)

        result = num1 / (double)num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, result);//정수를 정수형으로 나누면 결과는 정수형만 저장됨
        
    }
}
