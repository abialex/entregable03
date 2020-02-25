package pe.edu.unsch.model;


public class Libro {
	private int idLibro;
	private String nombre;
	private Autor autor;
	
	public Libro(int idLibros,String nombres){
		this.idLibro=idLibros;
		this.nombre=nombres;
		
	}	
	
	
	
	

	public Libro(){
		
	}
	@Override
	public String toString() {
		return "id:"+idLibro+" nombre libro:"+nombre+" Autor:"+autor.getNombre()+" "+autor.getApellido();		
	}
	
	
	
	public void imprimirLibro() {
		System.out.println("imprimirlibro");
	}





	public int getIdLibro() {
		return idLibro;
	}





	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public Autor getAutor() {
		return autor;
	}





	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
