package ex06;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int n;
        int i = 1;
        System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시오 : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while (i <= 9) { // i가 9보다 작거나 같으면
            System.out.println(n + "*" + i + "=" + (n * i));
            i++;
        }
    }
}
