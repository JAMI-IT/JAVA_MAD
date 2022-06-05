
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

       
     
        HashMap<String,Integer> hm =new HashMap<String,Integer>();
        hm.put("19014156-032", 50);
        hm.put("19014156-031", 502);
        hm.put("19014156-030", 502);
        hm.put("19014156-029", 501);
        hm.put("19014156-028", 506);
  
        for(String i :hm.keySet())
        {
            System.out.println("KEY :"+i+"... Value :"+hm.get(i));
        }
    }
}
