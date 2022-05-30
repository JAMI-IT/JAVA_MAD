class loops {

    public static void main(String[] args)
    {
        // while 
        // do -  while
        // for 
        //  foreach

        int i=0;

        while(i<10)
        {
            System.out.println("hellow world");
            i++;

        }

        do
        {
            System.out.println("hellow Do Whilr world");
            i++;
        }while(i<10);

        for(int j=0;j<10;j++)
        {
            System.out.println("For loop");
        }

        //Arayys
        // int[] mark=new int [2];
        // mark[0]=1;
        // mark[1]=32;


        int[] mark =new int[5];

        for (int a = 0; a < mark.length; a++) {
            int  c= a;
            System.out.println("Enter the MArks :"+ ++c);
            mark[a]=Integer.parseInt(System.console().readLine());
        }
        
        int sum=0;
        for (int s : mark) {

             sum= sum+mark[s];
             
        }
        System.out.println(sum);

    }
    
}
