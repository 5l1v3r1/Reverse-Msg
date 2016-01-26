import java.util.Scanner;
public class StringMessageTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int input;
		
		System.out.print("Enter index for String: > ");
		input = sc.nextInt();
		System.out.println("Char is : " + name.charAt(input));



		
	
		}
}
