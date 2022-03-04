import java.io.FileWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static PriorityQueue<Record> dataBase=new PriorityQueue<Record>();
    public static void main(String[] args) throws Exception {
	// write your code here
//        Record record=new Record("Flowers","0","0",100,100,100);
//        dataBase.add(record);
//        Record newRec=dataBase.peek();
        while (true){
            System.out.println("When inputting about string, key 'exit' to interrupt\nif int, key -1");
            Scanner scanner=new Scanner(System.in);
            System.out.print("请输入游戏名：");
            String userInput= scanner.nextLine();
            if(userInput.equals("exit")){
                break;
            }
            System.out.print("请输入开始日期(yyyy-mm-dd)：");
            String startDate= scanner.nextLine();
            if(startDate.equals("exit")){
                break;
            }
            System.out.print("请输入结束日期(yyyy-mm-dd)：");
            String endDate = scanner.nextLine();
            if(endDate.equals("exit")){
                break;
            }
            System.out.print("请输入剧本分数：");
            int scenario= Integer.parseInt(scanner.nextLine());
            if(scenario == -1){
                break;
            }
            System.out.print("请输入音乐分数：");
            int music= Integer.parseInt(scanner.nextLine());
            if(music == -1){
                break;
            }
            System.out.print("请输入CG分数：");
            int CG= Integer.parseInt(scanner.nextLine());
            if(CG == -1){
                break;
            }
            Record record = new Record(userInput,startDate,endDate,scenario,music,CG);
            fileWriter(record);

        }

    }
    public static void fileWriter(Record record) throws Exception {
        FileWriter writer = new FileWriter("index_path.txt", true);
        String info=new String();
        info+=record.getName()+"\t"+record.getStartDate().toString()+"\t"+record.getEndDate().toString()+"\t";
        info+=record.getScenario()+"\t"+record.getMusic()+"\t"+record.getCG();

        writer.write(info);
        writer.write("\r\n");

        writer.close();
    }
    /**
     * @param info
     * @throws Exception
     * add a new line and then write
     */
    public static void writeln(String info) throws Exception {
        FileWriter writer = new FileWriter("Galgame_Record.txt", true);

        writer.write("\r\n");
        writer.write(info);
        writer.close();
    }
}
