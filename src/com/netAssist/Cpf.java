
package com.netAssist;

import javax.swing.JOptionPane;

public class Cpf {
	String cpf;
	int tam;
	int test = 0;
    public String validarCpf(){
    	do{
    		cpf = JOptionPane.showInputDialog("CPF (Sem Postos e virgulas): ");
    		cpf = cpf.replaceAll(" ", "");
        	if(cpf.matches("[0-9]+") && cpf.length() == 11){
        		test = 1;
        		
        	}
    	}while(test == 0);
    	return cpf;
    }
}
