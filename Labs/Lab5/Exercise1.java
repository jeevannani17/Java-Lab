package Lab5;
import java.util.Scanner;

public class Exercise1{
	

//public class AgeException{
	
	public static void main(String[] args) throws ArithmeticException {
		
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter age: ");
			int age=scan.nextInt();
		if(age<15) {
			throw new ArithmeticException();
		}
			System.out.println("Valid Age ");

		}
		catch (ArithmeticException e) {
			System.out.println("Invalid Age "+ e);
		}
		finally {
			System.out.println("Programme runned successfully");
		}
	}
}