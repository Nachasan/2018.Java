
public class report {
	public static void main(String args[]) {
		int i;
		int j=0;
		int k=1;
		int l;
		
		System.out.println(j);
		System.out.println(k);
		for (i=1;i<9;i++) {
			l = j + k;
			System.out.println(l);
			j = k;
			k = l;
		}
	}

}
