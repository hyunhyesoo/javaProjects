package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");

        System.out.print("받는 사람: ");
        String name = s1.nextLine();
        System.out.print("주소: ");
        String address = s1.nextLine();
        System.out.print("무게(g): ");
        int weight = s1.nextInt();
        // int price = weight * 5
        System.out.println("*받는 사람 => " + name + "님");
        System.out.println("*주소 => " + address);
        System.out.println("*배송비 => " + (weight * 5) + "원");
        // "배송비 => " + price + "원"

        s1.close();
        s2.close();
    }
}
