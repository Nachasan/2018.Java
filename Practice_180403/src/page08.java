import java.util.Scanner;

public class page08 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		number = input.nextInt();
		switch (number) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
		
		}
	}

}
