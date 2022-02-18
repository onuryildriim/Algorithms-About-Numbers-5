import java.lang.Math;
import java.util.Scanner;

public class Algorithm{
	
	int a;
	double b;
	int c;
	int d;
	
	Scanner s = new Scanner(System.in);
	
	public void squareNum() {	
		System.out.println("Enter an integer: ");
		a = s.nextInt();
		
		b = Math.sqrt(a);
		c = (int)(b);
		d = c * c;
		if(a == d) {
			System.out.println("Square number");
		}else {
			System.out.println("Not a square number");
		}
		
	}
}
