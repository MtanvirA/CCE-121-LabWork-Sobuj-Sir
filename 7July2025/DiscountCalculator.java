
import java.util.Scanner;


public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the price of the product: ");
        Scanner userInput= new Scanner(System.in);
        double price= userInput.nextInt();
        if(price>=5000)
        {
            double price1= (price)-(price*.02);
            System.out.println("The discounted price is: "+ price1);
        }
        else if (price>=1000) {
            double price2= (price)-(price*.01);
            System.out.println("The discounted price is: "+ price2);
            
        }
        else
        {
            System.out.println("The discounted price is: "+ price);
        }
    }
    
}
