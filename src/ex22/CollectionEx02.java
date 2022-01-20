package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class MyInteger {
    int num;
}

public class CollectionEx02 {
    public static void main(String[] args) {
        // 제네릭에는 기본자료형을 담을 수 없다.
        Set<Integer> datas = new HashSet<Integer>();
        // 클래스 타입이 들어가야 한다. 해당 클래스 안에 int 상태가 들어가있다.
        // 이를 래퍼 클래스라고 한다.
        // Set이라는 부모로 묶으면 추상화 가능.

        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);

        System.out.println(datas.size()); // 데이터의 크기 출력, legth가 아니라 size를 사용함
        System.out.println(datas);

        // HashSet열 뽑아내는 와일문
        Iterator<Integer> its = datas.iterator();
        while (datas.iterator().hasNext()) {
            System.out.println(datas.iterator().next());
        }
    }
}
