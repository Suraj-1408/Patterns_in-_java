import java.util.*;

public class IntegrPyramid {
        public static void main(String[] args){
                System.out.println("Printing Integer Pyramid Pattern");

                Scanner sc=new Scanner(System.in);
                System.out.print("Enter total rows:");
                int row=sc.nextInt();

                
                for(int i=1;i<=row;i++)
                {
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(j);
                        }

                        System.out.println();
                }
                sc.close();
        // return 0;
         
    }
        
}
