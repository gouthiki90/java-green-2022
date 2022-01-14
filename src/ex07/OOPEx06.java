package ex07;

class 질럿 { // heap에 생성
    String name = "질럿"; // object
    int hp = 100; // heap 변수
    int attack = 10;
}

public class OOPEx06 {
    public static void main(String[] args) {
        질럿 z1 = new 질럿(); // heap에서 총 3개 생성
        질럿 z2 = new 질럿(); // 인스턴스
        질럿 z3 = new 질럿();

        z1.hp = 50;
        z2.hp = 70;
        z3.hp = 1;

        System.out.println("질럿 1의 hp는:" + z1.hp); // 인스턴스 생성
        System.out.println("질럿 2의 hp는:" + z2.hp);
        System.out.println("질럿 3의 hp는:" + z3.hp);
    }
}
