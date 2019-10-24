package com.infocristian.systemvw;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infocristian.systemvw.domain.Categoria;
import com.infocristian.systemvw.repositories.CategoriaRepository;

@SpringBootApplication
public class SystemvwApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SystemvwApplication.class, args);
	}
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		
		Categoria cat2 = new Categoria (null, "Escritorio");
		
		//salvando
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
