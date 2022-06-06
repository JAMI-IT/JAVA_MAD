import java.util.HashMap;
public class task3 {
    
   
    public static void main(String[] args) 
    {

        HashMap<String,HashMap<String,Float>> student =new HashMap<String,HashMap<String,Float>>();

   
        String input="";
         
        do{
              System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("Chose The no To perform The THe opearation ?::");
                    System.out.println("Press 1 For Data Entery ?::");
                    System.out.println("Press 2 For Display Data? ::");
                    System.out.println("Press -1 To EXIT >?");
                    input=System.console().readLine();
 switch(input)
        {   
        case "1":
        String rollNo="";
        String Name="";
        Float Marks;

        System.out.println("---------------------Studen Record Entery Board------------------");
        System.out.println("Enter the student Roll# :");
        rollNo=System.console().readLine();

        if(student.containsKey(rollNo))
        {
            System.out.println("Try Another ::");
            break;
        }

        HashMap<String,Float> Bio=new HashMap<String,Float>();
        System.out.println("ENter The Student NAME :");
        Name=System.console().readLine();
        System.out.println("Enter The Student Marks :");
        Marks=Float.parseFloat(System.console().readLine());


        Bio.put(Name, Marks);
        student.put(rollNo,Bio);

        break;

        case "2":
        
        for(String i : student.keySet())
        {

            System.out.println("=====================Student Record========================");

            System.out.println("Roll # :"+i+"...Student NAME ,Marks ::"+student.get(i));
            System.out.println("=====================--------------========================");

        }
        break;

    }

}
    while(!input.equals("-1"));
    
    }
}