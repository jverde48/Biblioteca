package jsf.spring.service;

import java.util.List;

import jsf.spring.dto.LibroDTO;

public interface LibroService {

	boolean guardarRegistro(LibroDTO libroDTO, List<LibroDTO> listaLibros);
	List<LibroDTO> listaRegistros();	
}
