import java.util.Scanner;
public class Largest {
    public static void main(String args[])
    {
        System.out.println("Enter the three numbers: ");
        int num1, num2, num3;
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        num1= userInput.nextInt();
        System.out.println("Enter the second integer: ");
        num2= userInput.nextInt();
        System.out.println("Enter the third integer: ");
        num3= userInput.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("The largest number is: "+num1);
            }
            else
            {
                System.out.println("The largest number is: "+num3);
            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.println("The largest number is: "+num2);
            }
            else
            {
                System.out.println("The largest number is: "+num3);
            }
        }
        
    }
}
