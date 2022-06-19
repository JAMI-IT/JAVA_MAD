import java.util.ArrayList;
public class List {
    ArrayList<Integer> noList=new ArrayList<Integer>();
    public void NoList(Integer n)
    {
        String no;
        System.out.println("Enter the integer Value in the Array List ::");
        for(int i=0;i<n;i++)
        {
            no=System.console().readLine();
            Integer var=Integer.valueOf(no);
            noList.add(var);
        }
    }

    public void Disp(){
        System.out.println("---No Of Integer Present in The Array Lis::");
        System.out.println(noList);
    }

    public static void main(String[] args) {
        List obj=new List();
        String n;
        System.out.println("Enter the Array List Size ::");
        n=System.console().readLine();
        Integer no= Integer.valueOf(n);
        obj.NoList(no);
        obj.Disp();
    }
}
