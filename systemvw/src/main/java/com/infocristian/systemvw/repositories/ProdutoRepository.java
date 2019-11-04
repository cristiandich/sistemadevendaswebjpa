package com.infocristian.systemvw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infocristian.systemvw.domain.Categoria;
import com.infocristian.systemvw.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>  {


}
