package pe.edu.unsch.model;

public class Autor {
	private String nombre;
	private String apellido;
	

	public Autor(String nombre1,String apellido1) {
		this.nombre=nombre1;
		this.apellido=apellido1;
	}
	public Autor(){
		
	}
	
	
	@Override
	public String toString() {
		return nombre+apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
}
