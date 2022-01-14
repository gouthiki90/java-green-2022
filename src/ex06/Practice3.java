package ex06;

public class Practice3 {
    public static void main(String[] args) {
        int n = 2;

        while (true) {
            System.out.println("연산 시작");
            if (n % 2 == 0) {// n과 2를 나누었을 때 나머지가 0이면
                System.out.println(n); // n을 출력한다.
            }

            n = n + 2; // n에 끊임 없이 2씩 더한다.

            if (n > 10) { // 더하는 10번 째에 멈춘다.
                break;
            }
        }
    }
}
