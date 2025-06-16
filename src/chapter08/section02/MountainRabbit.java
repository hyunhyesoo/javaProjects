package chapter08.section02;

public class MountainRabbit extends Rabbit{
    String mountainName;

    public MountainRabbit() {
        super();
        System.out.println("3.MountainRabbit의 생성자가 실행됨");
    }

    void eatWildgrass(){
        System.out.println("산토끼는 풀을 먹는다.");
    }
}
