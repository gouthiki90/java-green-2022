package ex06;

import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exitNum = 1; // 변수 초기화
        while (exitNum == 1) { // is true
            System.out.println("프로그램 종료를 원하면 0을 입력하세요.");
            int num = sc.nextInt();
            System.out.println("사용자 입력 :" + num); // num에 숫자를 입력 가능

            if (num == 0) { // num에 0을 입력할 때
                exitNum = 0; // exitNum이 flase가 된다.
            }
        }
    }
}
