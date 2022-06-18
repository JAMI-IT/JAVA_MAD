public class modifier {
    static void message(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void message1(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        modifier myObj=new modifier();
        myObj.message();
        myObj.message1();
    }
}
