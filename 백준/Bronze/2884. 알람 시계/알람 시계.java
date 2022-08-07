import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();
		
		// h : 0~ 23
		// m : 0~ 59
		if(m>=45) {
			m -= 45;
		}else if(m<45) {
			m += 15;
			h -= 1;
			if(h < 0) {
				h=23;
			}
		}
		System.out.println(h+" "+m);

		scan.close();
	}
}