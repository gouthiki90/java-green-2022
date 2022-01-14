package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임 (500, 100, 50, 10)
        int money = 2680; // 500*5, 100*1, 50*1, 10*3 is are true

        int restMoney = money; // call by value

        int coin; // coin이 int type이라는 것을 선언

        // 1. 500원 동전 구하기
        coin = 500;
        System.out.println(coin + "원");
        System.out.println(restMoney / coin + "개"); // 2680원에 500을 나눔
        restMoney = restMoney % coin; // 180원,

        // 2. 100원 동전 구하기
        coin = 100;
        System.out.println(coin + "원");
        System.out.println(restMoney / coin + "개"); // 180원에 100을 나눔
        restMoney = restMoney % coin; // 80원

        // 3. 50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원");
        System.out.println(restMoney / coin + "개"); // 80원에 50을 나눔
        restMoney = restMoney % coin; // 30원

        // 4. 10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원");
        System.out.println(restMoney / coin + "개"); // 30원에 10을 나눔
        restMoney = restMoney % coin; // 0원
    }
}
