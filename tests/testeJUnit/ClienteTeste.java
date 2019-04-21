package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Contrato;
import com.netAssist.Endereco;
import com.netAssist.Logins;
import com.netAssist.Tecnico;

public class ClienteTeste {
	
	Contrato ct = new Contrato();
	Cliente c = new Cliente();
	Tecnico t = new Tecnico();
	Endereco end = new Endereco();
	Logins l = new Logins();
	@Before
	public void setUp() throws Exception {
		c.setLogin(l);
		c.setContrato(ct);
		c.setAutenticacao("1");
		c.setTipoConexao("1");
		c.setLoginAcesso("123");
		c.setSenhaAcesso("123");
		c.setVelocidade("5");
		c.setValorMensal("50");
		c.setStatusContrato("1");
	}

	@Test
	public void testCliente() {
		Cliente c = new Cliente();
		c.getCpf();
	}

	@Test
	public void testClienteContratoStringStringEndereco() {
		Cliente c1 = new Cliente(ct, "Maria", "43245648704", end);
		c1.getCpf();
	}

	@Test
	public void testClienteContrato() {
		c.setContrato(ct);
	}

	@Test
	public void testGetLogin() {
		assertEquals(l, c.getLogin());
	}

	@Test
	public void testGetContrato() {
		assertEquals(ct, c.getContrato());
	}

	@Test
	public void testGetAutenticacao() {
		assertEquals("1", c.getAutenticacao());
	}

	@Test
	public void testGetTipoConexao() {
		assertEquals("1", c.getTipoConexao());
	}

	@Test
	public void testGetLoginAcesso() {
		assertEquals("123", c.getLoginAcesso());
	}

	@Test
	public void testGetSenhaAcesso() {
		assertEquals("123", c.getSenhaAcesso());
	}

	@Test
	public void testGetVelocidade() {
		assertEquals("5", c.getVelocidade());
	}

	@Test
	public void testGetValorMensal() {
		assertEquals("50", c.getValorMensal());
	}

	@Test
	public void testGetStatusContrato() {
		assertEquals("1", c.getStatusContrato());
	}

}
