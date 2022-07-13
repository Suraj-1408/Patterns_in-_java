import java.util.*;

public class Halfpyramid {
        public static void main(String[] args){

            System.out.println("Printing the Half Pyramid Pattern having *");
            Scanner sc= new Scanner(System.in);

            System.out.println("Rows");
            int row=sc.nextInt();

            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            sc.close();
        }    
}
