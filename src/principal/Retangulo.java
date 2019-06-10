package principal;

public class Retangulo {
	
	public double alt;
	public double lar;
	
	public double area () {
		return alt * lar;
	}
	
	public double per () {
		return alt *2 + lar * 2;
	}
	
	public double dia () {
		return Math.sqrt(alt * alt + lar * lar);
	}
	
	public String toString ( ) {
		return "Area: " + String.format("%.2f\n", area())  +
				"Perimetro: " + String.format("%.2f\n", per()) +
				"Diagonal: " + String.format("%.2f\n", dia());
				
	}
}
