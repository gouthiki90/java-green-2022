package Practice;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!!
class 애완동물 {
    void sound() {
    }

    // 무효화 됨.
    void printName() {
    }

    void changeName() {
    }

    void changeHp() {
    }

    void attack() {

    }
}

class 강아지 extends 애완동물 {
    String name = "강아지";
    int hp = 50;
    int attack = 5;
    int changeHp = 50 - 10;

    void sound() {
        System.out.println("멍멍");
    }

    void printName() {
        System.out.println(name + "가 공격 받고 있습니다.");
    }

    void changeName() {
        name = "변경된 강아지";
    }

    void changeHp() {
        System.out.println(hp);
    }

    void attack() {
        System.out.println(name + "의 HP : " + changeHp);
    }

}

class 고양이 extends 애완동물 {

    String name = "고양이";
    int hp = 100;
    int attack = 10;
    int changeHp = 100 - 5;

    void sound() {
        System.out.println("야옹");
    }

    void printName() {
        System.out.println(name + "가 공격 받고 있습니다.");
    }

    void changeName() {
        name = "변경된 고양이";
    }

    void changeHp(int hp) {
        System.out.println(hp);
    }

    void attack() {
        System.out.println(name + "의 HP : " + changeHp);
    }
}

public class Practice2 {

    // static void start(애완동물 u1) {
    // u1.sound();
    // // System.out.println(u1);
    // u1.printName();
    // u1.changeName();
    // u1.changeHp();
    // }

    static void start(애완동물 u1) {
        u1.sound();
        u1.printName();
        u1.attack();
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이(); // 고양이랑(printName) 애완동물(printName)
        // start(cat);

        애완동물 dog = new 강아지(); // 강아지랑 애완동물(printName)
        start(dog);

        start(cat);
    }
}