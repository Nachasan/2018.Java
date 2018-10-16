
public class Practice1 {
	public static void main(String args[]) {
		int i;
		int j;
		
		for (i=2;i<248;i++) {
			System.out.printf("%d의 약수 : ", i);
			for (j=1;j<=i;j++) {
				if (i%j==0)
					System.out.print(j + " ");
			}
			
			for (j=2;j<=i;j++) {
				if (i%j==0) {
					if (i==j)
						System.out.print("소수입니다.");
					else
						break;//i%j==0 일 때 i==j가 아니라면 그 수는 소수가 아니므로 반복문을 탈출한다.
				}
			}
			System.out.print("\n");
		}
	}
}