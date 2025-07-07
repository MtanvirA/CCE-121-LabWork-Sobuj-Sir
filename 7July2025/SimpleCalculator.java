import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= userInput.nextInt();
        System.out.println("Enter the oparator: ");
        char ch= userInput.next().charAt(0);
        System.out.println("Enter the second number: ");
        int b= userInput.nextInt();
        
        switch (ch) {
            case '+':
                System.out.println("The result is: "+ (a+b));
                break;     
            case '-':
                System.out.println("The result is: "+ (a-b));
                break;
            case '*':
                System.out.println("The result is: "+ (a*b));
                break;
            case '/':
                System.out.println("The result is: "+ (a/b));
                break;
        }
    }
}
