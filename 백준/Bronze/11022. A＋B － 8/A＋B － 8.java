import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int a;
		int b;
		int sum;
		for(int x = 1; x <= t; x++) {
			a = scan.nextInt();
			b = scan.nextInt();
			sum = a+b;
			System.out.println("Case #"+x+": "+a+" + "+b+" = "+sum);
		}
		
	}
}