class task {
    
    public static void main(String[] args)
{

    int[] marks=new int[5]; 

    

    for (int i = 0; i < marks.length; i++) {
        int n=i;
        System.out.println("Enter the student marks :"+ ++n);

        marks[i]=Integer.parseInt(System.console().readLine());

    }

        System.out.println("Student Grade View");

        for (int g = 0; g < marks.length; g++) {

            if(marks[g]>80)
            {
                System.out.println("Grade of Student is ( A )  Marks :"+marks[g]);
            }
            else if(marks[g]>70)
            {
                System.out.println("Grade of Student is ( B )  Marks :"+marks[g]);
            }
            else if(marks[g]>60)
            {
                System.out.println("Grade of Student is ( C )  Marks :"+marks[g]);
            }
            else if(marks[g]>50)
            {
                System.out.println("Grade of Student is ( D )  Marks :"+marks[g]);
            }
            else if(marks[g]<50)
            {
                System.out.println("Grade of Student is ( FAIL )  Marks :"+marks[g]);
            }


            
        }


}



}
  