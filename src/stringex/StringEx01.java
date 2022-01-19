package stringex;

import java.util.Scanner;

class 이체내역 { // 상태는 반드시 프라이빗
    private String sender; // 보내는 분
    private int senderNumber; // 보내는 분의 계좌번호
    private String receiver; // 받는 분
    private int receiverNumber; // 받는 분의 계좌번호
    private int money;

    public 이체내역(String sender, int senderNumber, String receiver, int receiverNumber, int money) {
        this.sender = sender;
        this.senderNumber = senderNumber;
        this.receiver = receiver;
        this.receiverNumber = receiverNumber;
        this.money = money;
        // 디폴트 생성자 만듦
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(int senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(int receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

// 송신자:계좌번호:수신자:계좌번호:금액 프로토콜
public class StringEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        System.out.println("전송된 데이터 :" + data);

        String[] tokens = data.split(":"); // :로 찢어져서 받는다. 배열을 리턴한다.
        // 찢어진 것 하나는 토큰이라고 한다.
        /**
         * 홍길동
         * 010333377
         * 장보고
         * 112333377
         * 5000
         * 이렇게 split이라는 메소드로 :마다 찢어져서 나온다.
         */

        for (int i = 0; i < tokens.length; i++) { // 토큰의 크기만큼 반복한다.
            System.out.println(tokens[i]);
        }

        String sender = tokens[0]; // 배열을 String 타입으로 했기 때문에 똑같이 한다.
        int senderNumber = Integer.parseInt(tokens[1]); // 문자열을 받아서 숫자로 리턴해주는 메소드 사용
        String receiver = tokens[2]; // [size] 배열의 위치 지정
        int receiverNumber = Integer.parseInt(tokens[3]);
        int money = Integer.parseInt(tokens[4]);
        // 클래스로 묶어야 하나의 커스텀 자료형이 된다. 각자 따로 있는 의미 있는 데이터를 한데 묶어서 하나로 관리하는 게 편하다.

        이체내역 doc1 = new 이체내역(
                sender,
                senderNumber,
                receiver,
                receiverNumber,
                money);

        System.out.println(doc1.getReceiver() + "가" + doc1.getMoney() + "를(을) 받았습니다.");

    }
}
