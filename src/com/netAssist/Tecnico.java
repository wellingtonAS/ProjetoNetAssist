package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tecnico extends Funcionario{

    public Tecnico(){}

    public Tecnico(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }
     
    //Metodo para realizar insercao de Cliente em em ArrayList
    public void cadastrarCliente(ArrayList<Cliente> listaCliente){
    	Logins login = new Logins();
        Cliente novoCliente = new Cliente();
        Contrato novoContrato = new Contrato();
        Logins novoLogin = new Logins();
        Cpf novoCpf = new Cpf();
        Senha novaSenha = new Senha();
        novoCliente.setContrato(novoContrato);
        novoCliente.setLogin(novoLogin);
        String status;
        novoCliente.setNome(JOptionPane.showInputDialog("CADASTRAR CLIENTE!\nNOME: ").trim().toUpperCase()); 
        novoCliente.setCpf(novoCpf.validarCpf());       
        novoCliente.setVelocidade(JOptionPane.showInputDialog("INFORMACOES DO PLANO!\nVELOCIDADE: "));
        novoCliente.setValorMensal(JOptionPane.showInputDialog("VALOR DO PLANO: "));
        status = novoContrato.validarOpcaoStatus();
        if(status.equals("1")){
        	novoCliente.setStatusContrato("Ativo");
        }
        else if(status.equals("2")){
        	novoCliente.setStatusContrato("Bloqueado");
        }
        status = login.validarOpcaoAutenticacao();
        if(status.equals("1")){
        	novoCliente.setAutenticacao("PPPoE");
        }
        else if(status.equals("2")){
        	novoCliente.setAutenticacao("Hotspot");
        }
        novoCliente.setLoginAcesso(JOptionPane.showInputDialog("LOGIN DE ACESSO: "));
        novoCliente.setSenhaAcesso(novaSenha.validarSenhaCliente(listaCliente));
        listaCliente.add(novoCliente);
    }
    public void alterarStatusCliente(ArrayList<Cliente> listaCliente, int indice, String id){
		if(id.equals("1")){
			listaCliente.get(indice).setStatusContrato("Ativo");;
		}
		else if(id.equals("2")){
			listaCliente.get(indice).setStatusContrato("Bloqueado");
		}
	}   
    //Metodo para deletar Cliente da lista
    public void deletarCliente(ArrayList<Cliente> listaCliente, int id){
        listaCliente.remove(id);
    }
}
