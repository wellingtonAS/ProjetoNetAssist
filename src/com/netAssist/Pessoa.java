package com.netAssist;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Endereco end;

    public Pessoa(String nome, String cpf, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }

    public String getCidade() {
        return end.getCidade();
    }

    public void setCidade(String cidade) {
        end.setCidade(cidade);
    }

    public String getEstado() {
        return end.getEstado();
    }

    public void setEstado(String estado) {
        end.setEstado(estado);
    }
    
    public Pessoa(){
        super();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }  
    
}
