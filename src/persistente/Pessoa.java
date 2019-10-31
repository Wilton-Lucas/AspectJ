package persistente;

import java.util.Date;
import transiente.FormUsuario;

public class Pessoa {
 
	private String nomeCompleto;
	 
	private Date dataNascimento;
	 
	private Login login;
	 
	private FormUsuario formUsuario;	 

	 
	public boolean setNome(String nome) {
		return false;
	}
	 
	public String getNome() {
		return null;
	}
	 
	public boolean setDataNascimento(Date data) {
		return false;
	}
	 
	public Date getDataNascimento() {
		return null;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public FormUsuario getFormUsuario() {
		return formUsuario;
	}

	public void setFormUsuario(FormUsuario formUsuario) {
		this.formUsuario = formUsuario;
	}
	 
}
 
