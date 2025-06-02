package practice;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        int n, i, j, k;
        int star = 0;
        int space = 0;

        System.out.println("라인 수 입력(최대 10): ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if(n >= 1 && n <= 10)
        {
            for(i = n; i >= 1; i--)
            {
                star = star + 1;
                space = n - 1;
                for(j = 0; j < space; j++)
                {
                    System.out.printf(" ");
                }
                for(k = 0; k < star; k++)
                {
                    System.out.printf("%c", '*');
                }
                System.out.println(" ");
            }
        } else
        {
            System.out.println("1이상 10이하의 정수를 입력하세요");
        }
    }
}
