import java.sql.Date;

public class Record {
    public String name;
    public Date startDate, endDate;
    public int scenario, music, CG;
    public Record(String name, String startDate, String endDate, int scenario, int music, int CG){
        this.name=name;
    }
    public void test(){
        System.out.println(this.name);
    }
}
