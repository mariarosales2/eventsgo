package org.aplicacion.eventos.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class User {
	
	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "nombre")
	private String name;

	@Column(name = "apellidos")
	private String lastName;
	
	@Column(name = "telefono")
	private String telephone;
	
	@ManyToMany
	private Set<Event> events;

}
