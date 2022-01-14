package ex07;

/**
 * 클래스 문법
 * 1. 클래스 내부 변수는 (상태)는 선언만 한다.
 */

class 사람 {
    String name;
    int height;
    int weight;
}

public class OOPEx07 {
    public static void main(String[] args) {
        사람 s1 = new 사람(); // 저장 영역이 달라도 변수가 있으면 찾을 수 있다.
        s1.name = "홍길동";
        s1.height = 50;
        s1.weight = 5;
        System.out.println(s1.name);
        System.out.println(s1.height);
        System.out.println(s1.weight);

        사람 s2 = new 사람();
        s2.name = "장보고";
        s2.height = 100;
        s2.weight = 8;
        System.out.println(s2.name);
        System.out.println(s2.height);
        System.out.println(s2.weight);

        사람 s3 = new 사람();
        s3.name = "임꺽정";
        s3.height = 70;
        s3.weight = 10;
        System.out.println(s3.name);
        System.out.println(s3.height);
        System.out.println(s3.weight);
    }
}
