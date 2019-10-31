package persistente;

public class Login extends Pessoa {
 
	private String login;
	 
	private String senha;
	 
	private Pessoa pessoa;
	 
	

	public Login getLogin() {
		return pessoa.getLogin();
	}
	
	public String getLogin2(){
		
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	 
}
 
