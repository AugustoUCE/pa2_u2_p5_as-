package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);
	}

	@Override
	public Libro seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void actulizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Libro l = this.seleccionar(id);
		this.entityManager.remove(l);
	}
//Query
	@Override
	public Libro seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		//SELECT * FROM libro WHERE l.libro_titulo= ?
		//SELECT l FROM libro l WHERE l.titulo =: variable
		Query myQuery = this.entityManager.createQuery("SELECT l FROM libro l WHERE l.titulo =: variable");
		myQuery.setParameter("variable", nombre);
		return (Libro) myQuery.getSingleResult();
	}
	
	

}
