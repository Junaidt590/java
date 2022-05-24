package Graphics;

interface AreaRect{

	void area(int l,int b);
}


public class Rect implements AreaRect{
	
	public void area(int l,int b)
		{
			
			System.out.println("Area of Rectangle having\nlength="+l+"\nbreadth="+b);			
			System.out.println("Area of Rectangle :"+(l*b)+"\n-------");
		}
}
