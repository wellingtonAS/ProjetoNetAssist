package com.netAssist;

import javax.swing.JOptionPane;

public class Logins {
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
    String option;
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
    
    public String validarOpcaoStatus(){
        do{
            option = JOptionPane.showInputDialog("STATUS DO CONTRATO\n1 - Ativo\n2 - Bloqueado\n"
            		+ "DIGITE O VALOR CORRESPONDENTE: ");
            
            option = option.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
            
        }while(!(option.equals("1")) && !(option.equals("2")));
        return option;
    }
    
    public String validarOpcaoAutenticacao(){
        do{
            option = JOptionPane.showInputDialog("TIPO DE AUTENTICACAO\n1 - PPPoE\n2 - Hotspot\nDIGITE O VALOR CORRESPONDENTE: ");
            
            option = option.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
            
        }while(!(option.equals("1")) && !(option.equals("2")) && !(option.equals("3")));
        return option;
    }
    
    
}
