public class task1 {
    public static void main(String[] args) {
        Double marks[]=new Double[5];
        Double sum=0.0;
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter marks["+i+"]=");
            marks[i]=Double.parseDouble(System.console().readLine());
            sum+=marks[i];
        }
        System.out.println("Total Marks="+sum);
    }

    
}
