
public class practice5 {
	public static void main(String args[]) {
		int money = 400;
		int coffee = 10;
		
		while (money != 0) {
			System.out.println("Ä¿ÇÇ¸¦ ¸¶¼Ì´Ù.");
			money -= 30;
			coffee--;
			if (coffee==0) {
				break;
			}
		}
		System.out.printf("³²Àºµ· : %d", money);
	}

}
