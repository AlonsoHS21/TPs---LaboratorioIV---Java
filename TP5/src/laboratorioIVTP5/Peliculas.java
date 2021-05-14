package laboratorioIVTP5;

public class Peliculas extends Categoria{
	
	private static int contID = 0;
	private int id;
	private String nombre;
	private Categoria categoria;
	
	public Peliculas() {
		id = ++contID;
		nombre = "Sin nombre";
		super.setNombre("Sin nombre");
	}
	public Peliculas(String nombre,String categoria) {
		this.id = ++contID;
		this.nombre = nombre;
		super.setNombre(categoria);
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", categoria=" + super.getNombre() + "]";
	}
	

}
