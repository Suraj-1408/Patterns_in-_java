import java.util.*;

public class solidrec {
    public static void main(String[] args){
        System.out.println("Java Program to print Solid Rectangle");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows in rectangle");
        int row=sc.nextInt();

        System.out.println("Enter cols in Rectangle");
        int col=sc.nextInt();

        for(int i=1;i<=row;i++){
            // System.out.println("*");

            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }

        sc.close();
    }
}
