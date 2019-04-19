
package com.netAssist;

import javax.swing.JOptionPane;
public class Menu implements ValidacaoEntradas{
    public String option;
    public int exibirMenu(String op){
    	if((op.equals("0")) || (op.equals("1")) || (op.equals("2")) || (op.equals("3")) || (op.equals("4")) || (op.equals("5")) || (op.equals("6")) || (op.equals("7")) || (op.equals("8")) || (op.equals("9"))){
        	return 1;
        }
    	else{
    		return 0;
    	}
    } 
    @Override
    public int validarOpcao(String op){
		if((op.equals("1")) || (op.equals("2"))){
			return 1;
		}
		else{
			return 0;
		}
    }
    
    public int validarOpcaoAlteracao(String op){
    	if((op.equals("1")) || (op.equals("2"))){
			return 1;
		}
		else{
			return 0;
		}
    } 
    
}
