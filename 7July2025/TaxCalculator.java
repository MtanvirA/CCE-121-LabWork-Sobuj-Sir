
import java.util.Scanner;

//Author==> MtanvirA
public class TaxCalculator{
    public static void main(String args[])
    {
        System.out.println("Enter your salary: ");
        Scanner userInput= new Scanner(System.in);
        double salary= userInput.nextDouble();
        if(salary>=250000)
        {
            System.out.println("Your tax is: "+ salary*.05);
        }
        else
        {
            
            System.out.println("Your tax is: "+ salary*0);
        }
    }
}