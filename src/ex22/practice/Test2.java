package ex22.practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력 받아서 횟수 정하기 ex) 5000 - 5회

        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong(); // 돈을 표현할 때는 long 사용
        int count = (int) money / 1000; // 형변환, 다운 캐스트

        System.out.println("받은 금액:" + money);
        System.out.println("로또 횟수:" + count);

        if (count == money / 1000) {
            System.out.println("테스트 완료");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
