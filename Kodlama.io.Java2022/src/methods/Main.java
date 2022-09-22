package methods;

public class Main {

	public static void main(String[] args) {
		numberFind();
	}
	
	//camelCasing
	public static void numberFind() {
		int[] numbers = new int[]{1,2,5,7,9,0};
		int findingNumber = 2;
		boolean isThere = false;
		
		for(int number : numbers) {
			if(number==findingNumber) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			messageGive("Number is available : "+findingNumber);
		}else {
			messageGive("Number is not available : : "+findingNumber);
		}
	}
	public static void messageGive(String message) {
		System.out.println(message);
	} 
	
}