
class Rectangle{
	private double width;
	private double height;
	
	public void setWidth(double w)	{width=w;}
	public void setheight(double h) {height=h;}
	public double area() 			{return width*height;}	
	public double perimeter() 		{return (width+height)*2;}
}

public class practice1 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		
		r.setWidth(3.0);
		r.setheight(4.0);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
	}

}
