import java.util.Scanner;

public class Practice1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int mid;
		int end;
		int practice;
		double avg;
		
		System.out.print("�߰���� ������ �Է��Ͻÿ� : ");
		mid = input.nextInt();
		
		System.out.print("�⸻��� ������ �Է��Ͻÿ� : ");
		end = input.nextInt();
		
		System.out.print("�ǽ� ������ �Է��Ͻÿ� : ");
		practice = input.nextInt();
		
		avg = (double)(mid+end+practice)/3;
		
		if (avg>=96)
			System.out.println("A+");
		else if (avg>=91)
			System.out.println("A0");
		else if (avg>=86)
			System.out.println("B+");
		else if (avg>=81)
			System.out.println("B0");
		else if (avg>=76)
			System.out.println("C+");
		else if (avg>=71)
			System.out.println("C0");
		else if (avg>=66)
			System.out.println("D+");
		else if (avg>=61)
			System.out.println("D0");
		else
			System.out.println("F");
		
		
		
	}

}
