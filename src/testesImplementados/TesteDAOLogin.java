package testesImplementados;

import java.util.Date;

import persistente.Login;
import persistente.Pessoa;
import transiente.DAOLogin;
import transiente.FormUsuario;

public class TesteDAOLogin {
	public static void main(String[] args) {
		//criação dos objetos necessários
		Pessoa p = new Pessoa();
		p.setDataNascimento(new Date(1970,03,05));
		p.setNome("Jose");
		p.setNomeCompleto("Jose da Silva Parara");
		FormUsuario fu = new FormUsuario();
		Login login = new Login();
		
		login.setPessoa(p);
		login.setLogin("jose@jose");
		login.setSenha("senha123");
		
		p.setFormUsuario(fu);
		p.setLogin(login);
		
		//testando classe DAOLogin
		DAOLogin dl = new DAOLogin();
		dl.buscar();
	}
}
