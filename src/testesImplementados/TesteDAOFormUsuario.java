package testesImplementados;

import java.util.Date;

import persistente.Pessoa;
import transiente.DAOFormUsuario;
import transiente.FormUsuario;

public class TesteDAOFormUsuario {
	public static void main(String[] args) {
		DAOFormUsuario dfu = new DAOFormUsuario();
		
		FormUsuario fu = new FormUsuario();
		fu.setEmail("jose@email.com");
		fu.setSenha("senha123");
		fu.setTelefone(1234567);
		
		Pessoa p = new Pessoa();
		p.setDataNascimento(new Date(1970,03,05));
		p.setNome("Jose");
		p.setNomeCompleto("Jose da Silva Parara");
		
		fu.setPessoa(p);
		
		dfu.gravar(fu); 
	}
}
