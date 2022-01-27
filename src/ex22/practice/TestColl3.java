package ex22.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TestColl3 {
    public static void main(String[] args) {
        /**
         * 단위 테스트
         * 1. ArrayList에 숫자 6개 담기
         * 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
         * 3. HashSet으로 랜덤함 로또 번호 6개 받기
         * 4. HashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요!! (구글링)
         * 5. 로또 세트(HashSet) 5개를 ArrayList에 담기
         * 6. ArrayList 로또 2개 만들어서 비교해보기
         */

        // 1. ArrayList에 숫자 6개 담기
        // List<Integer> lotto = new ArrayList<>();
        // lotto.add(3);
        // lotto.add(5);
        // lotto.add(30);
        // lotto.add(40);
        // lotto.add(41);
        // lotto.add(42);

        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int count = (int) money / 1000; // 신창원기법

        System.out.println("받은 금액 : " + money);
        System.out.println("로또 횟수 : " + count);

        // 3. HashSet으로 랜덤함 로또 번호 6개 받기 + 로또 횟수만큼

        // 5번이 왜 내 맘대로 안 되는 걸까..? 울고싶다

        Set<Integer> buyLotto = new HashSet<>();
        Random r = new Random();

        // for문으로 로또 횟수만큼 번호 뽑기

        // 횟수만큼 나오게 하려면 돌아갈 때마다 new 해줘야 함!
        // 반복해서 lotto에 담기 (6개)
        // Set 자료구조는 중복되는 데이터가 들어가면 허용하지 않음.
        for (int i = 0; i < 5; i++) {
            while (true) {
                int n = r.nextInt(45) + 1;
                buyLotto.add(n);

                // 한줄 코드는 중괄호 생략 가능 (if 에서만!!)
                if (buyLotto.size() == 5)
                    break;
            } // end of while
        }
        // end of for

        System.out.println(buyLotto);

        // // 5. 로또 세트 5개를 ArrayList에 담기
        List<Integer> list = new ArrayList<>(buyLotto);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("산 로또 번호 : " + list);
        }

        // List<List<Integer>> list = new ArrayList<>();
        // list.add(sl);
        // System.out.println(list);
    } // end of main
}