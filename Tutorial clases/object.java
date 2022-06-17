public class object {
    int x=9;
    String nam="";
    static void my(){
        System.out.println("Jami");
    }
    void get(String name){
        nam=name;
    }
    void set(){
        System.out.println("=================================");
        System.out.println("Roll #::"+x+":Name ::"+nam);
    }
    public static void main(String[] args) {
        object obj=new object();
        obj.nam=System.console().readLine();
        // System.out.println(obj.x);
        obj.get(obj.nam);
        obj.set();
        my();
    }
}
