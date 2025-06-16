package chapter08;

public class RabbitTest1 {
    public static void main(String[] args) {

        System.out.println("Rabbit 객체 생성 전의 토끼 객체의 수: " + Rabbit.count);

        Rabbit r1 = new Rabbit();
        System.out.println("첫번째 Rabbit 객체 생성 후의 토끼 객체의 수: " + Rabbit.RABBIT_NAME + Rabbit.count);
        //r1.cnt 로 실행해도 동일한 결과 나옴
        Rabbit r2 = new Rabbit();
        System.out.println("두번째 Rabbit 객체 생성 후의 토끼 객체의 수: " + Rabbit.RABBIT_NAME + Rabbit.count);
        //r2.cnt 로 실행해도 동일한 결과 나옴
    }
}

