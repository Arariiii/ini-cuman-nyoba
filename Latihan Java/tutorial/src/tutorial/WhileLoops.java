package tutorial;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//you can do everything in for loops in while loops
		
		int y;
		
		do {System.out.print("Type a number2: "); y =sc.nextInt ();
		} while (y != 10); 
		
		//next line
		System.out.print("Type a number: ");
		int x = sc.nextInt();
		
		int count = 0;
		while (x != 10) {
			System.out.println("Type 10....");
			System.out.print("Type a number: ");
			x = sc.nextInt();
			count++;
		}
		System.out.println("You Tried " + count + " times");
		
		//next line again
		System.out.print("Type a number3: ");
		int z = sc.nextInt();
		
		int itung = 0;
		while (z != 10) {
			
			//harus ada system.out.print setelah println bila digunakan dalam while
			System.out.print("Mohon masukan angka 10");
			z = sc.nextInt();
			itung++;
		}
		System.out.println("Kamu mencoba sebanyak " +itung+ " kali");

	}
}
