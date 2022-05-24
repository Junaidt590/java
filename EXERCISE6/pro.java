import Graphics.*;

class pro{

	public static void main(String args[]){
				Rect r=new Rect();
				r.area(1,2);
				Triangle t=new Triangle();
				t.area(5,10);
				Square s=new Square();
				s.area(10);
				Circ c=new Circ();
				c.area(1.0);

				}
}

/**
OUTPUT
------

Area of Rectangle having
length=1
breadth=2
Area of Rectangle :2
-------
Area of Triangle having
base=5
height=10
Area of Triangle :25.0
-------
Area of Square having
side=10
Area of Square :100
-------
Area of Circle having
radius=1.0
Area of Circle :3.14
-------

*/
