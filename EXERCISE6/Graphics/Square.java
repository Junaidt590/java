package Graphics;

interface AreaSqu{

	void area(int a);
}


public class Square implements AreaSqu{
	
	public void area(int a)
		{
			
			System.out.println("Area of Square having\nside="+a);			
			System.out.println("Area of Square :"+(a*a)+"\n-------");
		}
}
