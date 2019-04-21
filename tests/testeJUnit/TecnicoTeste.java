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
	ArrayList<Cliente> clienteTS = new ArrayList<Cliente>();
	ArrayList<Cliente> clienteTS2 = new ArrayList<Cliente>();
	ArrayList<Cliente> clienteTS3 = new ArrayList<Cliente>();
	Endereco end = new Endereco();
	Contrato contr = new Contrato();
	Logins logs = new Logins();
	Tecnico tecnico = new Tecnico();
	Cliente cliente = new Cliente();
	Cliente cliente1 = new Cliente();
	Cliente cliente2 = new Cliente();
	Cliente cliente3 = new Cliente();
	@Before
	public void setUp() throws Exception {
		tecnico.setEnd(end);
		cliente.setLogin(logs);
		cliente.setEnd(end);
		cliente.setContrato(contr);
		clienteTS2.add(cliente);
		cliente1.setCpf("36985214703");
		cliente2.setCpf("74125896303");
		cliente3.setCpf("98796325801");
		clienteTS3.add(cliente1);
		clienteTS3.add(cliente2);
		clienteTS3.add(cliente3);
	}
	
	@Test
	public void testTecnico() {
		Tecnico tec = new Tecnico();
		tec.getCargo();
	}

	@Test
	public void testTecnicoStringStringStringStringStringEndereco() {
		Tecnico tec1 = new Tecnico("tec", "tec", "1", "tecnico1", "09876543212", end);
		tec1.getCargo();
	}

	@Test
	public void testCadastrarClienteAtivo() {
		assertEquals(1, tecnico.cadastrarCliente(clienteTS, "CLIENTE TESTE", "78932145609", "SEM LIMITE", "ZORROLANDIA", "456", "456", "5", "50", "1", "1")); 
	}
	
	@Test
	public void testCadastrarClienteBloqueado() { 
		assertEquals(1, tecnico.cadastrarCliente(clienteTS, "CLIENTE TESTE2", "12398745609", "SEM LIMITE2", "ZORROLANDIA2", "654", "654", "10", "60", "2", "2"));
	}

	@Test
	public void testAlterarStatusClienteAtivo() {
		assertEquals(1, tecnico.alterarStatusCliente(clienteTS2, 0, "1"));
	}
	
	@Test
	public void testAlterarStatusClienteBloqueado() {
		assertEquals(1, tecnico.alterarStatusCliente(clienteTS2, 0, "2"));
	}

	@Test
	public void testDeletarCliente() {
		cliente.setCpf("12365478909");
		assertEquals(1, tecnico.deletarCliente(clienteTS3, 1, "74125896303"));
	}
}
