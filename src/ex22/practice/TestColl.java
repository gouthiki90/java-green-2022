package ex22.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Lotto {

}

public class TestColl {
    public static void main(String[] args) {
        /**
         * 1. 6개의 로또 번호를 정한다.
         * 2. ArrayList에 담는다.
         * 3. 스캐너로 금액을 입력 받는다. ex) 5000원이면 5회
         * 4. 입력 받은 금액에 따라 arraylist에 hashset으로 로또 번호 넣고 돌릴 수만큼 넣기
         * 5. 1, 2 비교해서 당첨됐는 지 확인해서 출력하기
         * 비교할 때 데이터는 정렬해서 비교하기
         */

        // arraylist 정렬

        // Set<Integer> lottoSave = new HashSet<Integer>();
        // ArrayList<Set<Integer>> lottoNumbering = new ArrayList<Set<Integer>>();

        Random r = new Random();

        System.out.println("복권을 얼마나 사시겠습니까?");

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println("구매한 복권" + money + "원");

        Set<Integer> lottoNumbering = new HashSet<Integer>();
        for (int m = 0; m < money / 1000; m++) {
            while (true) {
                int n = r.nextInt(45) + 1;
                lottoNumbering.add(n);
                if (lottoNumbering.size() == 5)
                    break;
            }
            System.out.println(lottoNumbering);
        }
        List<Integer> lottoNumberingliList = new ArrayList<Integer>();
        Collections.sort(lottoNumberingliList); // 정렬

        boolean check = false;
        for (int i = 0; i < 6; i++) {
            if (lottoNumberingliList != lottoNumberingliList)
                check = true;
            System.out.println("꽝입니다!");
            break;
        }

        if (check == false) {
            System.out.println("당첨입니다!");
        }

        // List<Integer> lottoNumbering = new ArrayList<Integer>();
        // lottoNumbering.sort(Comparator.naturalOrder());

        // for (int i = 0; i < 5; i++) {
        // List<Integer> lottoNumbering = new ArrayList<Integer>();

        // while (true) {
        // int n = r.nextInt(45) + 1;
        // lottoNumbering.add(n);

        // if (lottoNumbering.size() == 6)
        // break;
        // }
        // System.out.println(lottoNumbering);
        // }
        // 로또 번호 5번 출력
    }
}
