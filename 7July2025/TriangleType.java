
import java.util.Scanner;


public class TriangleType {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the first length of the side: ");
        int a= userInput.nextInt();
        System.out.println("Enter the second length of the side: ");
        int b= userInput.nextInt();
        System.out.println("Enter the third length of the side: ");
        int c= userInput.nextInt();
        if(a+b> c || b+c> a || c+a> b)
        {
            if(a==b && b==c)
        {
            System.out.println("The triangle is Equilateral");
        }
        else if(a==b || b==c || c==a)
        {
            System.err.println("The triangle is Isosceles");
        }
        else
        {
            System.out.println("The triangle is Scalene");
        }
        }
        else
        {
            System.out.println("Error in triangle");
        }

    }
}
