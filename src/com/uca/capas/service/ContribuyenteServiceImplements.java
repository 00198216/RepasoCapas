package com.uca.capas.service;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.repositories.ContribuyenteRepository;
import com.uca.capas.repositories.ImportanciaRepository;

@Service
public class ContribuyenteServiceImplements implements ContribuyenteService{

	@Autowired
	ContribuyenteRepository Cont;
	
	@Autowired
	ImportanciaRepository Impo;

	@Override
	public List<Contribuyente> findAll() throws DataAccessException {
		return Cont.findAll();
	}

	@Override
	@Transactional
	public void Save(ContribuyenteDTO C) throws DataAccessException {
		Contribuyente Contr= new Contribuyente();
		Contr.setNombre(C.getName());
		Contr.setApellido(C.getLname());
		Contr.setLevel(Impo.findOne(C.getImportancia()));
		Contr.setNit(C.getNit());
		Date date=new Date();
		Contr.setFecha(new java.sql.Date(date.getTime()));
		
		Cont.saveAndFlush(Contr);
	}
	
}
