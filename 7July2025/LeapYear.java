import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        System.err.println("Enter the year: ");
        Scanner userInput= new Scanner(System.in);
        int year= userInput.nextInt();
        if(year%400==0)
        {
            System.err.println("The year is a leap year.");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.err.println("The year is a leap year.");
        }
        else
        {
            System.err.println("The year is not a leap year.");
        }
    }
}
