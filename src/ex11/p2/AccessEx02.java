package ex11.p2;

import ex11.p1.AccessEx01;

public class AccessEx02 {
    public static void main(String[] args) {
        AccessEx01 a1 = new AccessEx01(); // import 생성, alt + shift + o
        a1.m1();

        AccessEx03 a3 = new AccessEx03();
        a3.m3();

        // 같은 패키지 안에 있는 private를 public메서드를 통해서 불러오기 가능
        a3.통로();

    }
}
