package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Contribuyente;

public interface ContribuyenteRepository extends JpaRepository<Contribuyente,Integer>{

	public List<Contribuyente> findAll();
}
