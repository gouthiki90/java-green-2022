package stringex;

import java.util.Scanner;

class User {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public User(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class StringEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드의 바이트 스트림과 논리적으로 연결한다.
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20 = data
        // String data = sc.nextLine(); // 동적 형변환, String을 int로
        String data = "A01-이름:홍길동-전화번호:0102222-성별:남-나이";

        String[] tokens = data.split("-");
        // System.out.println(tokens[0]);
        // System.out.println(tokens[1]);
        // System.out.println(tokens[2]);
        // System.out.println(tokens[3]);
        // System.out.println(tokens[4]);
        // 중간 중간에 테스트로 확인하기

        if (tokens[0].equals("A01")) {
            // 1. 이름:홍길동을 :으로 구분해서 홍길동을 찾자
            String name = tokens[1].split(":")[1]; // 메소드 선언 후 배열 재정의
            // 2. 전화번호:0102222를 :로 구분해서 0102222를 찾자
            String tel = tokens[2].split(":")[2];
            // 3. 성별:남을 :로 구분해서 찾자
            String genderTemp = tokens[3].split(":")[3];
            // 4. 나이:20을 :로 구분해서 20을 찾자
            String ageTemp = tokens[4].split(":")[4];
            // 5. Char로 담고, int로 담고 하는 형변환 하기
            char gender = genderTemp.charAt(0); // index 번호는 항상 0부터 시작한다. 데이터의 번지수를 말한다.
            String ageTrim = ageTemp.trim();
            int age = Integer.parseInt(ageTrim);
            // 스트링은 기본 자료형이 아니기 때문에 형변환 기법은 쓸 수 없다.
            // 6. 클래스로 옮겨 담기
            User user = new User(name, tel, gender, age); // 클래스의 변수는 소문자로
            System.out.println("end if");
        } else {
            System.out.println("프로그램 종료");
        }
    }
}
