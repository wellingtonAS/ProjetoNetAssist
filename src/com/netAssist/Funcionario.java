package com.netAssist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
    
    private String usuario;
    private String senha;
    private String cargo;
    public int i;
    
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
    public int efetuarLogin(String usuarioT, String senhaT, ArrayList<Funcionario> listaFuncionario){
    	int at = -1;
        int atAux = -1;
        for(i=0; i<listaFuncionario.size(); i++){
            if((usuarioT.equals(listaFuncionario.get(i).getUsuario()))&&(senhaT.equals(listaFuncionario.get(i).getSenha()))){
                at = 2;
                break;
            }
        }
        return at;
    }
      
    public int listarFuncionario(ArrayList<Funcionario> listaFuncionario){
        for(i=0; i<listaFuncionario.size(); i++){
        		JOptionPane.showMessageDialog(null, "LISTA DE FUNCIONARIOS:\n\nNOME: " + listaFuncionario.get(i).getNome() + "\n"
        				+ "CPF: " + listaFuncionario.get(i).getCpf() + "\nCIDADE: " + listaFuncionario.get(i).getCidade() + "\n"
        						+ "ESTADO: " + listaFuncionario.get(i).getEstado() + "\nCARGO: " + listaFuncionario.get(i).getCargo());
        }
        return 1;
    }
  //Metodo para listar todos os Clientes do ArrayList
    public int listarCliente(ArrayList<Cliente> listaCliente){
    	if(listaCliente.size() >= 1 && listaCliente.isEmpty() != true) {  
    		for(i=0; i<listaCliente.size(); i++){
            	JOptionPane.showMessageDialog(null, "LISTA DE CLIENTES:\n\nNOME: " + listaCliente.get(i).getNome() + "\n"
            			+ "CPF: " + listaCliente.get(i).getCpf() + "\nCIDADE: " + listaCliente.get(i).getCidade() + "\n"
            					+ "ESTADO: " + listaCliente.get(i).getEstado() + "\nSTATUS DO CONTRATO: " + listaCliente.get(i).getStatusContrato() + "\n"
            					+ "VELOCIDADE DO PLANO: " + listaCliente.get(i).getVelocidade() + "M" + "\nVALOR DO PLANO: R$" + listaCliente.get(i).getValorMensal() + "\n"
            							+ "TIPO DE AUTENTICACAO: " + listaCliente.get(i).getAutenticacao() + "\n"
            							+ "LOGIN DE ACESSO: " + listaCliente.get(i).getLoginAcesso());
            }
    		return 1;
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Nao Possui Clientes Cadastrados:\n");
    		return 0;
    	}
    }
}
