package ex22;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {
        // ArrayList는 데이터가 중복돼도 되는 데이터 모임
        ArrayList<String> datas = new ArrayList<String>();
        // 어떤 타입을 담을 건지 모르기 때문에 제네릭으로 만듦
        // 여러개 데이터가 저장되는 제네릭 박스
        datas.add("데이터1"); // 0번지 데이터는 반드시 있어야 다음 데이터가 존재한다.
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");

        datas.set(1, "data2"); // set 메소드를 통해서 1열에 있는 데이터를 바꿀 수 있음
        datas.remove(3); // 3열 인덱스 위치 삭제

        System.out.println(datas.get(0)); // index 위치로 get 메소드를 사용한다.+
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        // System.out.println(datas.get(3)); 삭제됨
    }
}
