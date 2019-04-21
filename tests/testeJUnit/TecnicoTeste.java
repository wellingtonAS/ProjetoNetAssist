package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Contrato;
import com.netAssist.Endereco;
import com.netAssist.Logins;
import com.netAssist.Tecnico;

public class TecnicoTeste {
	ArrayList<Cliente> clienteTS = new ArrayList();
	Endereco end = new Endereco();
	Contrato contr = new Contrato();
	Logins logs = new Logins();
	Tecnico tecnico = new Tecnico();
	Cliente cliente = new Cliente();
	@Before
	public void setUp() throws Exception {
		tecnico.setEnd(end);
		cliente.setLogin(logs);
		cliente.setEnd(end);
		cliente.setContrato(contr);
		clienteTS.add(cliente);
	}

	@Test
	public void testTecnico() {
		Tecnico tec = new Tecnico();
	}

	@Test
	public void testTecnicoStringStringStringStringStringEndereco() {
		Tecnico tec1 = new Tecnico("tec", "tec", "1", "tecnico1", "09876543212", end);
	}

	@Test
	public void testCadastrarCliente() {
		assertEquals(1, tecnico.cadastrarCliente(clienteTS, "CLIENTE TESTE", "78932145609", "SEM LIMITE", "ZORROLANDIA", "456", "456", "5", "50", "1", "1")); 
		assertEquals(1, tecnico.cadastrarCliente(clienteTS, "CLIENTE TESTE2", "12398745609", "SEM LIMITE2", "ZORROLANDIA2", "654", "654", "10", "60", "2", "2"));
	}

	@Test
	public void testAlterarStatusCliente() {
		//assertEquals(1, tecnico.alterarStatusCliente(clienteTS, 0, "1"));
		//assertEquals(1, tecnico.alterarStatusCliente(clienteTS, 0, "2"));
	}

	@Test
	public void testDeletarCliente() {
		//Não conseguimos manipular através dos métodos conhecidos as funções sem retornos!
	}

}
