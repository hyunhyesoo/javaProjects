package chapter06;

public class DiceGame {
    public static void main(String[] args) {
        //1. 지역변수 선언(반복횟수, 주사위숫자 저장(3개)하는 변수들
        int count = 0;
        int dice1 = 0, dice2 = 0, dice3 = 0;

        //2. 무한루프 , 반복횟수 저장하는 변수를 1씩 증가
        while (true) {
            count++;
        //3. 1-6까지의 임의의 숫자를 구해서 주사위 변수에 각각 저장한 후 3개의 값이 같은지 비교해서 같으면 반복문을 빠져나간다.
            dice1 = (int)(Math.random()*6 + 1);
            dice2 = (int)(Math.random()*6 + 1);
            dice3 = (int)(Math.random()*6 + 1);

            if((dice1 == dice2) && (dice2 == dice3)) {
                break;
            }
        }
        //4. 출력: 3개의 주사위의 같은 숫자, 같아지는 반복 횟수
        System.out.printf("3개 주사위는 모두 %d입니다\n", dice1);
        System.out.printf("같은 숫자가 나올 때 까지 %d번 던졌습니다.", count);
    }
}
