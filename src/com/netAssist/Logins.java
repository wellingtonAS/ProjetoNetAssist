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
    public String validarOpcao(){
        do{
            option = JOptionPane.showInputDialog("TIPO DE AUTENTICACAO\n\n1 - PPPoE\n2 - Hotspot\nDIGITE O VALOR CORRESPONDENTE: ");
            
            option = option.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
            
            if(!(option.equals("1")) && !(option.equals("2"))){
            	JOptionPane.showMessageDialog(null, "Por Favor Digite Um Tipo de Autenticacao Valido!");
            }      
        }while(!(option.equals("1")) && !(option.equals("2")));
        return option;
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
