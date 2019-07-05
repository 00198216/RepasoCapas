package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.domain.Importancia;
import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.service.ContribuyenteService;
import com.uca.capas.service.ImportanciaService;

@Controller
public class MainController {
	
	@Autowired
	ContribuyenteService Service1;

	@Autowired
	ImportanciaService Service2;

	@RequestMapping("/")
	public ModelAndView start() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Message", "I Challange My Fate!!!");
		ContribuyenteDTO C = new ContribuyenteDTO();
		mav.addObject("ContribuyenteDTO", C);
		mav.addObject("Message", "I Challange My Fate!!!");
		List<Importancia> imp=Service2.findAll();
		mav.addObject("importancia", imp);
		mav.setViewName("Main");
		return mav;
	}
	
	@RequestMapping(value="/Guardar", method= RequestMethod.POST)
	public ModelAndView Guardar(@Valid @ModelAttribute("ContribuyenteDTO") ContribuyenteDTO contribuyenteDTO, BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		
		 if(result.hasErrors()) {
			 mav.addObject("Message", "I Challange My Fate!!!");
			 List<Importancia> imp=Service2.findAll();
			 mav.addObject("importancia", imp);
			 mav.setViewName("Main");
			 
		 }
		 else {
			 ModelAndView mav2 = new ModelAndView("redirect:/");	
			 Service1.Save(contribuyenteDTO);
			 return mav2;
		 }
		
		return mav;
	}
	
	@RequestMapping(value="/Show", method= RequestMethod.POST)
	public ModelAndView Show() {
		
		 ModelAndView mav = new ModelAndView();
		 List<Contribuyente> cont=Service1.findAll();
		 mav.addObject("cont", cont);
		     
		 mav.setViewName("Show");
		 
		
		return mav;
	}
	
}
