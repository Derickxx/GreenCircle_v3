package br.itb.projeto.greencircle.model.entity;

public class Login {

	private String email;
	private String senha;

	public Login() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + ", senha=" + senha + "]";
	}
	
	
}
