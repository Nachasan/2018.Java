import java.util.Scanner;

public class Practice2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int mon;
		
		System.out.print("달을 숫자만 입력하시오 : ");
		mon = input.nextInt();
		
		if (mon<=2 || mon==12 )
			System.out.println("겨울");
		else if (3<=mon || mon<=5)
			System.out.println("봄");
		else if (6<=mon || mon<=8)
			System.out.println("여름");
		else if (9<=mon || mon<=11)
			System.out.println("가을");
	}

}
