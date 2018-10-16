
import java.util.Scanner;

public class practice2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름을 입력하시오 : ");
		name = input.nextLine();
		
		System.out.print("나이를 입력하시오 : ");
		age = input.nextInt();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세 입니다.");
	}

}
