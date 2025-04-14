package chapter04;

import java.util.Scanner;

public class Code4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an decinal String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter an decinal String2: ");
        String str2 = sc.nextLine();

        int diffNum = str1.length() - str2.length();
        System.out.println("String1 And String2 difference String: " + diffNum);
        sc.close();
    }
}
