package ex10;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 }; // 배열을 선언하면서 배열의 값도 초기화
        for (int i = 0; i < numbers.length; i++) // 배열의 크기만큼 반복한다.
            // length라는 상태는 배열을 크기를 나타낸다. 이는 각 배열마다 가지고 있다.
            System.out.println(numbers[i]); // answer is 10, 20, 30

        for (int vaule : numbers) // 배열 값을 vaule이라는 변수에 차례대로 대입한다.
            System.out.println(vaule);
    }
}
