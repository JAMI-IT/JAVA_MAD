import java.net.PortUnreachableException;
import java.time.Year;

public class Date {
    int Month;
    int Day;
    int Year;
    public Date(int Month,int Day,int Year){
        this.Month=Month;
        this.Day=Day;
        this.Year=Year;
    }
    public void Display(){
        System.out.println(Month+" / "+Day+" / "+Year);
    }

    public static void main(String[] args) {
        String m,d,y;
        System.out.println("Enter the Month");
        m=System.console().readLine();
        System.out.println("Enter the Day::");
        d=System.console().readLine();
        System.out.println("Enter the Year");
        y=System.console().readLine();
        Date obj=new Date(Integer.valueOf(m),Integer.valueOf(d),Integer.valueOf(y));
        obj.Display();
    }

}
