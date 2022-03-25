/**java program to display the cube of the number up to a given integer*/
import java.util.Scanner;

public class Cube {
   public static void main(String args[]){
      int i;
      System.out.println("Enter a number :");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(i=1;i<=num;i++)
     {
      System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
   }
}
}

/**Enter a number :
5
Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
Number is : 5 and cube of 5 is : 125
*/
