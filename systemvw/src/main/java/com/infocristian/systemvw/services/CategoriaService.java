package com.infocristian.systemvw.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocristian.systemvw.domain.Categoria;
import com.infocristian.systemvw.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repor;
	

	public Categoria Buscar(Integer id) throws Exception {
		
		Optional<Categoria> obj = repor.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("não encontrado O Produto Procurado"+ Categoria.class.getCanonicalName()));
		
		
		
		
		
		
		
		
	}

}
