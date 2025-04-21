package chapter05;

import java.util.Scanner;

public class LAB_Chapter05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myHand, comHand;

        System.out.println("나의 가위바위보: ");
        myHand = sc.nextLine();

        String hand[] = {"가위", "바위", "보"};
        int rdm = (int) (Math.random() * hand.length);
        comHand = hand[rdm];
        System.out.println("컴퓨터의 가위바위보: " + comHand);

        if (myHand.equals("가위")) {
            if (comHand.equals(hand[0])) {
                System.out.println("비겼습니다.ㅡ.ㅡ");
            }
            else if (comHand.equals(hand[1])) {
                System.out.println("졌습니다.ㅠ.ㅠ");
            }
            else if (comHand.equals(hand[2])) {
                System.out.println("이겼습니다.^.^");
            }
        }
        else if (myHand.equals("바위")) {
            if (comHand.equals(hand[0])) {
                System.out.println("이겼습니다.^.^");
            }
            else if (comHand.equals(hand[1])) {
                System.out.println("비겼습니다.ㅡ.ㅡ");
            }
            else if (comHand.equals(hand[2])) {
                System.out.println("졌습니다.ㅠ.ㅠ");
            }
        }
        else if (myHand.equals("보")) {
            if (comHand.equals(hand[0])) {
                System.out.println("졌습니다.ㅠ.ㅠ");
            }
            else if (comHand.equals(hand[1])) {
                System.out.println("이겼습니다.^.^");
            }
            else if (comHand.equals(hand[2])) {
                System.out.println("비겼습니다.ㅡ.ㅡ");
            }
        }
        else {
            System.out.println("가위 바위 보 중 하나를 입력하세요");
        }
//사용자가 중지하기 전까지 반복하고 싶으면 while문 쓰면 됨

    }
}
