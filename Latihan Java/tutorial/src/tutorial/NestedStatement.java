package tutorial;
import java.util.Scanner;

public class NestedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input your age: ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if (age >= 18) {
			System.out.println("You are an adult");
			System.out.println("input your favorite food:");
			String food = sc.nextLine();
			
			if (food.equals("pizza")) {
				System.out.println("your favorite food is pizza");
			}	
			else {
				System.out.println("your favorite food is not pizza");
			}
		}
		
		else if (age >= 13) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are a baby");
		}
		
	}

}
