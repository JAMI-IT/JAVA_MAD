public class constroctor {
    int x=0;
    public constroctor()
    {
        x=x+1;
    }
    public static void main(String[] args) {
        constroctor myObj=new constroctor();
        System.out.println(myObj.x);
        System.out.println(myObj.x);
    }
}
