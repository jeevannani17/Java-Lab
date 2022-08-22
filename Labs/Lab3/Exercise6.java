package Lab3;
import java.util.Scanner;
public class Exercise6 {

	
		   static boolean alphabetical_order(String my_str){
		      int str_len = my_str.length();
		      for (int i = 1; i < str_len; i++){
		         if (my_str.charAt(i) < my_str.charAt(i - 1)){
		            return false;
		         }
		      }
		      return true;
		   }
		   static public void main(String[] args){
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter any String");
			   String my_str=sc.next();
		      //String my_str = "abcmnqxz";
		      if (alphabetical_order(my_str)){
		         System.out.println("The letters are in alphabetical order.");
		      } else{
		         System.out.println("The letters are not in alphabetical order.");
		      }
		   }
		
}