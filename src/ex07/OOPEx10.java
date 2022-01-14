package ex07;

class Person3 {
    String name; // 멤버 변수, heap에 계속 떠 있다.
    int height;
    int weight;

    public Person3() {
        String name = "안녕";
        System.out.println(name); // "안녕"이 나온다. 지역 변수, stack에 떠 있다.
    }

    Person3(String name, int height, int weight) {
        this.name = name; // this.는 class가 가지고 있는 heap 변수 지정
        this.height = height;
        this.weight = weight;
    }
}

public class OOPEx10 {
    public static void main(String[] args) {
        Person3 s1 = new Person3("홍길동", 170, 70);
        Person3 s2 = new Person3("임꺽정", 150, 200);
        // new의 값은 heap에 저장된다.

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
