package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println("2 Numbers addition : "+fourOperations.addition(2,3));
		System.out.println("3 Numbers addition : "+fourOperations.addition(2,3,5));
	}
}