package ex11;

class 동물 { // 무효화되고 자식 메서드의 통로가 된다.
    String getName() { // 오버라이드를 하려면 메소드가 필요하다.
        return "";
    }

    void setHp(int hp) {

    }

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;
    }
}

class 사자 extends 동물 {
    String name = "사자"; // 오버라이드 -> 동적 바인딩을 통해서 getName으로 간다.
    int hp = 100;
    int attack = 10;

    String getName() {
        return name; // 메서드에 name이란 값을 뱉는다. 동적 바인딩.
        // 여기에서 syso을 하면 String 타입이 아니기 때문에 attack 메서드에 출력이 되지 않는다.
    }

    void setHp(int hp) { // stack에 있는 매개변수
        this.hp = hp; // 사자에 있는 hp를 stack에 있는 Hp로 변경한다.
    }

    int getHp() {
        return hp;
        // heap에 있는 변수인 hp 값을 뱉는다. 부모 클래스가 무효화 되고 자식 메서드로 내려온다. 이를 동적 바인딩이라고 한다.
    }

    int getAttack() {
        return attack;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 100;
    int attack = 30;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

public class ExtendsEx02 {
    // 오버라이딩 = 무효화하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        // 공통 모듈을 불러올 수 있다. 사자, 호랑이, 곰의 메서드 불러오기 가능.
        System.out.println(unit2.getName() + "가(이) 공격당하고 있습니다.");
        // getName은 String 타입이 되었기 때문에 syso에 들어갈 수 있다. int 타입도 가능.
        System.out.println(unit1.getName() + "이(가)" + unit2.getName() + "을 공격하고 있습니다.");

        unit2.setHp(unit2.getHp() - unit1.getAttack());
        System.out.println(unit2.getName() + "의 hp : " + unit2.getHp());
    }

    public static void main(String[] args) {
        동물 Lion = new 사자(); // 동물에 있는 사자를 heap에 부름
        // 동물과 사자라는 영역이 나뉘어짐, 그곳에서 동물 지목
        동물 Tiger = new 호랑이();
        동물 Bear = new 곰();
        동물 Wolf = new 늑대();

        attack(Lion, Tiger);
        attack(Lion, Bear);
        attack(Tiger, Bear);
        attack(Bear, Tiger);
        attack(Wolf, Lion);
    }
}
