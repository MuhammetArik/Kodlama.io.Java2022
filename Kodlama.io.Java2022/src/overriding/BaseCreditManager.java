package overriding;

public class BaseCreditManager {
	public double calculate(double amount) {
		return amount * 1.18;
	}
//	public final double calculate(double amount) {
//		return amount * 1.18;
//	}
}