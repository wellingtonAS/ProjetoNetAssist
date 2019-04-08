
package com.netAssist;

import javax.swing.JOptionPane;
public class Menu {
    public String option;
    public String exibirMenu(){
        do{
            option = JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operacao voce deseja fazer?\n"
                + "1 - Cadastro de Funcionario\n2 - Alterar Usuario de Acesso\n3 - Deletar Funcionario\n4 - Listar Funcionarios\n"
                + "5 - Cadastrar Clientes\n6 - Mudar Status do Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 Sair do Sistema\nDigite a qualquer momento 0 para sair!");
            
            option = option.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
            
        }while(!(option.equals("0")) && !(option.equals("1")) && !(option.equals("2")) && !(option.equals("3")) && !(option.equals("4")) && !(option.equals("5")) && !(option.equals("6")) && !(option.equals("7")) && !(option.equals("8")) && !(option.equals("9")));
        return option;
    }   
    public String validarTipoFuncionario(){
    	do{
    		option = JOptionPane.showInputDialog("ACESSO AO SISTEMA!\n\nTipo de funcionario:\n"
            		+ "1 - Tecnico\n2 - Administrador\nDigite o valor correspondente ao funcionario a ser cadastrado: ");
    		if(option == null){
    			if(JOptionPane.showConfirmDialog(null, "CANCELAR CADASTRO?") == 0){ //Verificar se o usuario deseja realmente sair
    				option = null;
    				break;
    			}
    			else{
    				option = "-";
    			}
    		}
    		else{
    			option = option.replaceAll(" ", "");
    		}
    	}while(!(option.equals("1")) && !(option.equals("2")));
    	return option;
    }
    
    public String validarOpcaoAlteracao(){
        do{
            option = JOptionPane.showInputDialog("ALTERACAO DE DADOS CADASTRAIS:!\nQual Dado Voce Deseja Alterar?\n"
                + "1 - USUARIO\n2 - SENHA");
            
            option = option.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
            
        }while(!(option.equals("1")) && !(option.equals("2")));
        return option;
    } 
    
}
