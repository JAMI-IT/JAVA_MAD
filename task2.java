
import java.util.ArrayList;


public class task2 {
    
    public static void main(String[] args) {
        String input;
        ArrayList<String> candidates=new ArrayList<String>();


         do{
                    System.out.println("\n\n ADD : Write Add to Enter the ");
                    System.out.println(" show :Write Show To show data");
                    System.out.println("-1 ->To Exit");
                    System.out.print("write  Your Choice::");
                    input  = System.console().readLine();
                    switch(input)
                    {
                        case "ADD":
                        // write your to code to save input data to arraylist
                        System.out.println("------Add Candidate-------");

                          System.out.print("Enter Candidate Name::");
                          candidates.add(System.console().readLine());
                          System.out.println("Added...");
                          break;
    
                        case "show":
                        // write you code to display data in array list using foreach loop
                        System.out.println("------Candidates list-------");
                        for (String candidate : candidates) {
                            System.out.println(candidate);
                        }
                        break;
                    }
    
    
                }
                 // exit if user press -1
                while(!input.equals("-1"));
    
    }
}
