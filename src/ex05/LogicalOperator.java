package ex05;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3; // stack에 메모리 저장, static에서 동적으로 띄어놓는 데이터
        int y = 4;

        // 논리연산자
        // && 그리고 (AND)
        // || 거나 (OR)
        System.out.println((x == 3) && (y == 7)); // answer is flase
        System.out.println((x == 3) || (y == 4)); // answer is true
    }
}
