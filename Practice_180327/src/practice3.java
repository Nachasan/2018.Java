
import java.util.Scanner;

public class practice3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double distance;
		double liter;
		double mileage;
		
		System.out.println("������ ���α׷�");
		System.out.print("����Ÿ�(km) : ");
		distance = input.nextDouble();
		
		System.out.print("����� �ֹ��� ��(L) : ");
		liter = input.nextDouble();
		
		mileage = distance / liter;
		System.out.println("����� " + mileage + "km/L �Դϴ�.");
	}

}
