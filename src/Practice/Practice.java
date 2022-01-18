package Practice;

class 동물 {
    String name;
    int hp;
    int attack;

    int PrintName() {
        return hp;
    }

    String ChangeHp() {
        return name;
    }

    int attack() {
        return attack;
    }

    void attackTo(동물 t) {
        hp = hp - attack();
    }

}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    int PrintName() {
        return hp;
    }

    String ChangeHp() {
        return name;
    }

    int attack() {
        return attack;
    }

    void attackTo(동물 t) {
        hp = hp - attack();
    }

}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    int PrintName() {
        return hp;
    }

    String ChangeHp() {
        return name;

    }

    int attack() {
        return attack;
    }

    void attackTo(동물 t) {
        hp = hp - attack();
    }
}

public class Practice {
    static void attack(동물 u1, 동물 u2) {
        System.out.println(u1.ChangeHp() + "가 공격 당하고 있습니다.");
        // 메서드가 String 타입으로 되어있기 때문에 출력 매개변수는 문자열로 인식 되어서 syso에 연산이 가능하다.
        u1.attackTo(u2);
        System.out.println(u1.ChangeHp() + "의 hp : " + u1.PrintName());
    }

    public static void main(String[] args) {
        사자 lion = new 사자();
        호랑이 tiger = new 호랑이();

        attack(lion, tiger);
    }
}
