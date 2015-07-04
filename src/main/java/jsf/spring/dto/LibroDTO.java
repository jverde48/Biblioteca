package jsf.spring.dto;

import java.io.Serializable;

public class LibroDTO implements Serializable {

	private static final long serialVersionUID = 1L;	
	private String titulo = "Divergente";
	private String autor;
	private String editorial;
	private String edicion;
	private Integer noPaginas;
	private Integer anioPublicacion;
	private String genero;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public Integer getNoPaginas() {
		return noPaginas;
	}

	public void setNoPaginas(Integer noPaginas) {
		this.noPaginas = noPaginas;
	}

	public Integer getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(Integer anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return titulo;
	}
}
