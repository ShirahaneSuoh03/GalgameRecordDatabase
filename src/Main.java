import java.util.PriorityQueue;

public class Main {
    public static PriorityQueue<Record> dataBase=new PriorityQueue<Record>();
    public static void main(String[] args) {
	// write your code here
        Record record=new Record("Flowers","0","0",100,100,100);
//        dataBase.add(record);
//        Record newRec=dataBase.peek();
        record.test();
    }
}
