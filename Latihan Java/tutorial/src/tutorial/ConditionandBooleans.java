package tutorial;
import java.util.Scanner;

public class ConditionandBooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 23;
		int z = 10;
		boolean perbandingan = x != y;
		System.out.println(perbandingan);
		//perbandingan dengan dua kondisi menggunakan dan(&&)
		boolean perbandingan2 = x > y && z < y;
		System.out.println(perbandingan2);
		//perbandingan dengan dua kondisi menggunakan atau(||)
		boolean perbandingan3 = x > y || z <y;
		System.out.println(perbandingan3);
		//perbandingan dengan dua kondisi menggunakan bukan(!)
		boolean perbandingan4 = !(x > y || z <y);
		System.out.println(perbandingan3);
		//perbandingan dengan banyak kondisi
		boolean perbandingan5 = (x < y && y > z)||(z + 2 < 5 || x + 7 > y);
		System.out.println(perbandingan5);
		
		
		
		String a = "hello world";
		String b = "kaga sama";
		boolean banding = a == b;
		System.out.println(banding);
		
		//> < ==(sama dengan) >=(lebih besar sama dengan) <=(lebih kecil sama dengan) !=(tidak sama)
		
		
		
		
		
		
		
	}

}
