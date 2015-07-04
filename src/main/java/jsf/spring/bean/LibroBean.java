package jsf.spring.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

import jsf.spring.dto.LibroDTO;
import jsf.spring.service.LibroService;
import jsf.spring.service.impl.LibroServiceImpl;

@SessionScoped
@ManagedBean(name="libroBean")
public class LibroBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private LibroDTO libroDTO;
	private LibroService libroService;
	private List<LibroDTO> listaLibros;
	
	@PostConstruct
	public void init() {
		if (libroDTO == null) 
			libroDTO = new LibroDTO();
		
		if (libroService == null)
			libroService = new LibroServiceImpl();
	}

	public LibroDTO getLibroDTO() {
		return libroDTO;
	}

	public void setLibroDTO(LibroDTO libroDTO) {
		this.libroDTO = libroDTO;
	}
	
	public LibroService getLibroService() {
		return libroService;
	}

	public void setLibroService(LibroService libroService) {
		this.libroService = libroService;
	}
	
	public List<LibroDTO> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<LibroDTO> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public void registrarLibro() {
		if (libroService != null) {
			if(libroService.guardarRegistro(libroDTO, listaLibros))
				listaLibros = libroService.listaRegistros();
			else
				System.out.println("Error");
		}
	}
		
}








