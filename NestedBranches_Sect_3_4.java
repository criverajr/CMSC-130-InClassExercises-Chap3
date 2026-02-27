/*
 * 3.4: Nested Branches:  
 *      
 *      You can nest an if inside either branch of an if statement
 *      
 *      Suggestion: Read textbook and slides for details.
 *                  Slide 33 shows the calculation of Tax example 
 */


import java.util.Scanner;

public class NestedBranches_Sect_3_4
{
   public static void main(String[] args)
   {  
      final double RATE1 = 0.10;
      final double RATE2 = 0.25;
      final double SINGLE_LIMIT = 32000;
      final double MARRIED_LIMIT = 64000;
      double tax = 0.0;

      // Read income and marital status
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter your income: ");
      double income = in.nextDouble();

      System.out.print("Please enter s for single, m for married: ");
      String maritalStatus = in.next();

      // Compute taxes due for single status
      if (maritalStatus.equals("s"))
      {
         if (income <= SINGLE_LIMIT)
         {
            tax = RATE1 * income;
         }
         else
         {
            tax = RATE1 * SINGLE_LIMIT + RATE2 * (income - SINGLE_LIMIT);
         }
      }
      
      // computing taxes for the married status
      // your code here
      
      
      // print it out
      System.out.println("The tax is $" + tax);
   }
}
