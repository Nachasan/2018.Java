import java.util.Scanner;

public class practice3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, r=0;
		
	
		
		System.out.print("두개의 정수를 (큰수, 작은수) 순서로 입력하시오 : ");
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
