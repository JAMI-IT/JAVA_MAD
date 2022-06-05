import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        

        // ArrayList<String> car=new ArrayList<String>();
        // car.add("Jami");
        // // car.set(0,"AR");
        // // car.clear();
        // // car.remove(0);
        // car.add("Abdul REhman");
       
        // System.out.println(car.size());
        // System.out.println(car)
        String input,rol;
        Integer marks;

        HashMap<String,Integer> student=new HashMap<String,Integer>();

        do
        {


            System.out.println("Chose the no To perform Operation");
            System.out.println("Press 1 To enter the data :");
            System.out.println("Press 2 To Dislplay Data :");
            System.out.println("Press -1 To Exit -");
            input= System.console().readLine();
            switch(input)
            {
                case "1":
                System.out.println("Enter the Student Roll # :");
                rol=System.console().readLine();
                System.out.println("Enter the student marks");
                //marks=System.console().readLine();

                student.put(rol,50);
                break;
                
                case "2":
                System.out.println("------Candidates list-------");
                        for (String students : student) {
                            System.out.println(student);
                        }
                        break;
               }


           }

           while(!input.equals("-1"));
        }
}