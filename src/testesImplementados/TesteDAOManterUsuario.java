package testesImplementados;

import java.util.Date;

import persistente.Pessoa;
import transiente.DAOManterUsuario;

public class TesteDAOManterUsuario {
	public static void main(String[] args) {
		DAOManterUsuario dmu = new DAOManterUsuario();
		Pessoa p = new Pessoa();
		p.setDataNascimento(new Date(1970,03,05));
		p.setNome("Jose");
		p.setNomeCompleto("Jose da Silva Parara");
		
		
		dmu.salvar(p);
		dmu.alterar(p);
		dmu.deletar(p);
		
		
	}
}
