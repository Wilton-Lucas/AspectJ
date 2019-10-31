package testesImplementados;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import persistente.Controle;
import persistente.Valor;
import transiente.DAOControle;
import transiente.RelatorioFinanceiro;

public class TesteDAOControle {
	
	public static void main(String[] args) {
		
		//Criação dos objetos necessários
		
		Controle c = new Controle();
		
		Valor v1 = new Valor();
		v1.setDataInicio(new Date(2019,03,05));
		v1.setDataFim(new Date(2019,03,05));
		v1.setDataPagamento(new Date(2019,03,05));
		v1.setTipoPagamento("Debito");
		v1.setDescricao("valor 1");
		v1.setValor(350.0);
		
		Valor v2 = new Valor();
		v2.setDataInicio(new Date(2019,9,07));
		v2.setDataFim(new Date(2019,9,07));
		v2.setDataPagamento(new Date(2019,9,07));
		v2.setTipoPagamento("Credito");
		v2.setDescricao("valor 2");
		v2.setValor(120.0);
		
		List<Valor> l1 = new ArrayList<>();
		l1.add(v1);
		
		List<Valor> l2 = new ArrayList<>();
		l1.add(v2);
		
		c.setDespesa(l1);
		c.setReceita(l2);
		
		RelatorioFinanceiro rf = new RelatorioFinanceiro();
		
		c.setRelatorioFinanceiro(rf);
	
		//testando os métodos da classe DAOControle
		DAOControle dc = new DAOControle();
		
		dc.salvar(c);
		
		//dc.alterar(c);
		//dc.deletar(c);
		//dc.buscar();
		
		
	}
}
