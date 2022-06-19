public class Point3 {
    String target;
    public void set(Integer[] no,String target2){
Integer s=0;
int y=0;

        for (int i = 0; i < no.length; i++) {
            for (int j = 0; j < no.length; j++) {
                s=no[i]+no[j];
                if (s==Integer.valueOf(target)) {
                 y=y+1;   
                }                
            }
        }

        if (y>0) {
            System.out.println("TRUE");
        }
    }

    public static void main(String[] args) {
        Integer[] no={2,1,2,3,1};
        Point3 obj=new Point3();
        System.out.println("Enter the Target VAlue::");
        obj.target=System.console().readLine();
        obj.set(no,obj.target);
    }
}
