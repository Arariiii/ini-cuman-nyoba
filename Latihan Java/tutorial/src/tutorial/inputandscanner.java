package tutorial;
import java.util.Scanner;

public class inputandscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String scanned = sc.next();
		//convert ke lainnya
		int x = Integer.parseInt(scanned);
		System.out.println(x);
		
		int scannedint = sc.nextInt();
		System.out.println(scannedint);
		
		boolean scannedboolean = sc.nextBoolean();
		System.out.println(scannedboolean);
		
		double scanneddouble = sc.nextDouble();
		System.out.println(scanneddouble);
	}

}
