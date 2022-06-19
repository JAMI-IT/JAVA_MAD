public class Point5 {
     static String n;
    public void Multi(Integer n){
        System.out.println("N      10*N   100*N     1000*N");
        for (int i =1; i <= n; i++) {
            System.out.println(i+"      "+i*10+"      "+100*i+"      "+1000*i);
        }
    }
public static void main(String[] args) {
    Point5 obj=new Point5();
    System.out.println("ENter the Value Of N ::");
    obj.n=System.console().readLine();
    obj.Multi(Integer.valueOf(n));
}
}
