package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IAutorRepository;
import com.uce.edu.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepository autorRepository;

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.autorRepository.seleccionar(id);
	}

	@Override
	public void guardar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepository.ingresar(autor);
	}

	@Override
	public void actulizar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepository.actualizar(autor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.autorRepository.eliminar(id);
	}

}