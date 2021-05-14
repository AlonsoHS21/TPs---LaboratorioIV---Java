package laboratorioIVTP5;

public class Categoria {
	
	private static int contID = 0;
	private int id;
	private String nombre;
	
	public Categoria() {
		id = ++contID;
		nombre = "Sin nombre";
	}
	public Categoria(String nombre) {
		this.id = ++contID;
		this.nombre = nombre;
	}
	
	public int getID() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String categoria) {
		this.nombre = categoria;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	

}
