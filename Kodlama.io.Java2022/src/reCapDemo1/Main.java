package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 266;
		int number2 = 25;
		int number3 = 26;
		int theBiggest = number1;
		
		if(theBiggest<number2) {
			theBiggest = number2;
		}
		
		if(theBiggest<number3) {
			theBiggest = number3;
		}
		
		System.out.println("The Biggest Number = "+theBiggest);
		
	}
}