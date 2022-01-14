package ex07;

public class MethodEx01 { // 자바는 모든 코드가 클래스 내부에 있어야 한다.

    static void add(int n1) {
        System.out.println("받은 숫자는" + n1);
    }

    public static void main(String[] args) {
        // MethodEx01.add("5000"); // 인수가 같은 타입이 아니기 때문에 성립되지 않음
        MethodEx01.add(5000); // 메서드 호출
    }
}
