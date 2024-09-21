package br.itb.projeto.greencircle.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Produto")
public class Produto {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descricao;
	private String infoRetirada;
	private byte[] foto;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	private String statusProduto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getInfoRetirada() {
		return infoRetirada;
	}
	public void setInfoRetirada(String infoRetirada) {
		this.infoRetirada = infoRetirada;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getStatusProduto() {
		return statusProduto;
	}
	public void setStatusProduto(String statusProduto) {
		this.statusProduto = statusProduto;
	}	

}






