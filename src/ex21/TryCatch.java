package ex21;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("피젯수 : ");
        x = sc.nextInt();
        System.out.println("젯수 : ");
        y = sc.nextInt();

        try {
            int result = x / y;
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
