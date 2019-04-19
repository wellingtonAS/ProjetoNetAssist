package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tecnico extends Funcionario{

    public Tecnico(){}

    public Tecnico(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }
     
    //Metodo para realizar insercao de Cliente em em ArrayList
    public int cadastrarCliente(ArrayList<Cliente> listaCliente, String nome, String cpf, String cidade, String estado, String user, String senhaAcesso, String velocidade, String valor, String statusContrato, String tipoConexao){
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
        novoCliente.setNome(nome); 
        novoCliente.setCpf(cpf); 
        novoCliente.setCidade(cidade);
        novoCliente.setEstado(estado);
        novoCliente.setVelocidade(velocidade);
        novoCliente.setValorMensal(valor);   
        int ver;
        if(statusContrato.equals("1")){
        	novoCliente.setStatusContrato("Ativo");
        }
        else if(statusContrato.equals("2")){
        	novoCliente.setStatusContrato("Bloqueado");
        }    
        if(tipoConexao.equals("1")){
        	novoCliente.setAutenticacao("PPPoE");
        }
        else if(tipoConexao.equals("2")){
        	novoCliente.setAutenticacao("Hotspot");
        }
        novoCliente.setLoginAcesso(user);
        novoCliente.setSenhaAcesso(senhaAcesso);       
        listaCliente.add(novoCliente);
        
        ver = novoCpf.verificarCpfIndexCliente(listaCliente, novoCliente.getCpf());
        if(ver != -1){
        	return 1;
        }
        else{
        	return -1;
        }     
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
