package ex05;

public class VarEx01 {
    public static void main(String[] args) {
        byte num; // 메모리에 1바이트를 stack에 공간을 확보(박스를 만듦), 변수의 선언(메모리에 num이라는 사이즈만 확보)
        num = 1; // 메모리 공간 확보 후 대입
        byte num2 = 100; // 2byte 공간을 확보하고 변수를 초기화(확보+대입)
        System.out.println(num); // 변수 불러오기, 모니터에 출력함
    }
}
