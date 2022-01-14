package ex06;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 2680;
        int restMoney = money;

        while (true) {
            System.out.println("동전 갯수를 입력하세요");
            int coin = sc.nextInt();

            System.out.println(coin + "원" + restMoney / coin + "개");
            restMoney = restMoney % coin;

            if (coin == 10) {
                break;
            }
        }
    }
}
