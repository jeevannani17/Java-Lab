import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose Any one");
		System.out.println("1.RED  2.YELLOW  3.GREEN");
		int number=scan.nextInt();
		//int input=scan.nextInt();
		switch (number) {
		
		case 1:
			System.out.println("STOP");
			break;
			
		case 2: 
			System.out.println("READY");
			break;
			
		case 3:
			System.out.println("GO");
			break;
			
		default: 
			System.out.println("Invalid number");
		
		}

	}

}