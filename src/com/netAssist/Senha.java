package com.netAssist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Senha {
	String senha;
	int teste = 0;
	int i;
	public String validarSenha(ArrayList<Funcionario> listaFuncionario){
		do{
			senha = JOptionPane.showInputDialog("SENHA DE ACESSO: ");
			if(listaFuncionario.size()>=1 && listaFuncionario.get(0).getSenha() != null){
				//System.out.println(listaFuncionario.size());
				for(i=0; i<listaFuncionario.size(); i++){
					if(listaFuncionario.get(i).getSenha().equals(senha)){
						JOptionPane.showMessageDialog(null, "Senha Existente!");
						break;
					}
				}
				if(i == listaFuncionario.size()){
					teste = 1;
				}
			}
			else{
				teste = 1;
				//System.out.println("Desviou");

			}
			
		}while(teste == 0);
		return senha;
	}
}
