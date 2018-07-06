class Car{
	
	private int speed;
	
	public void setSpeed(int s) 		{speed=s;}
	public void setSpeed(double s) 		{speed=(int)s;}
	public int getSpeed() 				{return speed;}
}
public class practice2 {
	public static void main(String args[]) {
		Car c = new Car();
		Car cc = new Car();
		
		c.setSpeed(1.2);
		cc.setSpeed(1);
		System.out.println(c.getSpeed());
		System.out.println(cc.getSpeed());
	}

}
