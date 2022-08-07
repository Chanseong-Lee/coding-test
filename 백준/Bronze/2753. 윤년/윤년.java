import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int answer = 0;
		if(year % 4 == 0) {
			answer = 1;
			if(year % 400 == 0) {
				answer = 1;
			}else if(year % 100 == 0) {
				answer =0;
			}	
		} 
		System.out.println(answer);
		
		scan.close();
	}
}