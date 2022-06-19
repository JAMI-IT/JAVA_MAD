public class Factorials {
    public String n;
    public void Facto(String n){
        Integer var= Integer.valueOf(n);
    int v=var;
    v=v-1;
    for(int i=v;i>0;i--){
        var=var*i;
    }
    System.out.println(var);
    }
    public static void main(String[] args) {
        Factorials obj=new Factorials();
       
        obj.n=System.console().readLine();
        obj.Facto(obj.n);
        
    }
}
