package chapter06;

import java.util.ArrayList;

public class ForTest {
    public static void main(String[] args) {
        String[] names = {"빨강", "주황", "노랑", "초록", "파랑", "남색", "보라"};

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ": " + names[i]);
        }

//        for(String name: names) {
//            System.out.println(name);
//        } enhanced for문
    }
}
