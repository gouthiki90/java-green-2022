package ex06;

public class ForEx01 {
    public static void main(String[] args) {
        // 2의 32승을 구해보자.
        long answer = 1;
        for (int n = 1; n < 32; n = n + 1) {
            // 시작값 : 1, 32번 전까지 돌기, 돌면서 1씩 더하기
            System.out.println(n); // 출력
            answer = answer * 2; // 2의 n승을 추가
        }
        System.out.println(answer);
    }
}
