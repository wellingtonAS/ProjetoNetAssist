package com.netAssist;

import javax.swing.JOptionPane;

public class Contrato implements ValidacaoEntradas{
    private String velocidade;
    private String valorMensal;
    private String statusContrato;
    public String option;
    public Contrato(){}
    public Contrato(String velocidade, String valorMensal, String statusContrato) {
        this.velocidade = velocidade;
        this.valorMensal = valorMensal;
        this.statusContrato = statusContrato;
    }
    
    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(String valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getStatusContrato() {
        return statusContrato;
    }

    public void setStatusContrato(String statusContrato) {
        this.statusContrato = statusContrato;
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
    
}
