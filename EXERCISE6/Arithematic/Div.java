package Arithematic;

interface Division{

		void Result(int a,int b);

}
public class Div implements Division{

		public void Result(int a,int b){
			System.out.println("Division Result");
			System.out.println("Result="+(a/b)+"\n----------");
			}
}
