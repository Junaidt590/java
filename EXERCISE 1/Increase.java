/**program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"otherwise*/
import java.util.Scanner;
public class Increase {
   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = in.nextDouble();
        System.out.print("Enter second number: ");
        double y = in.nextDouble();
        System.out.print("Enter third number: ");
        double z = in.nextDouble();
        if (x < y && y < z)//
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
/**Enter first number: 50
Enter second number: 100
Enter third number: 105
Increasing order
Enter first number: 250
Enter second number: 153
Enter third number: 203 
Neither increasing or decreasing order
Enter first number: 100
Enter second number: 95
Enter third number: 80
Decreasing order
*/
