
public class practice3 {
	public static void main(String args[]) {
		int[] num = new int[5];
		for (int i=0;i<num.length;i++)
			num[i]=(int)(Math.random()*1000);
		
		for(int value:num)
			System.out.println(value);
	}

}
