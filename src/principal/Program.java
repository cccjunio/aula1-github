package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Digite a Altura e Largura do Triangulo: ");
		retangulo.alt = sc.nextDouble();
		retangulo.lar = sc.nextDouble();
		System.out.println(retangulo);
		
		sc.close();
		
	}

}
