package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int step = 2; step <= 9; step++) { // 곱할 대상, 9까지 반복
            // 2를 9번 1씩 더한다.
            System.out.println(step + "단");
            // 수식이 나오는 for문 앞에다 적어야 끊을 수 있음
            for (int n = 1; n <= 9; n = n + 1) { // 곱할 횟수, 9까지 반복
                // 1을 9번 1씩 더한다.
                System.out.println(step + "*" + n + "=" + (step * n));
                // 곱할 대상 + * + 곱할 횟수 + = + (곱할 대상 * 곱할 횟수)
            }
        }
    }
}
