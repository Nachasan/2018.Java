import java.util.Scanner;

public class practice1 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	
		int[] score = new int[5];
		int sum=0;
		
		for (int i=0;i<score.length;i++) {
			System.out.print("점수 입력 : ");
			score[i] = sc.nextInt();
		}
		for (int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		System.out.println("평균 = "+ sum/5);
	
	}
}
