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
}
