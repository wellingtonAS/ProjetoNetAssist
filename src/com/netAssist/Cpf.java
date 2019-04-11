
package com.netAssist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cpf {
	public String cpf;
	public int tam;
	public int test = 0;
    public String validarCpf(){
    	do{
    		test = 0;
    		cpf = JOptionPane.showInputDialog("CPF (Sem Postos e virgulas): ");
    		cpf = cpf.replaceAll(" ", "");
        	if(cpf.matches("[0-9]+") && cpf.length() == 11){
        		test = 1;
        		
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "Digite Um CPF Valido!");
        	}
    	}while(test == 0);
    	return cpf;
    } 
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
