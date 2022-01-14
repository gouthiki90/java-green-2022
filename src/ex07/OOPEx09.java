package ex07;

class Person2 {
    String name;
    int height;
    int weight;

    // 디폴트 생성자 = 객체의 초기화를 위해 필요하다.
    // 객체 초기 세팅을 위해서 값을 초기화 한다.
    // 클래스 이름과 동일하게 만들어야 한다.
    // construntor(생성자)
    // 생성자는 메소드의 성질과 같다.
    // 생성자는 void가 없다. 리턴 값도 없다.
    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 디폴트 생성자 모습 : 클래스명(){}
    public Person2() { // new 될 때 실행한다. // stack에 저장된다.

    }

    Person2(String d1, int d2, int d3) { // 생성자의 스택과 큐 생성됨
        name = d1; // 힙으로 옮김
        height = d2;
        weight = d3;
    }
}

public class OOPEx09 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70); // argument를 매개변수 타입과 맞게 입력
        Person2 s2 = new Person2("임꺽정", 150, 200); // 만들 때마다 초기화를 다르게 할 수 있다.
        // new의 값은 heap에 저장된다.

        System.out.println(s1.name); // call by referance
        System.out.println(s2.name); // call by referacne
    }
}
