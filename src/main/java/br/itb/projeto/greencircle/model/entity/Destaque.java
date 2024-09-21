package br.itb.projeto.greencircle.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Destaque")
public class Destaque {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime dataInclusao;
	private String obs;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	private String statusDestaque;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(LocalDateTime dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String getStatusDestaque() {
		return statusDestaque;
	}
	public void setStatusDestaque(String statusDestaque) {
		this.statusDestaque = statusDestaque;
	}
	
}






