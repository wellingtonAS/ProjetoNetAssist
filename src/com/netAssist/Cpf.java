
package com.netAssist;

import java.util.ArrayList;

public class Cpf {
	public String cpf;
	public int tam;
	public int test = 0;
    //METODO PARA VERIFICAR SE O CPF ESTA NO FORMATO PADRAO    
    public int validarCpf(String cpf){
		test = 0;
        if(cpf.matches("[0-9]+") && cpf.length() == 11){
        	test = 1;
    	}
    	return test;
    }
    //METODO PARA VERIFICAR QUAL É O INDICE DO CPF PASSADO COMO PARAMETRO DA LISTA DE FUNCIONARIOS
    public int verificarCpfIndex(ArrayList<Funcionario> listaFuncionario, String cpf){
    	int c = -1;
    	int i;
    	if(listaFuncionario.size()>=1 && listaFuncionario.isEmpty() != true){
			for(i=0; i<listaFuncionario.size(); i++){
				if(listaFuncionario.get(i).getCpf().equals(cpf)){
					c = i;
					break;
				}
			}
		}
    	else{
    		c = 0;
    	}
    	return c;
    }
  //METODO PARA VERIFICAR SE O CPF PASSADO COMO PARAMETRO É EXISTENTE
    public int verificarExisteCpf(ArrayList<Funcionario> listaFuncionario, String cpf){
    	int c = -1;
    	int i;
    	if(listaFuncionario.size()>=1 && listaFuncionario.isEmpty() != true){
			for(i=0; i<listaFuncionario.size(); i++){
				if(listaFuncionario.get(i).getCpf().equals(cpf)){
					c = 0;
					break;
				}
			}
		}
    	return c;
    }
  //METODO PARA VERIFICAR QUAL É O INDICE DO CPF PASSADO COMO PARAMETRO DA LISTA DE CLIENTES
    public int verificarCpfIndexCliente(ArrayList<Cliente> listaCliente, String cpf){
    	int c = -1;
    	int i;
    	if(listaCliente.size()>=1 && listaCliente.isEmpty() != true){
			for(i=0; i<listaCliente.size(); i++){
				if(listaCliente.get(i).getCpf().equals(cpf)){
					c = i;
					break;
				}
			}
		}
    	else{
    		c = -1;
    	}
    	return c;
    }
}
