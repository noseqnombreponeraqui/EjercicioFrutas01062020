package Frutas;

public class Fruta {
	String fcolor;
	String fsabor;
	String ftamanio;
	String festado;
	
	//metodos o funciones
	public void crecer() {
		festado = "fruto maduro";
	}
	public void sembrar() {
		festado = "semilla";
	}
	
	//constructores
	public Fruta() {
		
	}
	
	public Fruta(String fcolor, String fsabor,String ftamanio, String festado) {
		super();
		this.fcolor = fcolor;
		this.fsabor = fsabor;
		this.ftamanio = ftamanio;
		this.festado = festado;
	}
	
	//set & get
	public String getcolor() {
		return fcolor;
	}
	
	public void setcolor(String fcolor) {
		this.fcolor = fcolor;
	}
	
	public String getsabor() {
		return fsabor;
	}
	
	public void setsabor(String fsabor) {
		this.fsabor = fsabor;
	}
	
	public String gettamanio() {
		return ftamanio;
	}
	
	public void settamanio(String ftamanio) {
		this.ftamanio = ftamanio;
	}
	public String getfestado() {
		return festado;
	}
	public void setfestado(String festado) {
		this.festado = festado;
	}
	@Override
	public String toString() {
		return "Clase to String";
	}
}
