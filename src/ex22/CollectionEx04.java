package ex22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionEx04 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> lotto = new ArrayList<Integer>();

        while (true) {
            int n = r.nextInt(45) + 1;
            // n 값을 array에 저장
            lotto.add(n);

            if (lotto.size() == 6)
                break;
        }
        System.out.println(lotto);
    }
}
