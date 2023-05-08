package selfLearning;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
	int n;
	int fact_var = 1;
	
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter a number: ");
	n = SC.nextInt();
	
	for (int i=1; i<=n; i++){
		fact_var =fact_var * i;
	}
	
		System.out.println("The factorial of "+n+ " is: "+fact_var);
	}
	
		
	}

