import java.util.Scanner;

public class practice1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int money;
		int price;
		int tax;
		int rest;
		
		System.out.print("��ǰ ���� : ");
		price = input.nextInt();
		
		System.out.print("���� �� : ");
		money = input.nextInt();
		
		tax = price / 10;
		rest = money - price - tax;
		
		System.out.println("�ΰ��� : " + tax);
		System.out.println("�ܵ� : " + rest);
	}

}
