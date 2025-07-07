//Author==> MtanvirA
import java.util.Scanner;
public class VotingAndDriving {
    public static void main(String args[])
    {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= userInput.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for both driving and voting");

        }
        else if(age>=16 && age<18)
        {
            System.out.println("You are eligible for driving but not for voting");
        }
        else
        {
            System.out.println("You are not eligible for both driving and voting");
        }
    }
}
