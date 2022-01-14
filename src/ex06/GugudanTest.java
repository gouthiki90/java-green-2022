package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {

        int first; // 시작값
        int last; // 끝값

        System.out.println("출력할 구구단의 범위를 입력하시오.");

        Scanner FirstVaule = new Scanner(System.in);

        first = FirstVaule.nextInt();
        System.out.println("구구단의 시작값 :" + first); // 시작값 입력

        last = FirstVaule.nextInt();
        System.out.println("구구단의 끝값 :" + last); // 끝값 입력

        for (int n = first; n <= last; n++) { // first = first에서, last = last까지 n을
            System.out.println("---- " + n + "단----");
            for (int a = 1; a <= 9; a++) // 9까지 곱하라
                System.out.println(n + "*" + a + "=" + (n * a));
        }
    }
}
