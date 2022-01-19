package stringex;

import java.util.Scanner;

class Profile {
    private String number;
    private String name;
    private String tel;
    private String gender;
    private int age;

    public Profile(String number, String name, String tel, String gender, int age) {
        this.number = number;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}

public class StringEx03 {

    public static void main(String[] args) {
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이:20
        System.out.println("개인정보를 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        System.out.println(data); // 입력할 개인정보

        String[] tokens = data.split("-");

        if (tokens[0].equals("A01")) { // 값을 비교하는 메소드
            data.split("-");
            String number = tokens[0]; // 배열 4까지 지정
            String name = tokens[1];
            String tel = tokens[2];
            String gender = tokens[3];
            tokens[4] = tokens[4].trim(); // 공백 허용 메소드
            int age = Integer.parseInt(tokens[4]); // int를 String으로 바꾸는 메소드

            Profile box = new Profile(number, name, tel, gender, age);

            System.out
                    .println(box.getName() + "의 개인정보 : " + " 이름 : " + box.getName() + " 전화번호 : " + box.getTel()
                            + " 성별 : "
                            + box.getGender() + " 나이 : " + box.getAge());

        } else {
            System.out.println("입력 잘못으로 프로그램이 종료 되었습니다.");
        }
    }
}
