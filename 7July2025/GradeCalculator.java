
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner userInput= new Scanner(System.in);
        int num= userInput.nextInt();
        if(num>=80)
        {
            System.err.println("Your grade is: A");
        }
        else if(num>=70)
        {
            System.err.println("Your grade is: B");
        }
        else if(num>=60)
        {
            System.err.println("Your grade is: C");
        }
        else if(num>=50)
        {
            System.err.println("Your grade is: D");
        }
        else 
        {
            System.err.println("Your grade is: F");
        }
        
        
    }
}
