import java.util.Scanner;

public class page14 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int answer = 54;
		int guess;
		int tries = 0;
		
		do {
			System.out.println("1 ~ 100 ������ ������ �����غ�����.");
			guess = input.nextInt();
			tries++;
			
			if(guess > answer) {
				System.out.println("�Է��� �������� �����ϴ�.");
			}
			else if (guess < answer) {
				System.out.println("�Է��� �������� �����ϴ�.");
			}
		}while(guess != answer);
		
		System.out.println("�����մϴ�. �õ�Ƚ�� = "+tries);
	}
}
