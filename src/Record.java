import java.sql.Date;

public class Record {


    private String name;
    private Date startDate, endDate;
    private int scenario, music, CG;
    public Record(String name, String startDate, String endDate, int scenario, int music, int CG){
        this.name=name;
        this.startDate=Date.valueOf(startDate);
        this.endDate=Date.valueOf(endDate);
        this.scenario=scenario;
        this.music=music;
        this.CG=CG;
    }
    public void test(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getScenario() {
        return scenario;
    }

    public void setScenario(int scenario) {
        this.scenario = scenario;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public int getCG() {
        return CG;
    }

    public void setCG(int CG) {
        this.CG = CG;
    }
}
