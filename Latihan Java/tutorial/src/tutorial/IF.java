package tutorial;
import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//equals = jika s.sama dengan("isinya")
		if (s.equals("tim")) {
			System.out.println("you Typed Tim");
		}
		else if (s.equals("hello")) {
			System.out.println("you typed hello");
		}
		else if (s.equals("apa kabar?")) {
			System.out.println("you type apa kabar");
		}
		else {
		System.out.println("You not type hello or tim");
	}

}
}