
import java.util.Scanner;

public class practice2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = input.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = input.nextInt();
		
		System.out.println("�̸��� " + name + "�̰� ���̴� " + age + "�� �Դϴ�.");
	}

}
