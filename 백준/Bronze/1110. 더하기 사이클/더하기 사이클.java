import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int tmp = num;
		int sib;
		int il;
		int sum;
		int sumIl;
		int newNum=0;
		int i = 0;
		while(true) {
			
			sib=tmp/10; //6
			il=tmp%10;  //8
			sum = sib + il; //14
			sumIl = sum % 10; //4
			newNum = il * 10 + sumIl;
			tmp = newNum;
			i++;
			
			if(num==newNum) {
				break;
			}
			
		}
		System.out.println(i);
		
		
		scan.close();
	}
}