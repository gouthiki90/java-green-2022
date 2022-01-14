package ex07;

// 1. 자바는 모든 코드가 class 내부에 있어야 한다.
// 2. 자바는 class만 1급이다.
// 3. class = 설계도
// 4. 클래스는 상태(변수)와 행위(메서드)를 가진다.
// 5. static을 찾을 때 클래스명.변수명
// 6. static이 아닌 상태를 메모리에 띄우는 법 new 클래스명()을 하면 heap에 뜬다.

class Dog {
    int 배고픔 = 100; // 0~100의 배고픔

    void 밥먹기() {
        배고픔 = 0;
    }
}

public class OOPEx05 {
    public static void main(String[] args) {
        Dog dd = new Dog();
        System.out.println(dd.배고픔);
        dd.밥먹기(); // 행위를 통해서 상태 변경
        System.out.println(dd.배고픔);
    }
}
