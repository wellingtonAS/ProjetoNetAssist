package com.netAssist;

public class Cliente extends Pessoa{
    private Contrato contrato;
    private Logins login;

    
    public Cliente(){}
    public Cliente( Contrato contrato, String nome, String cpf, Endereco end) {
        super(nome, cpf, end);
        this.contrato = contrato;
    }

    public Logins getLogin() {
        return login;
    }

    public void setLogin(Logins login) {
        this.login = login;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    public String getAutenticacao() {
        return login.getAutenticacao();
    }

    public void setAutenticacao(String autenticacao) {
        login.setAutenticacao(autenticacao);
    }

    public String getTipoConexao() {
        return login.getTipoConexao();
    }

    public void setTipoConexao(String tipoConexao) {
        login.setTipoConexao(tipoConexao);
    }

    public String getLoginAcesso() {
        return login.getLoginAcesso();
    }

    public void setLoginAcesso(String loginAcesso) {
        login.setLoginAcesso(loginAcesso);
    }

    public String getSenhaAcesso() {
        return login.getSenhaAcesso();
    }

    public void setSenhaAcesso(String senhaAcesso) {
        login.setSenhaAcesso(senhaAcesso);
    }
    
    public String getVelocidade() {
        return contrato.getVelocidade();
    }

    public void setVelocidade(String velocidade) {
        contrato.setVelocidade(velocidade);
    }

    public String getValorMensal() {
        return contrato.getValorMensal();
    }

    public void setValorMensal(String valorMensal) {
        contrato.setValorMensal(valorMensal);
    }

    public String getStatusContrato() {
        return contrato.getStatusContrato();
    }

    public void setStatusContrato(String statusContrato) {
        contrato.setStatusContrato(statusContrato);
    }
    
}
