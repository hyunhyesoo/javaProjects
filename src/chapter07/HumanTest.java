package chapter07;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.name = "김폴리";
        human1.age = 20;

        human2.name = "박인공";
        human2.age = 23;

        human1.walk("학생식당");
        human1.eat("학식");

        human2.walk("구름파스타");
        human2.eat("알리오올리오");
    }
}
