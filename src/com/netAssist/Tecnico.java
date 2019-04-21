package com.netAssist;

import java.util.ArrayList;

public class Tecnico extends Funcionario{

    public Tecnico(){}

    public Tecnico(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }   
    //METODO PARA CADASTRAR CLIENTE EM UMA LISTA
    public int cadastrarCliente(ArrayList<Cliente> listaCliente, String nome, String cpf, String cidade, String estado, String user, String senhaAcesso, String velocidade, String valor, String statusContrato, String tipoConexao){
        Cliente novoCliente = new Cliente();
        Contrato novoContrato = new Contrato();
        Logins novoLogin = new Logins();
        Cpf novoCpf = new Cpf();
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
    //METODO PARA ALTERAR STATUS DE UM CLIENTE
    public int alterarStatusCliente(ArrayList<Cliente> listaCliente, int indice, String id){
    	Contrato contratoTeste = new Contrato();
    	int ver = 0;
		if(id.equals("1")){
			listaCliente.get(indice).setStatusContrato("Ativo");
			ver = contratoTeste.validarStatus(listaCliente, indice, listaCliente.get(indice).getStatusContrato());
            if(ver == 1){
            	return 1; 
            }
            else{
            	return -1;
            } 
		}
		else{
			listaCliente.get(indice).setStatusContrato("Bloqueado");
			ver = contratoTeste.validarStatus(listaCliente, indice, listaCliente.get(indice).getStatusContrato());
            if(ver == 1){
            	return 1;
            }
            else{
            	return -1;
            } 
		}
	}   
    //METODO PARA DELETAR CLIENTE DE UMA LISTA
    public int deletarCliente(ArrayList<Cliente> listaCliente, int id, String cpf){
    	listaCliente.remove(id);        
        if(listaCliente.isEmpty()){ 
        	return 1;
        }
        else{
        	if(listaCliente.get(id)!= null && listaCliente.get(id).getCpf().equals(cpf)){
            	return -1;
            }
            else{
            	return 1;
            }
        } 
    }
}
