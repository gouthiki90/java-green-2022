package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 2680;
        int restMoney = money;

        while (true) {
            int coin = sc.nextInt(); // 500, 100, 50, 10 입력

            // 남은 동전을 출력하는 로직
            System.out.println(restMoney / coin + "개"); // 입력한 값을 restMoney와 나눔
            restMoney = restMoney % coin;

            if (coin == 10) {
                break;
            }
        }
    }
}
