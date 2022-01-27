package jasonex01;

import com.google.gson.Gson;

//자바의 변수는 언더스코어 하면 안 됨. 고치기 귀찮으니 그냥 냅뒀는데 변수는 카멜 표기법으로 해서 하기.
class SMSDto {
    private String id;
    private String success_count;
    private String error_count;

    public SMSDto(String id, String success_count, String error_count) {
        this.id = id;
        this.success_count = success_count;
        this.error_count = error_count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuccess_count() {
        return success_count;
    }

    public void setSuccess_count(String success_count) {
        this.success_count = success_count;
    }

    public String getError_count() {
        return error_count;
    }

    public void setError_count(String error_count) {
        this.error_count = error_count;
    }
}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        String smsReturn = "{\"group_id\":\"R2GdEONszq64lNB9\",\"success_count\":1,\"error_count\":0}";

        SMSDto smsDto = new SMSDto("R2GdEONszq64lNB9", "1", "0");
        Gson gson = new Gson();
        smsReturn = gson.toJson(smsDto);
        System.out.println(smsReturn);
    }
}
