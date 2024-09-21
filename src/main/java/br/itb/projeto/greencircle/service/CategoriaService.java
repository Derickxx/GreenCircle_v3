package br.itb.projeto.greencircle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.greencircle.model.entity.Categoria;
import br.itb.projeto.greencircle.model.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	private CategoriaRepository categoriaRepository;
	
	public CategoriaService(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}

	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

}
