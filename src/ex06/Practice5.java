package ex06;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        // 사용자로부터 과세 표준 금액을 받아서 근로 소득세를 계산한다.
        int income; // 과세표준
        int tax; // 세금

        System.out.println("과세 표준 금액을 입력하시오:");
        Scanner input = new Scanner(System.in);
        income = input.nextInt();

        if (income <= 1000) // 과세표준이 1000과 같거나 작을 때
            tax = (int) (0.09 * income); // 과세표준에 0.09를 곱한 세금이 나온다.

        else if (income <= 4000) // 과세표준이 4000과 같거나 작을 때
            tax = (int) (1000 * 0.09 + 0.18 * (income - 1000));
        else if (income <= 8000) // 과세표준이 8000과 같거나 작을 때
            tax = (int) (1000 * 0.09 + 3000 * 0.18 + 0.27 * (income - 4000));
        else // 과세표준이 모두의 이외일 때
            tax = (int) (1000 * 0.09 + 300 * 0.18 + 4000 * 0.27 + 0.36 * (income - 8000));

        System.out.println("소득세는" + tax + "입니다.");
    }
}
