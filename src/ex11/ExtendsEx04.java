package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자.
 * 신입이 실수하면 내 책임이나 다름 없다.
 */

// abstract class 추상클래스 = new할 수 없다.
// 추상 메서드를 만들 수 있다. (객체의 행위를 알 수 없을 때, 공통적으로 정할 수 없을 때)
// 일반 메서드도 가질 수 있다.(객체의 행위가 정해져 있을 때, 공통적으로 정할 수 있을 때)
// 추상 메서드로 지정하면 오버라이드를 해야 된다는 강제성이 부여 된다.
abstract class ProtossUnit { // 종족 이름
    abstract void setHp(int hp); // 추상 메서드는 메서드의 몸체가 필요 없다.

    abstract int getHp();

    abstract int getAttack();
}

// 일반 클래스는 추상 메서드를 가질 수 없다.
class Zealot extends ProtossUnit { // 근거리 공격
    String name = "질럿"; // 멤버 변수, heap에 있음
    int hp = 100;
    int attack = 10;

    @Override // 부모 메서드가 무효화 되기 때문에 메소드 생성 가능
    // 반드시 메소드를 만들어야 하기 때문에 강제성 부여
    void setHp(int hp) {
        this.hp = hp; // 멤버 변수 가져옴
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

class Dragoon extends ProtossUnit { // 원거리 공격
    String name = "드라군";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

// 신입, DarkTempler 하나 만들어
// name = 다크템플러
// hp = 100
// attack = 50
// 꼭 ProtossUnit으로 추상화 해
// 테스트 -> 다크템플러가 질럿을 공격
class DarkTempler extends ProtossUnit { // 원거리 공격
    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

public class ExtendsEx04 {
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1. u1이 u2를 공격 -> u2.hp = u2.hp - u1.attack (자식 변수에 접근할 수 없으니 오버라이드가 필요하다.)
        u2.setHp(u2.getHp() - u1.getAttack());
        // 2. u2의 hp를 출력 -> sysout(u2.hp)
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        ProtossUnit d2 = new DarkTempler();

        attack(z1, d1);
        attack(d2, z1); // 다크템플러가 질럿을 공격
    }
}
