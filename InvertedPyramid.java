import java.util.*;

public class InvertedPyramid {
        public static void main(String[] args){

            System.out.println("Printing the Inverted Half Pyramid Pattern having *");
            Scanner sc= new Scanner(System.in);

            System.out.println("Rows");
            int row=sc.nextInt();

            for(int i=row;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            sc.close();
        }    
}
