import java.util.*;
public class Hollowrec {
    public static void main(String[] args){
        System.out.println("Printing Patter of hollow rectangle");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows in rect:");
        int row=sc.nextInt();

        System.out.print("Enter cols in Rect:");
        int col=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || i==row || j==col)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println("");
            
        }
        sc.close();
        
    }
}
