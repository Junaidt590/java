package Arithematic;

interface Multiplication{

		void Result(int a,int b);

}
public class Mul implements Multiplication{

		public void Result(int a,int b){
			System.out.println("Multiplication Result");
			System.out.println("Result="+(a*b)+"\n----------");
			}
}
