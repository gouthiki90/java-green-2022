package ex05;

public class OperEx02 {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(1 == 1);
        System.out.println(!true); // "!"는 부정을 의미
        System.out.println(!(1 == 1)); // 1 == 1를 괄호로 감싸서 부정하기, 1 자체로는 불린 타입이 아니라서 감싸줘야 함
        // 괄호는 우선순위를 지정할 수 있다.
        System.out.println(!true == true); // answer is false
        System.out.println(1 != 1); // "!=" 같지 않다를 의미, answer is flase
        System.out.println(1 < 2); // answer is true, 1은 2보다 큰가 작은가
        System.out.println(1 > 2); // answer is flase
    }
}
