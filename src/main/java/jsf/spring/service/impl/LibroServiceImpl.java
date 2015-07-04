package jsf.spring.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jsf.spring.dto.LibroDTO;
import jsf.spring.service.LibroService;

public class LibroServiceImpl implements LibroService, Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<LibroDTO> listaRegistros = null;
	
	@Override
	public boolean guardarRegistro(LibroDTO libroDTO, List<LibroDTO> listaLibros) {
		boolean isGuardado = false;
		LibroDTO libroDTO2 = null;
		
		if(libroDTO != null) {
			libroDTO2 = getNewLibro(libroDTO);
			isGuardado = true;
			
			if (listaRegistros == null) {
					listaRegistros = new ArrayList<LibroDTO>();
			}
			
			listaRegistros.add(libroDTO2);
		}
		
		return isGuardado;
	}

	@Override
	public List<LibroDTO> listaRegistros() {
		return listaRegistros;
	}
	
	private LibroDTO getNewLibro(LibroDTO dto){
		LibroDTO libro = new LibroDTO();
		libro.setAnioPublicacion(dto.getAnioPublicacion());
		libro.setAutor(dto.getAutor());
		libro.setEdicion(dto.getEdicion());
		libro.setEditorial(dto.getEditorial());
		libro.setGenero(dto.getGenero());
		libro.setNoPaginas(dto.getNoPaginas() != null ? dto.getNoPaginas() : 0);
		libro.setTitulo(dto.getTitulo());
		return libro;
	}

}
