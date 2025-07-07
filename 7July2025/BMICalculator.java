
import java.util.Scanner;


public class BMICalculator {
   public static void main(String[] args) {
       Scanner userInput= new Scanner(System.in);
       System.out.println("Input your weight in KG: ");
       double weight= userInput.nextDouble();
       System.out.println("Input your height in meters: ");
       double height= userInput.nextDouble();
       double BMI= weight/(height*height);
       if(BMI>= 40)
       {
            System.out.println("Morbidly Obese");
       }
       else if(BMI>= 35)
       {
            System.out.println("Obese (Class 2)");
       }
       else if(BMI>= 30)
       {
            System.out.println("Obese (Class 1)");
       }
       else if(BMI>= 25)
       {
            System.out.println("Overweight");
       }
       else if(BMI>= 20)
       {
            System.out.println("Normal weight");
       }
       else
       {
            System.out.println("Under Weight");
       }
   } 
}
