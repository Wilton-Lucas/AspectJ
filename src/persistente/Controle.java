package persistente;

import java.util.List;

import transiente.RelatorioFinanceiro;

public class Controle {
 
	private List<Valor> receita;
	 
	private List<Valor> despesa;
	 
	private RelatorioFinanceiro relatorioFinanceiro;

	public List<Valor> getReceita() {
		return receita;
	}

	public void setReceita(List<Valor> receita) {
		this.receita = receita;
	}

	public List<Valor> getDespesa() {
		return despesa;
	}

	public void setDespesa(List<Valor> despesa) {
		this.despesa = despesa;
	}

	public RelatorioFinanceiro getRelatorioFinanceiro() {
		return relatorioFinanceiro;
	}

	public void setRelatorioFinanceiro(RelatorioFinanceiro relatorioFinanceiro) {
		this.relatorioFinanceiro = relatorioFinanceiro;
	}
	
	
	 
}
 
