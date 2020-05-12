package bean;


import java.util.Date;

public class stamp {
    private String id;
    private String time;

    public stamp(String time) {
        this.time = time;
    }

    public String getTime(){
        return time;
    }
}
