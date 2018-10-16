import java.util.Scanner;

public class page14 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int answer = 54;
		int guess;
		int tries = 0;
		
		do {
			System.out.println("1 ~ 100 사이의 정수를 추측해보세요.");
			guess = input.nextInt();
			tries++;
			
			if(guess > answer) {
				System.out.println("입력한 정수보다 낮습니다.");
			}
			else if (guess < answer) {
				System.out.println("입력한 정수보다 높습니다.");
			}
		}while(guess != answer);
		
		System.out.println("축하합니다. 시도횟수 = "+tries);
	}
}
