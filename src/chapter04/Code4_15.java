package chapter04;

public class Code4_15 {
    public static void main(String[] args) {
        String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재밌네요.";

        System.out.println(str.indexOf("처음"));
        System.out.println(str.indexOf("처음"));
        System.out.println(str.indexOf("처음", 6));
        System.out.println(str.indexOf("처음", 11));

        String str2 = "Java";
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(1));
        System.out.println(str2.charAt(2));
        System.out.println(str2.charAt(3));
//        System.out.println(str2.charAt(4));

        System.out.println(str2.substring(2, 4));
    }
}
