package chapter06;

public class ForTest6 {
    public static void main(String[] args) {

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.printf("인공지능소프트웨어과 알고리즘 실습: (i: %d, j: %d) \n", i, j);
//            }
//        }
//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%d x %d = %d\t", i, j, (i * j));
//            }
//            System.out.printf("\n");
//        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d x %d = %d\t", j, i, (i * j));
            }
            System.out.printf("\n");
        }
    }
}
