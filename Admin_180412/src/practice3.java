import java.util.Scanner;

public class practice3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, r=0;
		
	
		
		System.out.print("�ΰ��� ������ (ū��, ������) ������ �Է��Ͻÿ� : ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println(x);
	}

}
