import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Enter the day of the week: ");
        Scanner userInput= new Scanner(System.in);
        int day= userInput.nextInt();
        switch (day) {
            case 1:
                System.err.println("Sunday");
                break;
            case 2:
                System.err.println("Monday");
                break;
            case 3:
                System.err.println("Tuesday");
                break;
            case 4:
                System.err.println("Wednesday");
                break;
            case 5:
                System.err.println("Thursday");
                break;
            case 6:
                System.err.println("Friday");
                break;
            case 7:
                System.err.println("Saturday");
                break;
            default:
                System.err.println("Error day!");
        }
    }
}
