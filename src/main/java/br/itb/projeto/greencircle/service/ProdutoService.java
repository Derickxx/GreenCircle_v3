package br.itb.projeto.greencircle.service;

import java.io.IOException;
import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.itb.projeto.greencircle.model.entity.Produto;
import br.itb.projeto.greencircle.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public List<Produto> findAll() {
		List<Produto> produtos = produtoRepository.findAll();
		return produtos;
	}
	
	public List<Produto> findAllByNome(String nome) {
		List<Produto> produtos = produtoRepository.findByNomeContaining(nome);
		return produtos;
	}

	public Produto findById(long id) {
		return produtoRepository.findById(id).get();
	}
	
	@Transactional
	public Produto saveNew(Produto produto) {

		produto.setStatusProduto("ATIVO");
		
		return produtoRepository.save(produto);
	}
	
	@Transactional
	public Produto update(Produto produto) {

		produto.setStatusProduto("ATIVO");
		
		return produtoRepository.save(produto);
	}
	

	@Transactional
	public Produto saveNew(MultipartFile file, Produto produto) {

		if (file != null && file.getSize() > 0) {
			try {
				produto.setFoto(file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			produto.setFoto(null);
		}

		produto.setStatusProduto("ATIVO");
		
		return produtoRepository.save(produto);
	}

	@Transactional
	public void update(MultipartFile file, Produto produto, byte[] foto) {
		
		if (file.getSize() == 0 && foto.length == 0) {
			produto.setFoto(null);
		} 
		
		if (file.getSize() == 0 && foto.length > 0) {
			produto.setFoto(foto);
		} 

		if (file != null && file.getSize() > 0 ) {
			try {
				produto.setFoto(file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		produto.setStatusProduto("ATIVO");
		produtoRepository.save(produto);
	} 


}
