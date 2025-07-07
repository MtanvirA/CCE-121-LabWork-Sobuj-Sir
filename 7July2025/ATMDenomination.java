
import java.util.Scanner;


public class ATMDenomination {
    public static void main(String[] args) {
        System.out.println("Enter the amount to be withdrawn: ");
        Scanner userInput= new Scanner(System.in);
        int money = userInput.nextInt();
        
        if(money%100==0)
        {
            System.out.println("Possible");
        }
        else
        {
            System.out.println("Impossible");
        }
    }
}
