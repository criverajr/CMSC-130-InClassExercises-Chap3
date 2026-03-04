/*
 * 3.2: String Comparison:
 *      1) Use equals method for content comparison.
 *      2) Use "==" to compares the locations of 
 *              two strings, and not their contents.
 *      3) Use "compareTo" method to compare Strings 
 *              in ‘dictionary’ order.
 *           
 *      Suggestion: Read textbook and slides for details.        
 */

import java.util.Scanner;

public class StringComparison_Sect_3_2
{
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a string for str1: ");
      String str1 = in.next();
      
      System.out.print("Please enter a string for str2: ");
      String str2 = in.next();
      
      // lexicographic order between str1 and str2
      if(str1.compareTo(str2) < 0){
          System.out.println(str1 + " comes before " + str2);
      }
      
      if(str1.compareTo(str2) == 0){
          System.out.println(str1 + " equals " + str2);
      }
      
      if(str1.compareTo(str2) > 0){
          System.out.println(str2 + " comes before " + str1);
      }
      
      // Use equals method for content comparison
      if(str1.equals(str2)){
          System.out.println(str1 + " equals " + str2);
      }
      
      // comparing two string reference
      if(str1 == str2){
          System.out.println(str1 + " has the same reference as " + str2);
      } else{
          System.out.println(str1 + " does not share a reference with " + str2);

      }
      
   }    
}
