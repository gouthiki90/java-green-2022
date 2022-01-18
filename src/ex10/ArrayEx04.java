package ex10;

class Car {
    public int speed; // class 의 상태 선언
    public int gear;
    public String color;

    public Car() {
        speed = 0;
        gear = 1;
        color = "red";
    }

    public void speedUp() {
        speed += 10;
    }

    public String toString() {
        return "속도:" + speed + "기어:" + gear + "색상:" + color;
    }
}

public class ArrayEx04 {
    public static void main(String[] args) {
        final int NUM_CARS = 5; // 상수로 변함

        Car[] cars = new Car[NUM_CARS]; // Car라는 객체를 5개의 배열로 선언

        for (int i = 0; i < cars.length; i++) // 1번씩 5번까지 반복
            cars[i] = new Car(); // cars라는 배열에 Car 객체 대입
        for (int i = 0; i < cars.length; i++)
            cars[i].speedUp(); // speedUp 메소드 대입
        for (int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);
    }
}
