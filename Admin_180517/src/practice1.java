import java.util.Scanner;

public class practice1 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	
		int[] score = new int[5];
		int sum=0;
		
		for (int i=0;i<score.length;i++) {
			System.out.print("���� �Է� : ");
			score[i] = sc.nextInt();
		}
		for (int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		System.out.println("��� = "+ sum/5);
	
	}
}
