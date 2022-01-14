package ex07;

class Person {
    String name;
    int height;
    int weight;

    // 디폴트 생성자 = 객체의 초기화를 위해 필요하다.
    // 객체 초기 세팅을 위해서 값을 초기화 한다.
    public Person() { // new 될 때 실행한다.
        System.out.println("사람이 생성되었습니다.");
        name = "홍길동";
        height = 170;
        weight = 70;
    }
    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 디폴트 생성자 모습 : 클래스명(){}
}

// 생성자
public class OOPEx08 {
    public static void main(String[] args) {
        Person s1 = new Person(); // 힙에 띄울 때 무얼 하고 싶은지 정한다.
        // 생성자에서 가져온다.
        System.out.println(s1.name);
    }
}
