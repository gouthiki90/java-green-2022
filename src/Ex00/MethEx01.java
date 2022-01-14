package Ex00;

// 계산기
// 상태와 행위는 꼭 필요한 것은 아니다.
class Calculator { // 라이브러리, 여러가지 모듈을 가지고 있고 재활용이 가능하다.
    // add 뒤에 있는 ()는 입구이다.
    // void는 출구가 없다.
    void add(int n1, int n2) { // 입구가 2개, 인수
        System.out.println("더하기 메서드 입니다.");
        System.out.println(n1 + n2);
    }

    void minus(int n1, int n2) {
        System.out.println("빼기 메서드 입니다.");
        System.out.println(n1 - n2);

    }

    // multi(곱하기)
    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드 입니다.");
        System.out.println(n1 * n2);
    }

    // divide(나누기)
    void divide(int n1, int n2) {
        System.out.println("나누기 메서드 입니다.");
        System.out.println(n1 / n2);
    }

}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(); // heap에 데이터 띄우기
        c1.add(10, 5); // 호출할 때는 입구에 알맞은 값을 입력한다.

        Calculator c2 = new Calculator();
        c2.minus(10, 5);

        Calculator c3 = new Calculator();
        c3.multi(10, 5);

        Calculator c4 = new Calculator();
        c4.divide(10, 5);

        /**
         * 아니면 이렇게도 가능하다.
         * c1.add(10, 5);
         * c1.minus(10, 5);
         */
    }

}
