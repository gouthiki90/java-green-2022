package ex06;

public class Practice4 {
    public static void main(String[] args) {
        // 2의 32승을 구해보자.

        long answer = 1;
        for (int n = 1; n < 32; n = n + 1) {
            System.out.println(n);
            answer = answer * 2;
        }
        System.out.println(answer);
    }
}
