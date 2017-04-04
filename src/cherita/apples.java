package cherita;
import java.util.Scanner;

class apples{
	public static void main (String arg[]) {
		Scanner input = new Scanner(System.in);
		oranges orangeObject = new oranges();
		System.out.println("Enter your message here: ");
		
		String message=input.nextLine();
		
		orangeObject.simpleMessage(message);
		
		input.close();
		
	}
}
