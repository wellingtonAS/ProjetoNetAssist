package com.netAssist;

import java.util.ArrayList;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }
    Cpf novoCpf = new Cpf();
    Senha novaSenha = new Senha();
    int ver = 0;
    boolean contem;
    //M�TODO PARA REALIZAR CADASTRO DE FUNCIONARIO
    public int cadastrarFuncionario(ArrayList<Funcionario> listaFuncionario, String id, String nome, String cpf, String cidade, String estado, String usuario, String senha){
        //CADASTRAR COMO T�CNICO
    	if(id.equals("1")){
            Endereco novoEndereco = new Endereco();
            Tecnico novoTecnico = new Tecnico();
            novoTecnico.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoTecnico.setNome(nome);
            novoTecnico.setCpf(cpf);
            novoTecnico.setCargo("Tecnico");           
            //Informacoes do endereco do tecnico
            novoEndereco.setCidade(cidade);
            novoTecnico.setEstado(estado);
            //Informacoes de acesso do tecnico ao sistema           
            novoTecnico.setUsuario(usuario);
            novoTecnico.setSenha(senha); 
            listaFuncionario.add(novoTecnico);
            ver = novoCpf.verificarExisteCpf(listaFuncionario, novoTecnico.getCpf());
            if(ver == 0){
            	return 1;
            }
            else{
            	return -1;
            }        
        }
    	//CADASTRAR COMO ADMINISTRADOR
        else{
        	Endereco novoEndereco = new Endereco();
            Adm novoAdm = new Adm();
            novoAdm.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoAdm.setNome(nome);
            novoAdm.setCpf(cpf);
            novoAdm.setCargo("Administrador");           
            //Informacoes do endereco do tecnico
            novoEndereco.setCidade(cidade);
            novoAdm.setEstado(estado);
            //Informacoes de acesso do tecnico ao sistema         
            novoAdm.setUsuario(usuario);
            novoAdm.setSenha(senha); 
            listaFuncionario.add(novoAdm);
            ver = novoCpf.verificarExisteCpf(listaFuncionario, novoAdm.getCpf());
            if(ver == 0){
            	return 1;
            }
            else{
            	return -1;
            }             
        }
    }    
    //METODO PARA REALIZAR ALTERA��ES EM FUNCIONARIO
    public int alterarFuncionario(ArrayList<Funcionario> listaFuncionario, int indice, String id, String usuario, String senha){
		if(id.equals("1")){
			listaFuncionario.get(indice).setUsuario(usuario);;
			ver = novaSenha.validarUsuario(listaFuncionario, usuario);
            if(ver == 0){
            	return 1;
            }
            else{
            	return -1;
            } 
		}
		else{
			listaFuncionario.get(indice).setSenha(senha);
			return 1;
		}
	}
    //METODO PARA DELETAR UM FUNCIONARIO DA LISTA
    public int deletarFuncionario(ArrayList<Funcionario> listaFuncionario, int id, String cpf){
        listaFuncionario.remove(id);        
        if(listaFuncionario.isEmpty()){ 
        	return 1;
        }
        else{
        	if(listaFuncionario.get(id)!= null && listaFuncionario.get(id).getCpf().equals(cpf)){
            	return -1;
            }
            else{
            	return 1;
            }
        }  
    }    
}