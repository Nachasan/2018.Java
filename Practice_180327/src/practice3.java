
import java.util.Scanner;

public class practice3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double distance;
		double liter;
		double mileage;
		
		System.out.println("연비계산 프로그램");
		System.out.print("주행거리(km) : ");
		distance = input.nextDouble();
		
		System.out.print("사용한 휘발유 양(L) : ");
		liter = input.nextDouble();
		
		mileage = distance / liter;
		System.out.println("연비는 " + mileage + "km/L 입니다.");
	}

}
