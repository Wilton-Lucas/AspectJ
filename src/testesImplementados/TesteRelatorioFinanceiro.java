package testesImplementados;

import transiente.GeraRelatorio;
import transiente.RelatorioFinanceiro;

public class TesteRelatorioFinanceiro {

	public static void main(String[] args) {
		RelatorioFinanceiro rf = new RelatorioFinanceiro();
		rf.geraGrafico(2);
		
		rf.gerarRelatorio(new GeraRelatorio());
		
		
	}
}
