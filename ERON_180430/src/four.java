class Point{
	private int x, y;
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class Circle {
	private int radius = 0;
	private Point center; //선언을 따로 안해도 상관없나?
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
}
public class four {
	public static void main(String args[]) {
		
		Point p = new Point(25,78);
		Circle c = new Circle(p,10);
	}

}
