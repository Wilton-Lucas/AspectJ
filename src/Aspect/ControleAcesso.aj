package Aspect;

import java.util.Date;
import persistente.*;
import transiente.*;
public aspect ControleAcesso {

	
	pointcut salvarControle() : call (* DAOControle.salvar(..));
	pointcut alterarControle() : call (* DAOControle.alterar(..));
	pointcut deletarControle() : call (* DAOControle.deletar(..));
	pointcut buscarControle() : call (* DAOControle.buscar(..));
	pointcut buscarLogin() : call (* DAOLogin.buscar(..));
	pointcut gerarRelatorio() : call (* RelatorioFinanceiro.gerarRelatorio(..));
	pointcut gerarGrafico() : call (* RelatorioFinanceiro.geraGrafico(..));
	pointcut salvarUsuario() : call (* DAOManterUsuario.salvar(..));
	pointcut alterarUsuario() : call (* DAOManterUsuario.alterar(..));
	pointcut deletarUsuario() : call (* DAOManterUsuario.deletar(..));
	pointcut gravarUsuario() : call (* DAOFormUsuario.gravar(..));
	

	before(Object obj) : salvarControle() && target(obj)
	{
		System.out.println("Verificando acesso (tipo: salvarControle) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Os dados foram salvos com sucesso!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object obj) : alterarControle() && target(obj)
	{
		System.out.println("Verificando acesso (tipo: alterarControle) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = false; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Os dados foram alterados com sucesso!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object obj) : deletarControle() && target(obj)
	{
		System.out.println("Verificando acesso (tipo: deletarControle) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Os dados foram apagados com sucesso!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before() : buscarControle()
	{
		System.out.println("Verificando acesso (tipo: buscarControle) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Informações sobre o controle foram buscadas!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object o) : buscarLogin() && target(o)
	{
		System.out.println("Verificando autenticação para este usuario no Banco de Dados");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Usuário autenticado!");
			
		}else{
			System.out.println("Login ou senha incorretos!");
		}	
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object o) : gerarRelatorio() && target(o)
	{
		System.out.println("Verificando acesso (tipo: gerarRelatorio) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = false; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Relatorios Gerados!");
			
		}else{
			System.out.println("Usuario nao tem acesso para gerar relatorio.!");
		}	
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}

	before(Object o) : gerarGrafico() && target(o)
	{
		System.out.println("Verificando acesso (tipo: gerarGrafico) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Graficos Gerados!");
			
		}else{
			System.out.println("Usuario nao tem acesso para gerar grafico!");
		}	
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object o) : gravarUsuario() && target(o)
	{
		System.out.println("Verificando acesso (tipo: gravarUsuario) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("dados gravados com sucesso!");
			
		}else{
			System.out.println("Usuario nao tem acesso para salvar este formulario");
		}	
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object obj) : salvarUsuario() && target(obj)
	{
		System.out.println("Verificando acesso (tipo: salvarUsuario) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Os dados foram salvos com sucesso!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object obj) : alterarUsuario() && target(obj)
	{
		System.out.println("Verificando acesso (tipo: alterarUsuario) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = true; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Os dados foram alterados com sucesso!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
	before(Object obj) : deletarUsuario() && target(obj)
	{
		System.out.println("Verificando acesso (tipo: deletarUsuario) para este usuário no sistema...");
		Date dt = new Date();
		boolean temAcesso = false; //variavel que será atribuida pelo banco de dados.
		if(temAcesso){
			System.out.println("Os dados foram apagados com sucesso!");
			
		}else{
			System.out.println("Usuario não possui acesso para esta funcionalidade!");
		}		
		
		System.out.println("Registrando Log de atividade no sistema as " + dt);
	}
	
}
