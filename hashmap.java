
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

       
     
        HashMap<String,Integer> hm =new HashMap<String,Integer>();
        hm.put("19014156-032", 50);
        System.out.println("Enter the rollno");
        System.console().readLine();

        

        hm.get("19014156-032");
        System.out.println(hm);
    }
}
