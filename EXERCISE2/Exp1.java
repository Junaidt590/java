import java.util.*;

class Matrix  {
	public static void main(String args[]) {
                Scanner obj = new Scanner(System.in);
		System.out.println("Enter the rows columns:");
		System.out.print("Rows :");
		int rows=obj.nextInt();
		System.out.print("Columns :");
		int cols=obj.nextInt();
		int array1[][]= new int[rows][cols];
		int array2[][]= new int[rows][cols];
		int result[][]= new int[rows][cols];
                   
                System.out.println("Enter the no of elements in first matrix:"); //adding elements to 1st array
                for(int i=0;i<rows;i++)
                {
                 for(int j=0;j<cols;j++) 
	        {
	         array1[i][j]=obj.nextInt();
				
		}
		}
                System.out.println("Enter the of elements in second matrix:");
                for(int i=0; i<rows; i++)
                {
                for(int j=0;j<cols;j++)
                {
                 array2[i][j]=obj.nextInt();
                }
                }
                System.out.println("Result matrix is given below:");
                for(int i=0;i<rows;i++)
                {
                 for(int j=0;j<cols;j++)
                {
                 result[i][j]=array1[i][j]+array2[i][j];
                System.out.print("\t"+result[i][j]);
                 }
                 System.out.print("\n");
	         }
          
        }
}



/*
OUTPUT

Enter the rows columns:
Rows :3
Columns :3
Enter the no of elements in first matrix:
1 3 6 
9 4 6
8 7 4
Enter the of elements in second matrix:
1 3 6
9 4 6
8 7 4
Result matrix is given below:
	2	6	12
	18	8	12
	16	14	8

*/

                
                  
                 
