package ex11;

abstract class 애완동물 {
    // 상속으로 추상화, extends, 추상 클래스, new 하면 안 뜬다.
    void sound() {
    };
    // 자식과 같은 메소드라서 무효화 (오버라이드)
    // 추상 메서드라고 부른다.
}

class 강아지 extends 애완동물 { // 다형성
    void sound() { // 여기서부터 밑으로 내려감
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {
    void sound() {
        System.out.println("야옹");
    }
}

public class ExtendsEx03 {

    static void start(강아지 u1) {
        u1.sound();
    }

    static void start(고양이 u1) { // 오버로딩, 타입이 달라서 다른 함수로 인식
        u1.sound();
    }

    public static void main(String[] args) {
        // 강아지 u1 = new 강아지();
        // start(new 강아지()); 이렇게도 가능하다.
        // 힙 만들면서 start에 있는 u1.sound 불러와서 적용, 출력까지 가능하다.
        // 그러면 힙 만들면서 start stack이랑 main stack까지 만들 수 있는 셈이다.
        start(new 강아지());
        start(new 고양이());
    }
}
