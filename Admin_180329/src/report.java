import java.util.Scanner;

public class report {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int sec1;
		int sec2;
		int min;
		int hour;
		
		System.out.print("�ʸ� �Է��Ͻÿ�:");
		sec1 = input.nextInt();
		
		sec2 = sec1 % 60;
		min = (sec1 / 60) % 60;
		hour = sec1 / 3600;
		
		System.out.println(hour + "��"+ min + "��" + sec2 + "��");
		
	}

}
