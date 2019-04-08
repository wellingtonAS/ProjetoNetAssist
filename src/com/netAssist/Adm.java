package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }
    String cpfAux;
    Cpf novoCpf = new Cpf();
    Senha novaSenha = new Senha();
    int index;
    public void cadastrarFuncionario(ArrayList<Funcionario> listaFuncionario, String id){
        if(id.equals("1")){
            Endereco novoEndereco = new Endereco();
            Tecnico novoTecnico = new Tecnico();
            novoTecnico.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoTecnico.setNome(JOptionPane.showInputDialog("CADASTRAR TECNICO!\nNOME: ").trim().toUpperCase());
            novoTecnico.setCpf(novoCpf.validarCpf());
            novoTecnico.setCargo("Tecnico");           
            //Informacoes do endereco do tecnico
            novoEndereco.setCidade(JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase());
            novoTecnico.setEstado(JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase());
            //Informacoes de acesso do tecnico ao sistema
            novoTecnico.setUsuario(JOptionPane.showInputDialog("USUARIO: "));            
            novoTecnico.setSenha(novaSenha.validarSenha(listaFuncionario));
            listaFuncionario.add(novoTecnico);
        }
        else{
        	Endereco novoEndereco = new Endereco();
            Adm novoAdm = new Adm();
            novoAdm.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoAdm.setNome(JOptionPane.showInputDialog("CADASTRAR ADMINISTRADOR!\nNOME: ").trim().toUpperCase());
            novoAdm.setCpf(novoCpf.validarCpf());
            novoAdm.setCargo("Administrador");           
            //Informacoes do endereco do tecnico
            novoAdm.setCidade(JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase());
            novoAdm.setEstado(JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase());
            //Informacoes de acesso do tecnico ao sistema
            novoAdm.setUsuario(JOptionPane.showInputDialog("USUARIO: "));
            novoAdm.setSenha(novaSenha.validarSenha(listaFuncionario));
            listaFuncionario.add(novoAdm);
        }
    }
    
    public void alterarFuncionario(ArrayList<Funcionario> listaFuncionario, int indice, String id){
			if(id.equals("1")){
				listaFuncionario.get(indice).setUsuario(JOptionPane.showInputDialog("NOVO USUARIO: "));;
			}
			else{
				listaFuncionario.get(indice).setSenha(JOptionPane.showInputDialog("NOVA SENHA: "));
			}
		}
 
    public void deletarFuncionario(ArrayList<Funcionario> listaFuncionario, int id){
        listaFuncionario.remove(id);
    }
    
}