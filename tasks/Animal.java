public class Animal {
    String name;
    String color;

    public Animal(){
        this.name="";
        this.color = "";
    }
    public Animal(String name){
        this.name=name;
    }
    public void Name(String name){
        this.name = name;
    }
    public String Name(){
        return this.name;
    }

    public void makesound(){
        System.out.println("Animals can make sound");
    }
}


