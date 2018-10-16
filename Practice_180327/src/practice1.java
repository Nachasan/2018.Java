import java.util.Scanner;

public class practice1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int money;
		int price;
		int tax;
		int rest;
		
		System.out.print("ªÛ«∞ ∞°∞› : ");
		price = input.nextInt();
		
		System.out.print("πﬁ¿∫ µ∑ : ");
		money = input.nextInt();
		
		tax = price / 10;
		rest = money - price - tax;
		
		System.out.println("∫Œ∞°ºº : " + tax);
		System.out.println("¿‹µ∑ : " + rest);
	}

}
