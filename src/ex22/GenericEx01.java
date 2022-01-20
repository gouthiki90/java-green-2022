package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

class ResponseBox<T> { // 대문자로 적기
    T data;

    public ResponseBox(T data) { // 컴포지션
        this.data = data;
    }
}

// 제네릭을 사용하면 메서드의 리턴 타입을 고정시키면서 다양하게 리턴할 수 있다.
public class GenericEx01 {

    ResponseBox<사과> hello() {
        return new ResponseBox<사과>(new 사과());
    }

    public static void main(String[] args) {
        ResponseBox<사과> rb = new ResponseBox<사과>(new 사과()); // T 자리에 사과가 들어가면 사과 클래스가 들어간다.
        // 따라서 리턴 타입이 사과가 되고, 통신에 응답할 때 사과라는 타입으로 응답한다.
        // T라는 제네릭으로 여러 타입을 가질 수 있게 함
        // rb 응답
        // 리스펀스 박스로 리턴 타입이 고정됨
        System.out.println(rb.data.name);
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        ResponseBox<오렌지> rb3 = new ResponseBox<오렌지>(new 오렌지());
    }
}
