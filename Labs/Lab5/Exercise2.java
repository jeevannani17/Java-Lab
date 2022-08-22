package Lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
	
	public static void main(String[] args) throws IOException{
		
		//Declaring BufferedReader to input String from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Employee Firstname: ");
		String firstName=br.readLine();
	
		System.out.println("Employee Lastname: ");
		String lastName=br.readLine();
			try {
				if(firstName.length()==0 || lastName.length()==0)
				{
					throw new IOException();	
				}
				System.out.println("Employee Full name: "+firstName + " "+ lastName);
			}
			
			//If the try statement is true then it throws to catch
				catch (IOException a)
				{
					System.out.println("Firstname or Lastname should not be blank..");
				}
			
				finally
				{
					br.close();
					System.out.println("======================================================");
			
				}
		
		
	}
}