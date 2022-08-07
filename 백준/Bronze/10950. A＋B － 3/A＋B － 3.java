import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int a;
		int b;
		for(int i=1;i<=t;i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a+b);
		}
		

		scan.close();
	}
}