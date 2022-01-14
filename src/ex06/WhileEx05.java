package ex06;

public class WhileEx05 {
    public static void main(String[] args) {
        // 변수 n을 이용해서 2의 배수만 출력하세요.
        // 출력이 끝나면 break 문으로 빠져나오시오.

        int n = 2;

        while (true) {
            if (n % 2 == 0) {
                System.out.println(n);
            }

            n = n + 2;

            if (n > 10) { // while 밑에 적어야 while이 2번 밖에 이루어지지 않는다.
                break;
            }
        }
    }
}
