package ex07;

// 설계도 생성
class 마법사 {
    int hp = 30;
    int mp = 100;

    // 행위 = 메서드
    // 1. 행위는 행위 안에 추가할 수 없다.
    // 2. 행위는 메서드 이름 + () + {} 로 만들어진다.
    void drink() { // method name
        System.out.println("에너지 마시기");
        hp = 100;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        마법사 s1 = new 마법사();
        System.out.println("첫 번째 마법사가 생성되었습니다");
        System.out.println("체력 : " + s1.hp);
        System.out.println("마나 : " + s1.mp);

        // 마법 금지 = 상태는 행위를 통해 변경한다.
        // s1.hp = 50; // s1의 hp를 변경
        // System.out.println("체력 변경 : " + s1.hp);

        s1.drink(); // method call
        System.out.println("체력 : " + s1.hp); // hp = 100; 불러옴

        마법사 s2 = new 마법사();
        System.out.println("두 번째 마법사가 생성되었습니다");
        System.out.println("체력 : " + s2.hp);
        System.out.println("마나 : " + s2.mp);
    }
}
