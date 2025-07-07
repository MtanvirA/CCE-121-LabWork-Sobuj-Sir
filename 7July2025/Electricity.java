
import java.util.Scanner;

public class Electricity{
    public static void main(String[] args) {
        System.out.println("Enter total unit consumption of this month: ");
        Scanner userInput= new Scanner(System.in);
        double unit= userInput.nextInt();
        if(unit>100)
        {
            System.err.println("Your electricity bill is: "+(unit*6.5));
        }
        else if(unit>75)
        {
            System.err.println("Your electricity bill is: "+(unit*5.5));
        }
        else
        {
            System.err.println("Your electricity bill is: "+(unit*4));
        }
    }
}