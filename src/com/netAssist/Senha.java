package com.netAssist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Senha {
	public String usuario;
	public int teste = 0;
	public int i;
	public String validarUsuario(ArrayList<Funcionario> listaFuncionario){
		do{
			usuario = JOptionPane.showInputDialog("USUARIO DE ACESSO: ");
			if(listaFuncionario.size()>=1 && listaFuncionario.isEmpty() != true){
				for(i=0; i<listaFuncionario.size(); i++){
					if(listaFuncionario.get(i).getUsuario().equals(usuario)){
						JOptionPane.showMessageDialog(null, "Existe Funcionario com Este Usuario, Tente Novamente!");
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
			
		}while(teste == 0);
		return usuario;
	}
	
	public String validarUsuarioCliente(ArrayList<Cliente> listaCliente){
		do{
			usuario = JOptionPane.showInputDialog("USUARIO DE ACESSO: ");
			if(listaCliente.size()>=1 && listaCliente.isEmpty() != true){
				for(i=0; i<listaCliente.size(); i++){
					if(listaCliente.get(i).getLoginAcesso().equals(usuario)){
						JOptionPane.showMessageDialog(null, "Existe Cliente com Este Usuario de Autenticacao, Tente Novamente!");
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
			
		}while(teste == 0);
		return usuario;
	}
}
