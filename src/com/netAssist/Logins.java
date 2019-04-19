package com.netAssist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Logins implements ValidacaoEntradas{
    private String autenticacao;
    private String tipoConexao;
    private String loginAcesso;
    private String senhaAcesso;

    public Logins(){}
    public Logins(String autenticacao, String tipoConexao, String loginAcesso, String senhaAcesso) {
        this.autenticacao = autenticacao;
        this.tipoConexao = tipoConexao;
        this.loginAcesso = loginAcesso;
        this.senhaAcesso = senhaAcesso;
      
    }
    public String option;
    public String getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(String autenticacao) {
        this.autenticacao = autenticacao;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getLoginAcesso() {
        return loginAcesso;
    }

    public void setLoginAcesso(String loginAcesso) {
        this.loginAcesso = loginAcesso;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    } 
    @Override
    public int validarOpcao(String op){
    	if((op.equals("1")) || (op.equals("2"))){
			return 1;
		}
		else{
			return 0;
		}
    }
    
    public int verificarIndiceLogin(String usuarioT, String senhaT, ArrayList<Funcionario> listaFuncionario){
        int at = 0;
        for(int i=0; i<listaFuncionario.size(); i++){
            if((usuarioT.equals(listaFuncionario.get(i).getUsuario()))&&(senhaT.equals(listaFuncionario.get(i).getSenha()))){
                at = i;
                break;
            }
        }
        return at;
    }   
}
