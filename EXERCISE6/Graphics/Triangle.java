package Graphics;

interface AreaTri{

	void area(int b,int h);
}


public class Triangle implements AreaTri{
	
	public void area(int b,int h)
		{
			System.out.println("Area of Triangle having\nbase="+b+"\nheight="+h);
			System.out.println("Area of Triangle :"+(0.5*b*h)+"\n-------");
		}
}
