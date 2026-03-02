/*
 * 3.2: Number Comparison:
 *      Compares two values with an operator
 *          >   (greater than) 
 *          >=  (greater than or equal)
 *          <   (less than) 
 *          <=  (less than or equal)
 *          ==  (equal) 
 *          !=  (not equal)
 *                
 *      Suggestion: Read textbook and slides for details.      
 */

import java.util.Scanner;

public class NumberComparison_Sect3_2
{
    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number for a: ");
        int a = in.nextInt();

        System.out.print("Please enter a number for b: ");
        int b = in.nextInt();

        System.out.print("Please enter a number for c: ");
        int c = in.nextInt();

        // compare a and b and print out corresponding information
        if (a >= b){
            System.out.println(a + " is greater than or equal to " + b);
        } else {
            System.out.println(b + " is greater than or equal to " + a);
        }

        // case 1: a is largest
        if (a >= b && a >= c){
            System.out.println(a + " is the largest number");
        }
        
        if (b >= a && b >= c){
            System.out.println(b + " is the largest number");
        }
        
        if (c >= a && c >= b){
            System.out.println(c + " is the largest number");
        }
    }    
}
