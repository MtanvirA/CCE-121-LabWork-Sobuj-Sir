import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        
        System.err.println("Enter the length of the first side: ");
        int a= userInput.nextInt();
        System.err.println("Enter the length of the second side: ");
        int b= userInput.nextInt();
        System.err.println("Enter the length of the third side: ");
        int c= userInput.nextInt();
        if(a+b> c && b+c> a && c+a> b)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("Invalid Triangle");
        }
    }
}
