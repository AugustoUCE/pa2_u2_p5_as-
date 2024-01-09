package com.uce.edu.repository.modelo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="autor2")
public class Autor2 {
	//Segunda forma para la relacion manytomany

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor2")
	@SequenceGenerator(name = "seq_autor2", sequenceName = "seq_autor2", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_nombre")
	private String nombre;
	@Column(name = "auto_nacional")
	private String nacional;
	
	@OneToMany(mappedBy = "autor2")
	private List<AutorLibro> autoresLibros;

	//set get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacional() {
		return nacional;
	}

	public void setNacional(String nacional) {
		this.nacional = nacional;
	}
	
	
	

	public List<AutorLibro> getAutoresLibros() {
		return autoresLibros;
	}

	public void setAutoresLibros(List<AutorLibro> autoresLibros) {
		this.autoresLibros = autoresLibros;
	}

	@Override
	public String toString() {
		return "Autor2 [id=" + id + ", nombre=" + nombre + ", nacional=" + nacional + "]";
	}

	
	
	


		

}