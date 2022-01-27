package srptest;

public class 커피 extends MenuItem {
    private String name;
    private int prise;

    public 커피(String name) { // 디폴트 생성자 초기화
        this.name = name;
    }

    public String getName(String name) {
        return "아메리카노";
    }

    public int getPrise(int prise) {
        return 1500;
    }

}
