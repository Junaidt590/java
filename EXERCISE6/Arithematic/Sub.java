package Arithematic;

interface Subtraction{

		void Result(int a,int b);

}
public class Sub implements Subtraction{

		public void Result(int a,int b){
			System.out.println("Subtraction Result");
			System.out.println("Result="+(a-b)+"\n----------");
			}
}
