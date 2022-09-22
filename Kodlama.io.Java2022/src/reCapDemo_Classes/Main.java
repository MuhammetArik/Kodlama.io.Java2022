package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		int result;
		result =  fourOperations.addition(3, 4);
		System.out.println("Addition result : "+result);
		
		result =  fourOperations.subtraction(6, 3);
		System.out.println("Subtraction result : "+result);
		
		result =  fourOperations.multiplication(4, 3);
		System.out.println("Multiplication result : "+result);
		
		result =  fourOperations.division(8, 4);
		System.out.println("Division result : "+result);
		
		
	}
}