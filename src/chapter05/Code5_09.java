package chapter05;

import java.util.Calendar;

public class Code5_09 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); //0-6

        System.out.println("현재요일 번호: " + day);
        char daych = 0;

        switch (day) {
            case 1: daych = '일';
            //case Calender.SUNDAY: daych = '일';->이렇게 쓰면 가독성이 훨씬 높아짐
            break;
            case 2: daych = '월';
            break;
            case 3: daych = '화';
            break;
            case 4: daych = '수';
            break;
            case 5: daych = '목';
                break;
            case 6: daych = '금';
                break;
            case 7: daych = '토';
                break;
        }
        System.out.println("오늘은 " + daych + "요일입니다.");
    }
}
