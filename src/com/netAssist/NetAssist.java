package com.netAssist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NetAssist {

    public static void main(String[] args) { 

        //Instanciamento dos Arrays
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
       
        Menu menu = new Menu(); 
        Adm adm = new Adm();
        Tecnico tecnico = new Tecnico();
        Funcionario funcionario = new Funcionario();
        Cpf cpf = new Cpf();
        Logins logins = new Logins();
        Endereco endereco = new Endereco(); 
        Contrato contrato = new Contrato(); 
        Cliente cliente = new Cliente();
        Senha senha = new Senha();
        cliente.setEnd(endereco); 
        cliente.setContrato(contrato); 
        cliente.setLogin(logins); 
        String id = null;  
        String usuarioTeste = null;
        String senhaTeste = null;
        String nomeTeste = null;
        String cpfTeste = null;
        String cidadeTeste = null;
        String estadoTeste = null;
        String valorTeste = null;
        String velocidadeTeste = null;
        String statusContratoTeste = null;
        String tipoConTeste = null;
        int ver = 0;
        int index;
        int indexLogin;
        //CADASTRO INICIAL DO PRIMEIRO FUNCIONARIO
        JOptionPane.showMessageDialog(null, "BEM VINDO AO PRIMEIRO ACESSO AO SISTEMA!\nPara Iniciar Precisamos que Seja "
        		+ "Cadastrado um Funcionario, o Qual Estara Incluso no Quadro de ADMINISTRADORES");
        
        nomeTeste = JOptionPane.showInputDialog("CADASTRAR TECNICO!\n\nNOME: ").trim().toUpperCase();
        do{
        	cpfTeste = JOptionPane.showInputDialog("CPF (Sem Postos e virgulas): ");
        	cpfTeste = cpfTeste.replaceAll(" ", "");
        	ver = cpf.validarCpf(cpfTeste);
        	if(ver == 0){
        		JOptionPane.showMessageDialog(null, "CPF Invalido!");
        	}
        	else{
        		ver = cpf.verificarExisteCpf(listaFuncionarios, cpfTeste);
        		if(ver == 0){
        			JOptionPane.showMessageDialog(null, "Existe Um Funcionario Que Possue Este CPF Cadastrado!");
        			ver = 0;
        		}
        		else{
        			ver = 1;
        		}
        	}
        }while(ver != 1);
        ver = 0;
        cidadeTeste = JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase();
        estadoTeste = JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase();
        do{
        	usuarioTeste = JOptionPane.showInputDialog("USUARIO DE ACESSO: ");
        	ver = senha.validarUsuario(listaFuncionarios, usuarioTeste);
        	if(ver == 0){
        		JOptionPane.showMessageDialog(null, "Existe Funcionario com Este Usuario, Tente Novamente!");
        	}
        }while(ver != 1);
        ver = 0;
        senhaTeste = JOptionPane.showInputDialog("SENHA: ");
        
        ver = adm.cadastrarFuncionario(listaFuncionarios, "2", nomeTeste, cpfTeste, cidadeTeste, estadoTeste, usuarioTeste, senhaTeste);
        if(ver == 1){
        	JOptionPane.showMessageDialog(null, "Cadastro Realizado Com Sucesso!");
        }
        else{
        	JOptionPane.showMessageDialog(null, "Falha ao Cadastrar Funcionario!");
        }
        ver = 0;   
        //INICIAR SISTEMA NET ASSIST
        do{
        	usuarioTeste = (JOptionPane.showInputDialog("INSIRA OS DADOS DE AUTENTICACAO PARA ENTRAR NO SISTEMA:\n\nUSUARIO: "));            
            senhaTeste = (JOptionPane.showInputDialog("SENHA: "));            
            ver = funcionario.efetuarLogin(usuarioTeste, senhaTeste, listaFuncionarios);
        	if(ver == 2){
        		indexLogin = logins.verificarIndiceLogin(usuarioTeste, senhaTeste, listaFuncionarios);
        		do{
        			do{
        	            id = JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue optioneracao voce deseja fazer?\n\n"
        	                + "1 - Cadastro de Funcionario\n2 - Alterar Usuario de Acesso\n3 - Deletar Funcionario\n4 - Listar Funcionarios\n"
        	                + "5 - Cadastrar Clientes\n6 - Mudar Status do Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Sair do Sistema e Realizar Novo Login\nDigite a qualquer momento 0 para sair!");
        	            
        	            id = id.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
        	            ver = menu.exibirMenu(id);
        	            if(ver == 0){
        	            	JOptionPane.showMessageDialog(null, "Opcao Invalida!\n");
        	            }
        	        }while(ver == 0);
        			ver = 0;
        			//OPCAO PARA REALIZAR CADASTRO DE FUNCIONARIO
        			if(id.equals("1")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Administrador")){      					
        					do{
        						id = JOptionPane.showInputDialog("ACESSO AO SISTEMA!\n\nTipo de funcionario:\n"
        			            		+ "1 - Tecnico\n2 - Administrador\nDigite o valor correspondente ao funcionario a ser"
        			            		+ " cadastrado: ");
        						id = id.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
        						ver = menu.validarOpcao(id);
        						if(ver == 0){
                	            	JOptionPane.showMessageDialog(null, "Opcao Invalida!\n");
                	            }
        					}while(ver == 0);
        					
        					ver = 0;	
        					nomeTeste = JOptionPane.showInputDialog("CADASTRAR TECNICO!\n\nNOME: ").trim().toUpperCase();
        			        do{
        			        	cpfTeste = JOptionPane.showInputDialog("CPF (Sem Postos e virgulas): ");
        			        	cpfTeste = cpfTeste.replaceAll(" ", "");
        			        	ver = cpf.validarCpf(cpfTeste);
        			        	if(ver == 0){
        			        		JOptionPane.showMessageDialog(null, "CPF Invalido!");
        			        	}
        			        	else{
        			        		ver = cpf.verificarExisteCpf(listaFuncionarios, cpfTeste);
        			        		if(ver == 0){
        			        			JOptionPane.showMessageDialog(null, "Existe Um Funcionario Que Possue Este CPF Cadastrado!");
        			        			ver = 0;
        			        		}
        			        		else{
        			        			ver = 1;
        			        		}
        			        	}
        			        }while(ver != 1);
        			        ver = 0;
        			        cidadeTeste = JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase();
        			        estadoTeste = JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase();
        			        do{
        			        	usuarioTeste = JOptionPane.showInputDialog("USUARIO DE ACESSO: ");
        			        	ver = senha.validarUsuario(listaFuncionarios, usuarioTeste);
        			        	if(ver == 0){
        			        		JOptionPane.showMessageDialog(null, "Existe Funcionario com Este Usuario, Tente Novamente!");
        			        	}
        			        }while(ver != 1);
        			        ver = 0;
        			        senhaTeste = JOptionPane.showInputDialog("SENHA: ");
        			        
        			        ver = adm.cadastrarFuncionario(listaFuncionarios, id, nomeTeste, cpfTeste, cidadeTeste, estadoTeste, usuarioTeste, senhaTeste);
        			        if(ver == 1){
        			        	JOptionPane.showMessageDialog(null, "Cadastro Realizado Com Sucesso!");
        			        }
        			        else{
        			        	JOptionPane.showMessageDialog(null, "Falha ao Cadastrar Funcionario!");
        			        }
        			        ver = 0;   
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Cadastrar Funcionario!");
        				}
        			}
        			//OPCAO PARA ALTERAR DADOS DE ACESSO DE FUNCIONARIO
        			else if(id.equals("2")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Administrador")){
        					cpfTeste = JOptionPane.showInputDialog("DIGITE O CPF DO FUNCIONARIO QUE DESEJA ALTERAR (Sem Postos e virgulas): ");
            				index = cpf.verificarCpfIndex(listaFuncionarios, cpfTeste);
            				if(index != -1){       			
                				do{
                		            id = JOptionPane.showInputDialog("ALTERACAO DE DADOS CADASTRAIS:\n\nQual Dado Voce Deseja Alterar?\n"
                		                + "1 - USUARIO\n2 - SENHA");
                		            
                		            id = id.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
                		            ver = menu.validarOpcaoAlteracao(id);
                		            if(ver == 0){
                    	            	JOptionPane.showMessageDialog(null, "Opcao Invalida!\n");
                    	            }
                		        }while(ver == 0);
                				ver = 0;
            			        if(id.equals("1")){
            			        	do{
                			        	usuarioTeste = JOptionPane.showInputDialog("DIGITE O NOVO USUARIO DE ACESSO: ");
                			        	ver = senha.validarUsuario(listaFuncionarios, usuarioTeste);
                			        	if(ver == 0){
                			        		JOptionPane.showMessageDialog(null, "Existe Funcionario com Este Usuario, Tente Novamente!");
                			        	}
                			        }while(ver != 1);
            			        	ver = adm.alterarFuncionario(listaFuncionarios, index,id, usuarioTeste, senhaTeste); 
            			        	if(ver == 1){
            			        		JOptionPane.showMessageDialog(null, "Funcionario Alterado com Sucesso!");
            			        	}
            			        	else{
            			        		JOptionPane.showMessageDialog(null, "Ocorreu Algum Problema Duarante a Alteracao!");
            			        	}
            			        }
            			        else{
            			        	senhaTeste = JOptionPane.showInputDialog("DIGITE A NOVA SENHA: ");
            			        	ver = adm.alterarFuncionario(listaFuncionarios, index, id, usuarioTeste, senhaTeste); 
            			        	if(ver == 1){
            			        		JOptionPane.showMessageDialog(null, "Funcionario Alterado com Sucesso!");
            			        	}
            			        	else{
            			        		JOptionPane.showMessageDialog(null, "Ocorreu Algum Problema Duarante a Alteracao!");
            			        	}
            			        }   			
            				}
            				else{
            					JOptionPane.showMessageDialog(null, "Funcionario Inexistente!");
            				}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Alterar Dados deste Funcionario!");
        				}
        			}
        			//OPCAO PARA DELETAR FUNCIONARIO
        			else if(id.equals("3")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Administrador")){
        					cpfTeste = JOptionPane.showInputDialog("DIGITE O CPF DO FUNCIONARIO QUE DESEJA ALTERAR (Sem Postos e virgulas): ");
            				index = cpf.verificarCpfIndex(listaFuncionarios, cpfTeste);
            				if(index != -1 && index != 0){
            					ver = adm.deletarFuncionario(listaFuncionarios, index, cpfTeste);
            					if(ver == 1){
            						JOptionPane.showMessageDialog(null, "Funcionario Deletado com Sucesso!");
            					}
            					else{
            						JOptionPane.showMessageDialog(null, "Ocorreu Um Problema Ao Deletar o Funcionario Informado!");
            					}
            				}
            				else{
            					JOptionPane.showMessageDialog(null, "Funcionario Inexistente ou Nao Pode ser Deletado!");
            				}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Deletar Funcionario!");
        				}
        			}
        			//OPCAO PARA REALIZAR LISTAGEM DE FUNCIONARIO
        			else if(id.equals("4")){
        				for(int i=0; i<listaFuncionarios.size(); i++){
        	        		JOptionPane.showMessageDialog(null, "LISTA DE FUNCIONARIOS:\n\nNOME: " + listaFuncionarios.get(i).getNome() + "\n"
        	        				+ "CPF: " + listaFuncionarios.get(i).getCpf() + "\nCIDADE: " + listaFuncionarios.get(i).getCidade() + "\n"
        	        						+ "ESTADO: " + listaFuncionarios.get(i).getEstado() + "\nCARGO: " + listaFuncionarios.get(i).getCargo());
        				}
        			}
        			//OPCAO PARA REALIZAR CADASTRO DE CLIENTE
        			else if(id.equals("5")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Tecnico")){
        					nomeTeste = JOptionPane.showInputDialog("CADASTRAR CLIENTE!\n\nNOME: ").trim().toUpperCase();
        			        do{
        			        	cpfTeste = JOptionPane.showInputDialog("CPF (Sem Postos e virgulas): ");
        			        	cpfTeste = cpfTeste.replaceAll(" ", "");
        			        	ver = cpf.validarCpf(cpfTeste);
        			        	if(ver == 0){
        			        		JOptionPane.showMessageDialog(null, "CPF Invalido!");
        			        	}
        			        }while(ver != 1);
        			        ver = 0;
        			        cidadeTeste = JOptionPane.showInputDialog("CIDADE: ").trim().toUpperCase();
        			        estadoTeste = JOptionPane.showInputDialog("ESTADO: ").trim().toUpperCase();
        			        velocidadeTeste = JOptionPane.showInputDialog("VELOCIDADE DO PLANO: ").trim().toUpperCase();
        			        estadoTeste = JOptionPane.showInputDialog("VALOR DO PLANO: ").trim().toUpperCase();	        
        			        do{
        			            statusContratoTeste = JOptionPane.showInputDialog("STATUS DO CONTRATO\n\n1 - Ativo\n2 - Bloqueado\n"
        			            		+ "DIGITE O VALOR CORRESPONDENTE: ");        			            
        			            statusContratoTeste = statusContratoTeste.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
        			            ver = contrato.validarOpcao(statusContratoTeste);
        			            if(ver == 0){
                	            	JOptionPane.showMessageDialog(null, "Opcao Invalida!\n");
                	            }        			            
        			        }while(ver == 0);
        			        
        			        do{
        			            tipoConTeste = JOptionPane.showInputDialog("TIPO DE AUTENTICACAO\n\n1 - PPPoE\n2 - Hotspot\n"
        			            		+ "DIGITE O VALOR CORRESPONDENTE: ");        			            
        			            tipoConTeste = tipoConTeste.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
        			            ver = logins.validarOpcao(tipoConTeste);
        			            if(ver == 0){
                	            	JOptionPane.showMessageDialog(null, "Opcao Invalida!\n");
                	            }
        			        }while(ver == 0);
        			        
        			        do{
        			        	usuarioTeste = JOptionPane.showInputDialog("LOGIN DE AUTENTICACAO: ");
        			        	ver = senha.validarUsuarioCliente(listaClientes, usuarioTeste);
        			        	if(ver == 0){
        			        		JOptionPane.showMessageDialog(null, "Existe Funcionario com Este Usuario, Tente Novamente!");
        			        	}
        			        }while(ver != 1);
        			        ver = 0;
        			        senhaTeste = JOptionPane.showInputDialog("SENHA DE AUTENTICACAO: ");
        					
        					ver = tecnico.cadastrarCliente(listaClientes, nomeTeste, cpfTeste, cidadeTeste, estadoTeste, usuarioTeste, senhaTeste, velocidadeTeste, valorTeste, statusContratoTeste, tipoConTeste);
        					if(ver == 1){
        			        	JOptionPane.showMessageDialog(null, "Cadastro Realizado Com Sucesso!");
        			        }
        			        else{
        			        	JOptionPane.showMessageDialog(null, "Falha ao Cadastrar Funcionario!");
        			        }
        			        ver = 0; 
        				}       				        				
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Cadastrar Clientes!");
        				}
        			}
        			//OPCAO PARA REALIZAR ALTERACAO DO STATUS DO CLIENTE
        			else if(id.equals("6")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Tecnico")){
        					if(listaClientes.isEmpty() != true){
        						cpfTeste = JOptionPane.showInputDialog("DIGITE O CPF DO CLIENTE QUE DESEJA ALTERAR (Sem Postos e virgulas): ");
                				index = cpf.verificarCpfIndexCliente(listaClientes, cpfTeste);
                				if(index != -1){       			
                					do{
                			            statusContratoTeste = JOptionPane.showInputDialog("NOVO STATUS DO CONTRATO\n\n1 - Ativo\n2 - Bloqueado\n"
                			            		+ "DIGITE O VALOR CORRESPONDENTE: ");        			            
                			            statusContratoTeste = statusContratoTeste.replaceAll(" ", ""); //Metodo para remover os espacos vazios na String
                			            ver = contrato.validarOpcao(statusContratoTeste);
                			            if(ver == 0){
                        	            	JOptionPane.showMessageDialog(null, "Opcao Invalida!\n");
                        	            }        			            
                			        }while(ver == 0);
                    				ver = 0;
                			        
            			        	ver = tecnico.alterarStatusCliente(listaClientes, index, statusContratoTeste); 
            			        	if(ver == 1){
            			        		JOptionPane.showMessageDialog(null, "Funcionario Alterado com Sucesso!");
            			        	} 
            			        	else{
            			        		JOptionPane.showMessageDialog(null, "Ocorreu Algum Problema Durante a Alteracao!");
            			        	}
            			        	ver = 0;
                				}
                				else{
                					JOptionPane.showMessageDialog(null, "Cliente Inexistente!");
                				}
        					}
        					else{
        						JOptionPane.showMessageDialog(null, "N�o Existe Cliente Cadastrado!");
        					}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Alterar Dados deste Cliente!");
        				}
        			}
        			//OPCAO PARA DELETAR CLIENTE
        			else if(id.equals("7")){
        				if(listaFuncionarios.get(indexLogin).getCargo().equals("Tecnico")){
        					if(listaClientes.isEmpty() != true){
        						cpfTeste = JOptionPane.showInputDialog("DIGITE O CPF DO CLIENTE QUE DESEJA ALTERAR (Sem Postos e virgulas): ");
                				index = cpf.verificarCpfIndexCliente(listaClientes, cpfTeste);
                				if(index != -1 && index != 0){
                					ver = tecnico.deletarCliente(listaClientes, index, listaClientes.get(index).getCpf());
                					if(ver == 1){
                						JOptionPane.showMessageDialog(null, "Cliente Deletado com Sucesso!");
                					}
                					else{
                						JOptionPane.showMessageDialog(null, "Ocorreu Um Problema Ao Deletar o Cliente Informado!");
                					}
                				}
                				else{
                					JOptionPane.showMessageDialog(null, "Cliente Inexistente!");
                				}
        					}
        					else{
        						JOptionPane.showMessageDialog(null, "N�o Existe Cliente Cadastrado!");
        					}
        				}
        				else{
        					JOptionPane.showMessageDialog(null, "Voce Nao Tem Autorizacao para Deletar Clientes!");
        				}
        			}  	
        			//OPCAO PARA REALIZAR LISTAGEM DE CLIENTES
        			else if(id.equals("8")){
        				if(listaClientes.size() >= 1 && listaClientes.isEmpty() != true) {  
        		    		for(int i=0; i<listaClientes.size(); i++){
        		            	JOptionPane.showMessageDialog(null, "LISTA DE CLIENTES:\n\nNOME: " + listaClientes.get(i).getNome() + "\n"
        		            			+ "CPF: " + listaClientes.get(i).getCpf() + "\nCIDADE: " + listaClientes.get(i).getCidade() + "\n"
        		            					+ "ESTADO: " + listaClientes.get(i).getEstado() + "\nSTATUS DO CONTRATO: " + listaClientes.get(i).getStatusContrato() + "\n"
        		            					+ "VELOCIDADE DO PLANO: " + listaClientes.get(i).getVelocidade() + "M" + "\nVALOR DO PLANO: R$" + listaClientes.get(i).getValorMensal() + "\n"
        		            							+ "TIPO DE AUTENTICACAO: " + listaClientes.get(i).getAutenticacao() + "\n"
        		            							+ "LOGIN DE ACESSO: " + listaClientes.get(i).getLoginAcesso());
        		            }
        		    	}
        		    	else {
        		    		JOptionPane.showMessageDialog(null, "Nao Possui Clientes Cadastrados:\n");
        		    	}
        			}
        		}while(!(id.equals("9")) && !(id.equals("0")));
        		if(id.equals("0")){
        			ver = 1;
        		}      		
        	}
        	//CONFIRMAR SE O USUARIO DO SISTEMA DESEJA REALMENTE SAIR OU TENTAR AUTENTICAR NOVAMENTE
        	else if(ver == -1){
            	ver = JOptionPane.showConfirmDialog(null, "Erro de Autenticacao, deseja tentar novamente?");
                if(ver == 0){//Verifica se o usuario quer tentar novamente
                	ver = 0;
                }
                else{//Verica se o usuario n�o desejar continuar
                	ver = 1;
                }     		
        	}
        }while(ver != 1);
    }  
}   
