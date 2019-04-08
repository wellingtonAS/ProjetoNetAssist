package com.netAssist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
    
    private String usuario;
    private String senha;
    private String cargo;
    
    public Funcionario(){
        super();
    }
    public Funcionario(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(nome, cpf, end);
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 
    
    //Metodo para verificar a autenticidade dos funcionarios listados! 
    public int efetuarLogin(Funcionario funcionario, ArrayList<Funcionario> listaFuncionario){
        int at = -1;
        int atAux;
        for(int i=0; i<listaFuncionario.size(); i++){
            if((funcionario.getUsuario().equals(listaFuncionario.get(i).getUsuario()))&&(funcionario.getSenha().equals(listaFuncionario.get(i).getSenha()))){
                at = 2;
                break;
            }
        }
        if(at == -1){
        	atAux = JOptionPane.showConfirmDialog(null, "Erro de Autenticacao, deseja tentar novamente?");
            if(atAux == 0){
            	return 0;
            }
            else{
            	return 1;
            }
        }
        else{        
            return 2;
        }
    }
    public int verificarIndiceLogin(Funcionario funcionario, ArrayList<Funcionario> listaFuncionario){
        int at = 0;
        for(int i=0; i<listaFuncionario.size(); i++){
            if((funcionario.getUsuario().equals(listaFuncionario.get(i).getUsuario()))&&(funcionario.getSenha().equals(listaFuncionario.get(i).getSenha()))){
                at = i;
                break;
            }
        }
        return at;
    }
    
    public void listarFuncionario(ArrayList<Funcionario> listaFuncionario){
        for(int i=0; i<listaFuncionario.size(); i++){
        		JOptionPane.showMessageDialog(null, "LISTA DE FUNCIONARIOS:\n" + listaFuncionario.get(i).getNome() + " -> " + listaFuncionario.get(i).getCpf() + " -> " + listaFuncionario.get(i).getCargo());
            }
    }
  //Metodo para listar todos os Clientes do ArrayList
    public void listarCliente(ArrayList<Cliente> listaCliente){
    	if(listaCliente.size() >= 1) {  
    		for(int i=0; i<listaCliente.size(); i++){
            	JOptionPane.showMessageDialog(null, "LISTA DE CLIENTES:\n" + listaCliente.get(i).getNome() + " -> " + listaCliente.get(i).getCpf() + " -> " + listaCliente.get(i).getStatusContrato() + " -> " + listaCliente.get(i).getAutenticacao());
            }
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Nao Possui Clientes Cadastrados:\n");
    	}
    }
}
