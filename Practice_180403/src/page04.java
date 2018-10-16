import java.util.Scanner;

public class page04 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수를 입력하시오 : ");
		score = input.nextInt();
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}

}
