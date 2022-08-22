import java.util.Scanner;
public class Exercise3 {
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		int a=0,b=1;
		int c;
		System.out.print(a+" "+b);
		
		for(int i=1;i<=number;i++) {
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		//System.out.println(number);
		
		
		
	}

}