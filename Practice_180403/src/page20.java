import java.util.Scanner;

public class page20 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while (true) {
			System.out.print("������ �Է��Ͻÿ� : ");
			int grade = input.nextInt();
			if (grade < 0)
				break;
			
			total += grade;
			count++;
		}
		System.out.println("����� "+ total / count);
	}

}
