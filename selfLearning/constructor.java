package selfLearning;

public class constructor {
	
	public String hint;
	
	public constructor() {
		
		System.out.println("constructor called: ");
		hint = "lift"; 
	}
	
	
	
	public static void main(String[] args) {
		
		constructor obj = new constructor();
		System.out.println("Pain makes you "+ obj.hint);
	}

}
