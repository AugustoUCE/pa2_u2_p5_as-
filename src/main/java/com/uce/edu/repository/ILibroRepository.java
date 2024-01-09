package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroRepository {

	public Libro seleccionar(Integer id);

	public void insertar(Libro libro);

	public void insertar(Libro2 libro2);

	public void actulizar(Libro libro);

	public void eliminar(Integer id);
	
	//Query
	
	public Libro seleccionarPorNombre(String nombre);

}