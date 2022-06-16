package Classes;
import java.util.HashMap;
import java.util.Map.Entry;

public class Student {
    
    // attribute of your chooice but all attributes must be private
    String name;
    Integer age;
    String roll_no;
    HashMap<String,Integer>result=new HashMap<String,Integer>();

    public Student(){
    }
    public Student(String roll_no,String name,Integer age){
       this.roll_no=roll_no;
       this.name=name;
       this.age=age;
    }
    public Student(String roll_no,String name,Integer age,HashMap<String,Integer> result){
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
        this.result=result;
    }

    public void AddResult(String Subject,Integer Marks){
      this.result.put(Subject, Marks);
    }

    public HashMap<String,Character> GetGrades(){
        HashMap<String,Character> grades=new HashMap<String,Character>();
        for(Entry<String,Integer> course:this.result.entrySet()){
            Character grade;
            Integer marks=course.getValue();
            if(marks>=80){
              grade='A';
            }
            else if(marks>=70){
                grade='B';
            }
            else if(marks>=60){
                grade='C';
            }
            else if(marks>=50){
                grade='D';
            }
            else{
                grade='F';
            }
            grades.put(course.getKey(), grade);
        }
        return grades;
    }

    public Double GetCgpa(){
        Double cc=0.0;
        Integer total_cd=0;
        for(Entry<String,Integer> course:this.result.entrySet()){
            Integer marks=course.getValue();
            if(marks>=80){
                cc+=4*3;
                total_cd+=3;
              }
              else if(marks>=70){
        
                total_cd+=3;
        
        
                cc+=3.0*3;
                total_cd+=3;
              }
              else if(marks>=50){
                cc+=2.5*3;
                total_cd+=3;
              }
              else{
                cc+=1.0*3;
                total_cd+=3;
              }
        }
        return (cc/total_cd);
}
}

