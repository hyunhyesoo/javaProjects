package chapter04;

public class DatatypeTest {
    public static void main(String[] args) {
        //숫자가 아닌 자료형 boolean, char
        boolean boo1 = false;
        boolean boo2 = 100 > 200; //false
        boolean boo3 = !boo1; //true

        char ch1 = 'A';
        char ch2 = 97;
        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);
        System.out.println("ch1 + 3: " + (char)(ch1 + 3));
        //ch1 + 3 = 68, (char)붙이면 68 해당 문자 출력

        //숫자 자료형 정수형, 실수형
        //정수형 byte, short, int, long
        //byte byte1 = 128;->overflow
        byte byte2 = 127;
        byte byte3 = -128;
        //byte byte4 = -129;->underflow
        byte byte4 = byte2;
        System.out.println("byte2: " + byte2);
        System.out.println("byte4: " + byte4);

        short short1 = 128;
        short short2 = byte2;
        // byte4 = short1 - 1;-> 숫자는 127이지만 계산이 short형으로 되기 때문에 byte에 대입 불가능

        int int1 = byte2;
        int int2 = short1;
        int int3 = 1000000000; //약 -21억 ~ 21억까지

        long long1 = byte2;
        long long2 = short1;
        long long3 = int1;
        long long4 = (long)Math.pow(10, 10);
        System.out.println("long4: " + long4);

        //실수형 float, double
        float float1 = 123.456f;//f 안붙이면 double로 인식해서 float에 대입 불가능
        float float2 = (float)123.456;//형변환 연산자로 써도 가능
        float float3 = short1;
        float float4 = 100;//100.0은 안되지만 100은 가능

        double double1 = 123.456;
        double double2 = float1;
        double double3 = byte2;
        double double4 = long3;
        //실수형에는 모든 정수형 대입 가능

        //참조형 클래스, 인터페이스
        String str1 = new String("hello");
        str1 = "hello";
        String str2 = new String("hello");

        boolean bool4 = str1 == str2;
        System.out.println("str1 == str2: " + bool4);
        // hello는 같지만 주소값이 달라서 false가 됨
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        //equals는 문자열 비교
    }
}
