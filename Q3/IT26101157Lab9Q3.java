public class IT26101157Lab9Q3{
	
	//method to add two integers (can create methods without parameters)
	public static int add(int a,int b){
		return a+b;
	}
	
	//method to multiply two integers
	public static int multiply(int a,int b){
		return a*b;
	}
	
	//method to square an integer
	public static int square(int a){
		return multiply(a,a); //reusing the multiply method
	}
	
	public static void main(String[] args){
		
		//calculate 
		int expression1=square(add(multiply(3,4),multiply(5,7)));
		System.out.println("result of (3*4+5*7)square \t"+expression1);
		
		//calculation part and print value
		int expression2=add(square(add(4,7)),square(add(8,3)));
		System.out.println("result of (4+7)square + (8+3)square \t"+expression2);
	}
}