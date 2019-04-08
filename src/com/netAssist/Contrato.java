package com.netAssist;

public class Contrato {
    private int velocidade;
    private float valorMensal;
    private String statusContrato;

    public Contrato(){
        
    }
    public Contrato(int velocidade, float valorMensal, String statusContrato) {
        this.velocidade = velocidade;
        this.valorMensal = valorMensal;
        this.statusContrato = statusContrato;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getStatusContrato() {
        return statusContrato;
    }

    public void setStatusContrato(String statusContrato) {
        this.statusContrato = statusContrato;
    }
    
}
