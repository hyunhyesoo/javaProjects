package chapter06;

import java.util.Scanner;

public class ForTestArray {
    public static void main(String[] args) {
        String [][] teamNames = {{"김김", "이이", "박박", "최최"}, {"송송", "강강", "정정"}, {"서서", "조조", "원원", "현현"}};

        for (int i = 0; i < teamNames.length; i++) {
            System.out.print(i + 1 + "팀: ");
            for (int j = 0; j < teamNames[i].length; j++) {
                System.out.printf("%s\t", teamNames[i][j]);
            }
            System.out.println();
        }
    }
}
