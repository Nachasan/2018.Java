import java.util.Scanner;

class BankAccoun{
	private String accountNumber;
	private String owner;
	public int balance;
	Scanner sc = new Scanner(System.in);
	
	public void Account() {
		System.out.print("���¹�ȣ : ");
		accountNumber = sc.nextLine();
		System.out.print("������ : ");
		owner = sc.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		balance = sc.nextInt();
	}
	
	void deposit (int amount) {
		balance+=amount;
	}
	
	void withdraw (int amount) {
		if (balance-amount <0)
			System.out.println("�ܾ��� �����մϴ�.");
		else
			balance-=amount;
	}
	
	public String toString() {
		String buf="";
		buf+="���¹�ȣ : " + accountNumber + "\n";
		buf+="������ : " + owner + "\n";
		buf+="�ܾ� : " + balance;
		return buf;
	}
	
	public void sendAccount(int amount, BankAccoun otherAccount) {
		if (balance>amount) {
			withdraw(amount);
			otherAccount.deposit(amount);
		}
		else
			System.out.println("�ܾ��� �����մϴ�.");
	}
	
//	public void menu() {
//		System.out.println("���ڸ� �Է��Ͻÿ� (1.���»���/2.�Ա�/3.���/4.��ü/5.����Ȯ��) : ");
//		int choose = sc.nextInt();
//		switch (choose) {
//		case 1:
//			Account();
//			break;
//		case 2:
//			System.out.print("�ݾ��� �Է��Ͻÿ� : ");
//			int money1 = sc.nextInt();
//			deposit(money1);
//			break;
//		case 3:
//			System.out.print("�ݾ��� �Է��Ͻÿ� : ");
//			int money2 = sc.nextInt();
//			withdraw(money2);
//			break;
//		case 4:
//			
//		}
//	}
}


public class report2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BankAccoun ac1 = new BankAccoun();
		BankAccoun ac2 = new BankAccoun();
		
		System.out.println("����1");
		ac1.Account();
		System.out.println("����2");
		ac2.Account();
		
		System.out.println("===========================");
		System.out.print("����1���� ����2�� ���� �ݾ� : ");
		int money = sc.nextInt();
		ac1.sendAccount(money, ac2);
		System.out.println("===========================");
		
		System.out.println("����1");
		System.out.println(ac1.toString());
		System.out.println("����2");
		System.out.println(ac2.toString());
		
	}

}
