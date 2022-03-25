/**read a floating-point number and if the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,00,000*/
import java.util.Scanner;
public class Float {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double num = in.nextDouble();

        if (num > 0)
        {
            if (num < 1)
            {
                System.out.println("Positive small number");
            }
            else if (num > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (num < 0)
        {
            if (Math.abs(num) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(num) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}

/**Enter a value: -1
Negative number

Enter a value: 10
Positive number

Enter a value: 000
Zero

Enter a value: 10000000
Positive large number

Enter a value: -10000000
Negative large number


Enter a value: 0.5
Positive small number
*/

