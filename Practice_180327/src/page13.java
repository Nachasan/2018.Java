
public class page13 {
	public static void main(String args[]) {
		int x = 0x00000fff;
		int y = 0x0000fff0;
		System.out.printf("%x\n", (x&y));
		System.out.printf("%x\n", (x|y));
		System.out.printf("%x\n", (x^y));
		System.out.printf("%x\n", ~x);
		System.out.printf("%x\n", (x<<4));
		System.out.printf("%x\n", (x>>4));
		System.out.printf("%d\n", (-1 >>> 4));
	}

}
