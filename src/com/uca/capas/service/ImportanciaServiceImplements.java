package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Importancia;
import com.uca.capas.repositories.ImportanciaRepository;

@Service
public class ImportanciaServiceImplements implements ImportanciaService {

	@Autowired
	ImportanciaRepository Imp;
	
	@Override
	public List<Importancia> findAll() throws DataAccessException {
		return Imp.findAll();
	}

}
