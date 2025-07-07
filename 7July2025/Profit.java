import java.util.Scanner;
public class Profit{
    public static void main(String[] args) {
        System.out.println("Enter the buying price: ");
        Scanner userInput= new Scanner(System.in);
        int buy= userInput.nextInt();
        System.out.println("Enter the selling price: ");
        int sell= userInput.nextInt();
        if(buy>sell)
        {
            System.out.println("Loss");
        }
        else
        {
            System.out.println("Profit");
        }

    }
}
