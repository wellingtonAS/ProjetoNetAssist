package com.netAssist;

import java.util.ArrayList;

public class Senha {
	public String usuario;
	public int teste = 0;
	public int i;
	//METODO PARA VERIFICAR A EXISTENCIA DE UM USUARIO DE ACESSO PASSADO COMO PARAMETRO PARA UMA LISTA DE FUNCIONARIOS
	public int validarUsuario(ArrayList<Funcionario> listaFuncionario, String user){
		if(listaFuncionario.size()>=1 && listaFuncionario.isEmpty() != true){
			for(i=0; i<listaFuncionario.size(); i++){
				if(listaFuncionario.get(i).getUsuario().equals(user)){
					teste = 0;
					break; 
				}
			}
			if(listaFuncionario.size() == i){
				teste = 1;
			}
			else{
				teste = 0;
			}
		}
		else{
			teste = 1;
		}	
		return teste;
	}
	//METODO PARA VERIFICAR A EXISTENCIA DE UM USUARIO DE ACESSO PASSADO COMO PARAMETRO PARA UMA LISTA DE CLIENTES
	public int validarUsuarioCliente(ArrayList<Cliente> listaCliente, String user){
		if(listaCliente.size()>=1 && listaCliente.isEmpty() != true){
			for(i=0; i<listaCliente.size(); i++){
				if(listaCliente.get(i).getLoginAcesso().equals(user)){
					teste = 0;
					break;
				}
			}
			if(listaCliente.size() == i){
				teste = 1;
			}
			else{
				teste = 0;
			}
		}
		else{
			teste = 1;
		}	
		return teste;
	}
}
