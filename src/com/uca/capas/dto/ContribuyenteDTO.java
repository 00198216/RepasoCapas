package com.uca.capas.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ContribuyenteDTO {

	
	@NotEmpty(message="El nombre es requerido")
    @Size(message="Ha pasado el maximo de 30 caracteres",max=30)
	private String Name;
	
	@NotEmpty(message="El apellido es requerido")
    @Size(message="Ha pasado el maximo de 30 caracteres",max=30)
	private String Lname;
	
	@NotEmpty(message="El nit es requerido")
    @Size(message="Ha pasado el maximo de 14 caracteres",max=14)
	public String Nit;
	
	public Integer Importancia;
	
	

	public Integer getImportancia() {
		return Importancia;
	}

	public void setImportancia(Integer importancia) {
		Importancia = importancia;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}



	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	
}
