//Demonstration of given number is palindrome number or not
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Assingning a variables
		int a,b,temp,sum=0; //temp is temporary
		System.out.println("Enter a number:");//Enter a number 
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		temp=a;
		
		//Reverse the number
		while(a>0) {
			b=a%10;
			sum=(sum*10)+b;
			a=a/10;
			
		}
		
		//checks the number is reversed or not & prints it
		if(temp==sum) {
			System.out.println("The number is palindrome number");
		}
		else {
			System.out.println("The number is not palindrome number");
		}
		

		
	}

}
