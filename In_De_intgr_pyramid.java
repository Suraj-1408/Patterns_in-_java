import java.util.*;
public class In_De_intgr_pyramid {
        public static void main(String[] args)
        {
            System.out.println("Printing  Increment  and Decrement Intger Pyramid");

            Scanner sc =new Scanner(System.in);
            System.out.print("Enter total rows:");
            int row=sc.nextInt();

            
            // Printing Increment Pyramid 
            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }

            // Printing Decrement Integer Pyramid 

            for(int i=row;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        sc.close();
        }

}
