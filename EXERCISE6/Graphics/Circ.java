package Graphics;

interface AreaCirc{

	void area(double r);

}

public class Circ implements AreaCirc{
	
	public void area(double r){
		System.out.println("Area of Circle having\nradius="+r);
		System.out.println("Area of Circle :"+(3.14*r*r)+"\n-------");
	}
}
