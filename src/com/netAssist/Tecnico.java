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
        Endereco novoEndereco = new Endereco();
        novoCliente.setEnd(novoEndereco);
        novoCliente.setContrato(novoContrato);
        novoCliente.setLogin(novoLogin);
        String status;
        novoCliente.setNome(JOptionPane.showInputDialog("CADASTRAR CLIENTE!\n\nNOME: ").trim().toUpperCase()); 
        novoCliente.setCpf(novoCpf.validarCpf()); 
        novoCliente.setCidade(JOptionPane.showInputDialog("CIDADE: "));
        novoCliente.setEstado(JOptionPane.showInputDialog("ESTADO: "));
        novoCliente.setVelocidade(JOptionPane.showInputDialog("INFORMACOES DO PLANO!\n\nVELOCIDADE: "));
        novoCliente.setValorMensal(JOptionPane.showInputDialog("VALOR DO PLANO: "));
        status = novoContrato.validarOpcao();
        if(status.equals("1")){
        	novoCliente.setStatusContrato("Ativo");
        }
        else if(status.equals("2")){
        	novoCliente.setStatusContrato("Bloqueado");
        }
        status = login.validarOpcao();
        if(status.equals("1")){
        	novoCliente.setAutenticacao("PPPoE");
        }
        else if(status.equals("2")){
        	novoCliente.setAutenticacao("Hotspot");
        }
        novoCliente.setLoginAcesso(novaSenha.validarUsuarioCliente(listaCliente));
        novoCliente.setSenhaAcesso(JOptionPane.showInputDialog("SENHA DE AUTENTICACAO: "));
        
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
