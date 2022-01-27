package srptest;

import java.util.ArrayList;
import java.util.List;

public class 메뉴판 {
    private List<MenuItem> items;

    public void MenuItem(List<MenuItem> items) {
        this.items = items;
    }

    public String choose(String name) { // 메뉴판의 책임
        return name;
    }
}

class MenuItem {

    private String name;
    private int prise;

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }
}
