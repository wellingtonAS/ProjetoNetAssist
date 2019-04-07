package com.netAssist;

import java.util.ArrayList;

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
    @Override
    public String toString() {
        return "Funcionario{" + "usuario=" + usuario + ", senha=" + senha + ", cargo=" + cargo + '}';
    }
    
    //Metodo para verificar a autenticidade dos funcionarios listados! 
    public boolean efetuarLogin(Funcionario funcionario, ArrayList<Funcionario> listaFuncionario){
        int at = 0;
        for(int i=0; i<listaFuncionario.size(); i++){
            if((funcionario.getUsuario().equals(listaFuncionario.get(i).getUsuario()))&&(funcionario.getSenha().equals(listaFuncionario.get(i).getSenha()))){
                at = 1;
                break;
            }
        }
        if(at == 0){
            System.out.println("Erro de Autenticação!");
            return false;
        }
        else{
            System.out.println("Entrando do Sistema! Aguarde um pouco!");
            return true;
        }
    }
}
