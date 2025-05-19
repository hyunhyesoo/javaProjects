package chapter06;

import java.util.Scanner;

public class ComputerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int com, user;

        for(int i = 0; i < 10; i++) {
            com = (int)(Math.random() * 10 + 1);
            System.out.printf("게임 %d회: 컴류터가 생각한 숫자는?", i + 1);
            user = sc.nextInt();

            if(com == user) {
                System.out.print("맞혔어요 축하합니다.");
                break;
            }else {
                System.out.printf("아까워요. %d였는데요. 다시 해보세요ㅠ\n", com);
            }
        }
    }
}
