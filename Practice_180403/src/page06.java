import java.util.Scanner;

public class page06 {
	public static void main(String argw[]) {
		Scanner input = new Scanner(System.in);
		
		int income;
		int tax;
		
		System.out.print("���� ǥ�� �ݾ��� �Է��Ͻÿ� : ");
		income = input.nextInt();
		
		if (income <= 1000)
			tax = (int) (0.09 * income);
		else if (income <= 4000)
			tax = (int) (0.18 * income);
		else if (income <= 8000)
			tax = (int) (0.27 * income);
		else
			tax = (int) (0.36 * income);
		System.out.printf("�ҵ漼�� %d �Դϴ�. \n", tax);
	}

}
