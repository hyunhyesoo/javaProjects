package chapter07;

public class Car {
    //속성과 기능
    //속성은 field
    //기능은 method
    //alt + insert 누르면 get,set 쉽게 만들 수 있음

    //속성
    private String name;
    private String product;
    private int price;
    private int year;
    private int cc;

    public String getName() {
        return name; //매개변수가 없으면 this.을 생략 가능
    }

    public void setName(String name) {
        this.name = name; //필드의 name과 매개변수의 name, 둘을 구분하기 위해 this.을 붙여서 필드 값임을 나타냄
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    //메서드(기능)
    public void start() {
        System.out.println("시동을 건다");
    }

    public void drive(int speed) {
        System.out.println("시속 " + speed + "km로 달린다");
    }

    public void forward() {
        System.out.println("전진한다");
    }

    public void backward() {
        System.out.println("후진한다");
    }

    public void stop() {
        System.out.println("정지한다");
    }

    public String toString() {
        return "Car: " + "name" + name + '\'' +
                "product" + product + '\'' +
                "price" + price + '\'' +
                "year" + year + '\'' +
                "cc" + cc;
    }
}
