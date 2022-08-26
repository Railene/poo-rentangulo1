package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite a altura e a largura do Retangulo");
		
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
	
	System.out.println("Area do retengulo ="+ret.area());
	System.out.println("Perimetro do retangulo =" +ret.perimetro());
	System.out.println("Diagonal do retangulo =" +ret.diagonal());
	sc.close();

	}

}
