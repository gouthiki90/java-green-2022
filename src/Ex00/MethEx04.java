package Ex00;

// 오버 로딩 = over-loading = 과적재

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자가 호랑이를 공격한다.
    static void attackTigerToLion(사자 unit1, 호랑이 unit2) { // class 커스텀 타입이기 때문에 타입 선언 가능
        // 함수 선언(매개변수)
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "가 공격 당하고 있습니다.");
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자가 곰을 공격한다.
    static void attackLionToBear(곰 unit1, 사자 unit2) { // class 커스텀 타입이기 때문에 타입 선언 가능
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }
    // 사자

    // 호랑이가 사자를 공격한다.
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) { // class 커스텀 타입이기 때문에 타입 선언 가능
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 호랑이가 곰을 공격한다.
    static void attackBearToTiger(곰 unit1, 호랑이 unit2) { // class 커스텀 타입이기 때문에 타입 선언 가능
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 곰이 사자를 공격한다.
    static void attackBearToLion(사자 unit1, 곰 unit2) { // class 커스텀 타입이기 때문에 타입 선언 가능
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 곰이 호랑이를 공격한다.
    static void attackTigerToBear(호랑이 unit1, 곰 unit2) { // class 커스텀 타입이기 때문에 타입 선언 가능
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 호랑이

    public static void main(String[] args) {
        사자 u1 = new 사자();
        호랑이 u2 = new 호랑이();
        곰 u3 = new 곰();

        // 사자 -> 호랑이
        attackTigerToLion(u1, u2); // (static 메서드 주소)어규먼트 넣음
        // 사자 -> 곰
        attackBearToLion(u1, u3);
        attackLionToTiger(u1, u2);

        attackTigerToBear(u2, u3);

        attackBearToTiger(u3, u2);
        attackBearToTiger(u3, u2);
        attackLionToBear(u3, u1);

    }
}
