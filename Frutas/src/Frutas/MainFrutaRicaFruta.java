package Frutas;

import java.util.Scanner;

public class MainFrutaRicaFruta {

	public MainFrutaRicaFruta() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//instancia de la clase
		Fruta Fruta = new Fruta();
		
		Manzana manzana1 = new Manzana();
		Manzana manzana2 = new Manzana("Roja","Dulce","Grande","Fruto Maduro");
		Manzana manzana3 = new Manzana("Manzana Royal");
		
		Uva uva1 = new Uva();
		Uva uva2 = new Uva("Verde","Dulce","Grande","Fruto Maduro");
		Uva uva3 = new Uva("Uva Blanca","Chillan");
		
		Fruta Fruta1 = new Manzana();
		Fruta Fruta2 = new Uva();
		
		System.out.println("ingrese color de la fruta");
		String fcolor = sc.next();
		Fruta1.setcolor(fcolor);
		System.out.println("Color de la fruta escrito recientemente: ");
		System.out.println(Fruta1.getcolor());
		System.out.println("Color de la uva seteado previamente");
		System.out.println(uva2.getcolor());
		System.out.println("Sabor de la uva seteado previamente");
		System.out.println(uva2.getsabor());
		System.out.println("Estado de la uva seteado previamente");
		System.out.println(uva2.getfestado());
		System.out.println("Tamanio de la uva seteado previamente");
		System.out.println(uva2.gettamanio());
		
		
		
	}

}
