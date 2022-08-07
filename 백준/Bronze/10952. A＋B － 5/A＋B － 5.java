import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a;
		int b, sum;
		while(true) {
			a=scan.nextInt();
			b=scan.nextInt();
			sum = a+b;
			if(a<=0 || a>=10) break;
			else if(b<=0 || b>=10) break;
			System.out.println(sum);		
		}
		
	}
}