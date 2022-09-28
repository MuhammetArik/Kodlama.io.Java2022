package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static constructor block worked.");
	}
	
	private void ProductValidator() {
		System.out.println("Constructor block worked.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void something() {
		
	}

}