package selfLearning;


	class actions{
	public void playmusic() {
		System.out.println("Playing music");
	}
	
	public String getmeapen(int cost) {
		if (cost >=10)		
		return "pen";
		else
			return "value is low";
			
	}
	}
	public class methods {
	
			public static void main(String a[]) {
		
		actions obj = new actions();
		obj.playmusic();
		String str = obj.getmeapen(2);
		System.out.println(str);
		

	}

}
