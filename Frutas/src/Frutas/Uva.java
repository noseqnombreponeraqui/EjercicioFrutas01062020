package Frutas;

public class Uva extends Fruta {
String UvaTipo;
String UvaOrigen;
	
	//set & get
	public String getUvaTipo() {
		return UvaTipo;
	}
	
	public void setUvaTipo(String UvaTipo) {
		this.UvaTipo = UvaTipo;
	}
	public String getUvaOrigen() {
		return UvaOrigen;
	}
	
	public void setUvaOrigen(String UvaOrigen) {
		this.UvaOrigen = UvaOrigen;
	}
	
	
	//constructores
	public Uva() {
		
	}
	
	public Uva(String UvaTipo, String UvaOrigen) {
		super();
		this.UvaTipo = UvaTipo;
		this.UvaOrigen = UvaOrigen;
	}
	
	public Uva(String fcolor, String fsabor,String ftamanio, String festado) {
		super(fcolor,fsabor,ftamanio,festado);
	}
}
