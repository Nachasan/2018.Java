import java.util.Scanner;

public class practice2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		int i, j, k;
		
		System.out.print("���� �Է��Ͻÿ� : ");
		k = sc.nextInt();
		
		for (i=1;i<=k;i++) {
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
