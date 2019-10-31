package transiente;


import persistente.Pessoa;

public class FormUsuario  {
 
	private String email;
	 
	private String senha;
	 
	private int telefone;
	 
	private Pessoa pessoa;
	 
	public boolean addEmail() {
		return false;
	}
	 
	public boolean addSenha() {
		return false;
	}
	 
	public boolean addTelefone(String telefone) {
		return false;
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	 
}
 
