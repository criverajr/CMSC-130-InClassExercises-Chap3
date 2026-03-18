/*
 * 3.3: Multiple Alternatives:
 *      Handling scenarios with more than two branches
 *      - Use if..else if.. else
 *      - Use switch clause
 *      
 *      Suggestion: Read textbook and slides for details.
 */

import java.util.*;

public class IfElse_Switch_Sect3_3
{
    public static void main() {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please a single digit:");
        int digit = keyboard.nextInt();
        String digitName = "";
        
        // option #1: if/elseif/else
        if(digit == 0){
            digitName = "Zero";
        } else if(digit == 1){
            digitName = "One";
        } else if(digit == 2){
            digitName = "Two";
        } else if(digit == 3){
            digitName = "Three";
        } else if(digit == 4){
            digitName = "Four";
        } else if(digit == 5){
            digitName = "Five";
        } else if(digit == 6){
            digitName = "Six";
        } else if(digit == 7){
            digitName = "Seven";
        } else if(digit == 8){
            digitName = "Eight";
        } else if(digit == 9){
            digitName = "Nine";
        } else {
            digitName = "Not a valid digit";
        }
        
        System.out.println(digit + " --> " + digitName);
        
        // option #2: switch statement 
        switch(digit) {
            case 0: digitName = "Zero"; break;
            case 1: digitName = "One"; break;
            case 2: digitName = "Two"; break;
            case 3: digitName = "Three"; break;
            case 4: digitName = "Four"; break;
            case 5: digitName = "Five"; break;
            case 6: digitName = "Six"; break;
            case 7: digitName = "Seven"; break;
            case 8: digitName = "Eight"; break;
            case 9: digitName = "Nine"; break;
            default: "Not a valid digit";
        }
    }
}
