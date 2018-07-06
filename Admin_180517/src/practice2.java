
public class practice2 {
	public static void main(String args[]) {
		int[][] e = new int[3][4];
		
		for (int i=0;i<e.length;i++)
			for (int j=0;j<e[i].length;j++)
				e[i][j]=i+j;
		
		for (int i=0;i<e.length;i++) {
			for (int j=0;j<e[i].length;j++)
				System.out.print(e[i][j]+" ");
			System.out.println();
		}
		
		
	}

}
