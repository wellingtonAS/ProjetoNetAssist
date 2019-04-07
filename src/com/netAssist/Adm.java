package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }
    String cpfAux;
    Cpf cpf = new Cpf();
    
    public void cadastrarFuncionario(ArrayList<Funcionario> listaFuncionario, String id){
        if(id.equals("1")){
            Endereco novoEndereco = new Endereco();
            Tecnico novoTecnico = new Tecnico();
            Senha novaSenha = new Senha();
            novoTecnico.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoTecnico.setNome(JOptionPane.showInputDialog("CADASTRAR TECNICO!\nNOME: ").trim().toUpperCase());
            novoTecnico.setCpf(cpf.validarCpf());
            novoTecnico.setCargo("Tecnico");           
            //Informacoes do endereco do tecnico
            novoTecnico.setCidade(JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase());
            novoTecnico.setEstado(JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase());
            //Informacoes de acesso do tecnico ao sistema
            novoTecnico.setUsuario(JOptionPane.showInputDialog("USUARIO: "));            
            novaSenha.validarSenha(listaFuncionario);
            listaFuncionario.add(novoTecnico);
        }
        else{
            Adm novoAdm = new Adm();
            Senha novaSenha = new Senha();
            //Informacoes pessoais do tecnico
            //novoAdm.setNome(JOptionPane.showInputDialog("CADASTRAR ADMINISTRADOR!\nNOME: ").trim().toUpperCase());
            //novoAdm.setCpf(cpf.validarCpf());
            //novoAdm.setCargo("Administrador");           
            //Informacoes do endereco do tecnico
            //novoAdm.setCidade(JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase());
            //novoAdm.setEstado(JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase());
            //Informacoes de acesso do tecnico ao sistema
            //novoAdm.setUsuario(JOptionPane.showInputDialog("USUARIO: "));            
            novaSenha.validarSenha(listaFuncionario);  
            listaFuncionario.add(novoAdm);
        }
    }
    
   
    public void removerFuncionario(ArrayList<Funcionario> listaFuncionario, String cpf){
        for(int i=0; i<listaFuncionario.size(); i++){
                if(listaFuncionario.get(i).getCpf().equals(cpf)){
                }
            }
        //listaFuncionario.remove(index);
    }
    
    public void alterarFuncionario(ArrayList<Funcionario> listaFuncionario, String cpf, Funcionario funcionario){

        funcionario.setUsuario(JOptionPane.showInputDialog("ATUALIZAÃ‡ÃƒO DE ACESSO!\nNOVO USUÃ�RIO: "));
        funcionario.setSenha(JOptionPane.showInputDialog("NOVA SENHA: "));
    }
    
    public void listarFuncionario(ArrayList<Funcionario> listaFuncionario){
        for(int i=0; i<listaFuncionario.size(); i++){
                System.out.println("NOME = " + listaFuncionario.get(i).getNome() + " -> CPF = " + listaFuncionario.get(i).getCpf());
            }
    }
    public void bloquearCliente(Cliente cliente){
        cliente.setStatusContrato(3);
    }
    public void liberarCliente(Cliente cliente){
        cliente.setStatusContrato(1);
    }
    
}