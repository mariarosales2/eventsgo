package org.aplicacion.eventos.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "evento")
@Data
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "descripcion")
	private String description;
	
	@Column(name = "resumen")
	private String resume;
	
	@Column(name = "fecha_inicio")
	private Date date_from;
	
	@Column(name = "fecha_fin")
	private Date date_to;
	
	@ManyToOne
	@JoinColumn(name = "creador")
	private User creator;
	
	@ManyToMany
	private Set<User> guests;

}
