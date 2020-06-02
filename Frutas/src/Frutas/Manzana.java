package Frutas;

public class Manzana extends Fruta{
	
	String ManzanaTipo;
	
	//set & get
	public String getManzanaTipo() {
		return ManzanaTipo;
	}
	
	public void setManzanaTipo(String ManzanaTipo) {
		this.ManzanaTipo = ManzanaTipo;
	}
	//constructores
	public Manzana() {
		
	}
	
	public Manzana(String ManzanaTipo) {
		super();
		this.ManzanaTipo = ManzanaTipo;
	}
	
	public Manzana(String fcolor, String fsabor,String ftamanio, String festado) {
		super(fcolor,fsabor,ftamanio,festado);
	}

}
