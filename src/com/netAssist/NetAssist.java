package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NetAssist {

    public static void main(String[] args) { 

        //Instanciamento dos Arrays
        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        ArrayList<Cliente> listaClientes = new ArrayList();
       
        Menu opcao = new Menu();
        Adm adm = new Adm();
        Tecnico tecnico = new Tecnico();
        Funcionario funcionario = new Funcionario();
        Cpf cpf = new Cpf();
        Logins logins = new Logins();
        Endereco endereco = new Endereco(); //MODIFICADO
        Contrato contrato = new Contrato(); // MODIFICADO
        Cliente cliente = new Cliente(); //MODIFICADO
        cliente.setEnd(endereco); //MODIFICADO
        cliente.setContrato(contrato); //MODIFICADO
        cliente.setLogin(logins); //MODIFICADO
        String id = null;          
        listaClientes.add(cliente);//MODIFICADO
        int ver = 0;
        int index;
        int indexLogin;
        JOptionPane.showMessageDialog(null, "BEM VINDO AO PRIMEIRO ACESSO AO SISTEMA!\nPara Iniciar Precisamos que Seja "
        		+ "Cadastrado um Funcionario, o Qual Estara Incluso no Quadro de ADMINISTRADORES");
        adm.cadastrarFuncionario(listaFuncionarios, "2");
        
        do{
        	funcionario.setUsuario(JOptionPane.showInputDialog("EFETUAR LOGIN:\nUSUARIO: "));            
            funcionario.setSenha(JOptionPane.showInputDialog("SENHA: "));
            ver = funcionario.efetuarLogin(funcionario, listaFuncionarios);
        	if(ver == 2){
        		indexLogin = logins.verificarIndiceLogin(funcionario, listaFuncionarios);
        		do{
        			id = opcao.exibirMenu();
        			if(id.equals("1")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Administrador")){
        					id = opcao.validarTipoFuncionario();
            				adm.cadastrarFuncionario(listaFuncionarios, id);
            				JOptionPane.showMessageDialog(null, "Funcionario Cadastrado com Sucesso!");
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Cadastrar Funcionario!");
        				}
        			}
        			else if(id.equals("2")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Administrador")){
        					adm.setCpf(cpf.validarCpf());
            				index = cpf.verificarCpfIndex(listaFuncionarios, adm.getCpf());
            				if(index != 0){
                				id = opcao.validarOpcaoAlteracao();
                				adm.alterarFuncionario(listaFuncionarios, index,id); 
                				JOptionPane.showMessageDialog(null, "Funcionario Alterado com Sucesso!");
            				}
            				else{
            					JOptionPane.showMessageDialog(null, "Funcionario Inexistente!");
            				}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Alterar Dados deste Funcionario!");
        				}
        			}
        			else if(id.equals("3")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Administrador")){
        					adm.setCpf(cpf.validarCpf());
            				index = cpf.verificarCpfIndex(listaFuncionarios, adm.getCpf());
            				if(index != 0){
            					adm.deletarFuncionario(listaFuncionarios, index);
                				JOptionPane.showMessageDialog(null, "Funcionario Deletado com Sucesso!");
            				}
            				else{
            					JOptionPane.showMessageDialog(null, "Funcionario Inexistente!");
            				}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Deletar Funcionario!");
        				}
        			}
        			else if(id.equals("4")){
        				funcionario.listarFuncionario(listaFuncionarios);
        			}
        			else if(id.equals("5")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Tecnico")){
        					tecnico.cadastrarCliente(listaClientes);        					
            				JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Cadastrar Clientes!");
        				}
        			}
        			else if(id.equals("6")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Tecnico")){
        					tecnico.setCpf(cpf.validarCpf());
            				index = cpf.verificarCpfIndexCliente(listaClientes, tecnico.getCpf());
            				if(index != 0){
                				id = contrato.validarOpcaoStatus();
                				tecnico.alterarStatusCliente(listaClientes, index, id); 
                				JOptionPane.showMessageDialog(null, "Cliente Alterado com Sucesso!");
            				}
            				else{
            					JOptionPane.showMessageDialog(null, "Cliente Inexistente!");
            				}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Alterar Dados deste Cliente!");
        				}
        			}
        			else if(id.equals("7")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Tecnico")){
        					tecnico.setCpf(cpf.validarCpf());
            				//id = opcao.validarTipoFuncionario();
            				index = cpf.verificarCpfIndexCliente(listaClientes, tecnico.getCpf());
            				//System.out.println(index);
            				if(index != 0){
            					tecnico.deletarCliente(listaClientes, index);
                				JOptionPane.showMessageDialog(null, "Cliente Deletado com Sucesso!");
            				}
            				else{
            					JOptionPane.showMessageDialog(null, "Cliente Inexistente!");
            				}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Deletar Funcionario!");
        				}
        			}
        			else if(id.equals("8")){
        				funcionario.listarCliente(listaClientes);
        			}
        			
        		}while(!(id.equals("9")) && !(id.equals("0")));
        		if(id.equals("0")){
        			ver = 1;
        		}      		
        	}
        	else if(ver == 1){
        		ver = 1;
        		
        	}
        }while(ver != 1);
    } 
}   
