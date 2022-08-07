import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int line = scan.nextInt();
						
		for(int i = line; i > 0; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = line; j>i-1;j--) {
				System.out.print("*");
 			}
			System.out.println();
		}
	}
}