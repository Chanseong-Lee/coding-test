import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int y = scan.nextInt();
		int q = -1;
		if(x>0) {
			if(y>0) {
				q=1;
			}else if(y<0) {
				q=4;
			}
		}else if(x<0) {
			if(y>0) {
				q=2;
			}else if(y<0) {
				q=3;
			}
		}
		System.out.println(q);

		scan.close();
	}
}