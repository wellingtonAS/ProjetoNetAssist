package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, cargo, nome, cpf, end);
    }
    Cpf novoCpf = new Cpf();
    Senha novaSenha = new Senha();
    public void cadastrarFuncionario(ArrayList<Funcionario> listaFuncionario, String id){
        if(id.equals("1")){
            Endereco novoEndereco = new Endereco();
            Tecnico novoTecnico = new Tecnico();
            novoTecnico.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoTecnico.setNome(JOptionPane.showInputDialog("CADASTRAR TECNICO!\n\nNOME: ").trim().toUpperCase());
            novoTecnico.setCpf(novoCpf.validarCpf());
            if((novoCpf.verificarExisteCpf(listaFuncionario, novoTecnico.getCpf())) != 0){
            	novoTecnico.setCargo("Tecnico");           
                //Informacoes do endereco do tecnico
                novoEndereco.setCidade(JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase());
                novoTecnico.setEstado(JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase());
                //Informacoes de acesso do tecnico ao sistema
                  
                novoTecnico.setUsuario(novaSenha.validarUsuario(listaFuncionario));
                novoTecnico.setSenha(JOptionPane.showInputDialog("SENHA: ")); 
                listaFuncionario.add(novoTecnico);
                JOptionPane.showMessageDialog(null, "Funcionario Cadastrado com Sucesso!");
            }
            else{
            	JOptionPane.showMessageDialog(null, "Existe Um Funcionario Que Possue Este CPF Cadastrado!");
            }
        }
        else{
        	Endereco novoEndereco = new Endereco();
            Adm novoAdm = new Adm();
            novoAdm.setEnd(novoEndereco);
            //Informacoes pessoais do tecnico
            novoAdm.setNome(JOptionPane.showInputDialog("CADASTRAR ADMINISTRADOR!\n\nNOME: ").trim().toUpperCase());
            novoAdm.setCpf(novoCpf.validarCpf());
            if((novoCpf.verificarExisteCpf(listaFuncionario, novoAdm.getCpf())) != 0){
            	novoAdm.setCargo("Administrador");           
                //Informacoes do endereco do tecnico
                novoAdm.setCidade(JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase());
                novoAdm.setEstado(JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase());
                //Informacoes de acesso do tecnico ao sistema
                novoAdm.setUsuario(novaSenha.validarUsuario(listaFuncionario));
                novoAdm.setSenha(JOptionPane.showInputDialog("SENHA: "));
                listaFuncionario.add(novoAdm);
                JOptionPane.showMessageDialog(null, "Funcionario Cadastrado com Sucesso!");
            }
            else{
            	JOptionPane.showMessageDialog(null, "Existe Um Funcionario Que Possue Este CPF Cadastrado!");
            }
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