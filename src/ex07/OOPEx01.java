package ex07;

class Cara { // static이 없어서 메모리에 뜨지 않음
    static int speed = 90;
}

public class OOPEx01 {
    // int num = 10; // static이 없어서 뜨지 않음, main만 실행하기 때문
    static int num = 10; // static 공간에 int num = 10;이라는 메모리 저장

    public static void main(String[] args) {
        System.out.println(Cara.speed); // (클래스 주소.변수)
        System.out.println(num); // 해당 클래스 안에 들어가 있으면 클래스명 생략 가능
    }
}
