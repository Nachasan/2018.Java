
public class Practice1 {
	public static void main(String args[]) {
		int i;
		int j;
		
		for (i=2;i<248;i++) {
			System.out.printf("%d�� ��� : ", i);
			for (j=1;j<=i;j++) {
				if (i%j==0)
					System.out.print(j + " ");
			}
			
			for (j=2;j<=i;j++) {
				if (i%j==0) {
					if (i==j)
						System.out.print("�Ҽ��Դϴ�.");
					else
						break;//i%j==0 �� �� i==j�� �ƴ϶�� �� ���� �Ҽ��� �ƴϹǷ� �ݺ����� Ż���Ѵ�.
				}
			}
			System.out.print("\n");
		}
	}
}