package jasonex01;

import java.util.Arrays;
import java.util.List;

// {
//     "name": "홍길동",
//     "age": 25,
//     "hobby": ["농구", "도술"],
//     "family": {"id": 2, "father": "홍판서", "mother": "춘섬"}
//  }
// Json 언어를 JAVA로 구현해보기

class Family {
    private int id;
    private String father;
    private String mother;

    public Family(int id, String father, String mother) {
        this.id = id;
        this.father = father;
        this.mother = mother;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Family [father=" + father + ", id=" + id + ", mother=" + mother + "]";
    }

    public String toJson() {
        return "{\"id\":" + id + "father" + "\"" + father + "\"" + "moter" + "\"" + mother + "\"" + "}";
    }
}

class Profile {
    private String name;
    private int age;
    private List<String> hobby;
    private Family family;

    public Profile(String name, int age, List<String> hobby, Family family) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Profile [age=" + age + ", family=" + family + ", hobby=" + hobby + ", name=" + name + "]";
    }

    public String toJson() {
        return "{" + "\"name\"" + name + "\"age\"" + age + "\"hobby\"" + hobby + "\"family\"" + family + "}";
        // 모든 객체를 호출할 때는 모두 toString으로 호출하기 때문에 family만 써도 toString 호출된다.
    }
}

public class JasonEx01 {
    public static void main(String[] args) {
        List<String> hobby = Arrays.asList("농구", "도술");
        Family family = new Family(2, "홍판서", "춘섬");

        Profile user = new Profile("홍길동", 25, hobby, family);

        System.out.println(user.toString());
        System.out.println(family.toJson());

        // json 변경(개념 : joson은 생긴게 joson처럼 생긴 것이지 타입은 문자열이다.)
        // 2. json 목적은 데이터 통신을 전송하기 위한 것이다.
    }
}
