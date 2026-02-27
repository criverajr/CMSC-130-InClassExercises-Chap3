
import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a year:");
        int year = keyboard.nextInt();
        boolean leap = false;
        
        // use boolean operators to simplify the leap year determination
		
        
        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
