import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {

    
    {
        System.out.println("Enter the serial of the month: ");
        
        Scanner userInput= new Scanner(System.in);
        int month= userInput.nextInt();
        switch (month) 
        {
            case 1:
                System.out.println("31 Days");
                break;
            
            case 2:
                System.out.println("29 Days");
                break;
            case 3:
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("30 Days");
                break;
            case 5:
                System.out.println("31 Days");
                break;
            case 6:
                System.out.println("30 Days");
                break;
            case 7:
                System.out.println("31 Days");
                break;
            case 8:
                System.out.println("31 Days");
                break;
            case 9:
                System.out.println("30 Days");
                break;
            case 10:
                System.out.println("31 Days");
                break;
            case 11:
                System.out.println("30 Days");
                break;
            case 12:
                System.out.println("31 Days");
                break;


            
            default:
                System.out.println("Error month serial");
        }
    }
}
}
