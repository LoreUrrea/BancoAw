package util;

public class conversorDivisa {

	public static final double USD = 0.11;
	
	public static double monto(double precio, double cantidad) {
		return precio * cantidad * USD + precio * cantidad;
	}
}
