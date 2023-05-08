package selfLearning;
 
import java.util.Scanner;

public class arithmeticOperations {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your first number");
		num1=sc.nextInt();
		System.out.println("enter your second number");
		num2=sc.nextInt();
		
		System.out.println("The arithimethic operations of two numbers ");
		System.out.println("by adding you get:"+ (num1+num2));
		System.out.println("by substracting you get:"+ (num1-num2));
		System.out.println("by multiplying you get:"+(num1*num2));
		
	}

}
