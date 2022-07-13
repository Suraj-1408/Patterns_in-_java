import java.util.*;

public class LEFThalfpyramid {
        public static void main(String[] args){
            System.out.println("Printing LEFT Half Pyramid 180 rotation");

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter total row:");
            int row=sc.nextInt();

            // Outer loop for Iterating from 1 to N^th value
            for(int i=1;i<=row;i++)
            {
            //      1st Inner for loop is used ot print the n-i no. of SPACES 
                    for(int j=1;j<=row-i;j++)
                    {
                        System.out.print(" ");

                    }
                    
                    //  2nd Inner For loop is used to print the no. of STARS
                            for(int j=1;j<=i;j++)
                            {
                                System.out.print("*");
                            }
                    
                    System.out.println("");
            }
            sc.close();
        }
}
