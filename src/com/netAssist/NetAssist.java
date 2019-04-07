package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NetAssist {

    public static void main(String[] args) { 

        //Instanciamento dos Arrays
        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        ArrayList<Cliente> listaClientes = new ArrayList();
        ArrayList<Endereco> listaEndFuncionario = new ArrayList();
        ArrayList<Endereco> listaEndClientes = new ArrayList();
       
        Menu opcao = new Menu();
        Adm adm = new Adm();
        String id;        
        id = opcao.validarTipoFuncionario();
        //System.out.println(id);
        if(id != null){
        	//System.out.println(id);
        	if(id.equals("1")) {
        		//System.out.println(id);
        		adm.cadastrarFuncionario(listaFuncionarios, id);
        	}
        	else{
        		adm.cadastrarFuncionario(listaFuncionarios, id);
        	}
        }
        else{
        	System.out.println("Entrada Invalida");
        }
    
        /*
        do{ 
            //System.out.println(opcao.exibirMenu());
            opc = opcao.exibirMenu();
            if(opc == "1"){
                
            }
            
        }while(!(opc.equals("0")));
        */
    } 
}   
