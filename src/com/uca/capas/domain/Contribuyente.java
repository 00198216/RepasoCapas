package com.uca.capas.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="contribuyente")
public class Contribuyente {

	@Id
	@GeneratedValue(generator="contribuyente_c_contribuyente_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="contribuyente_c_contribuyente_seq", sequenceName= "public.contribuyente_c_contribuyente_seq", allocationSize=1)
	@Column(name="c_contribuyente")
	private Integer ClaveC;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="c_importancia")
	private Importancia level;
	
	@Column(name="s_nombre")
	private String Nombre;
	
	@Column(name="s_apellido")
	private String Apellido;
	
	@Column(name="s_nit")
	private String Nit;
	
	@Column(name="f_fecha_ingreso")
	private Date fecha;
	
	public String getfechaDelegate() {
		String Dte = null;
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Dte = format.format(this.fecha);
		return Dte;
		
	}

	public Integer getClaveC() {
		return ClaveC;
	}

	public void setClaveC(Integer claveC) {
		ClaveC = claveC;
	}

	public Importancia getLevel() {
		return level;
	}

	public void setLevel(Importancia level) {
		this.level = level;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
