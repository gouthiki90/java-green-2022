package Ex00;

class Calculator2 {
    // 투입구와 출구가 모두 있는 메서드이다.
    static int add(int a1, int a2) {
        return a1 + a2; // add의 stack queue를 불러온다.
    }

    // minus, multi, divide 생성

    static int minus(int a1, int a2) {
        return a1 - a2;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }

    static int divide(int a1, int a2) {
        return a1 / a2;
    }

}

public class MethEx02 {
    public static void main(String[] args) {
        int r1 = Calculator2.add(10, 20); // return을 통해서 30이라는 결과가 나타난다. 인수 선언.
        System.out.println("r1 --" + r1); // 30

        int r2 = Calculator2.minus(10, 20); // 10
        System.out.println("r2 --" + r2);

        int r3 = Calculator2.multi(10, 20); // 200
        System.out.println("r3 --" + r3);

        int r4 = Calculator2.divide(10, 20); // 0
        System.out.println("r4 --" + r4);
    }
}
