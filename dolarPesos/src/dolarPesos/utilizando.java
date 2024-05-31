package dolarPesos;

import java.util.Locale;
import java.util.Scanner;
import util.conversorDivisa;

public class utilizando {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("cual es el precio del dolar?");
		double precio= sc.nextDouble();
		System.out.print("cuantos dolares tiene en mente comprar?");
        double cantidad = sc.nextDouble();
        
        
        double monto = conversorDivisa.monto(precio, cantidad);
        
        System.out.printf("monto en pesos = %.2f%n", monto);
        
        sc.close();
	}
}
