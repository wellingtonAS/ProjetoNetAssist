package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Contrato;

public class ContratoTeste {
	ArrayList<Cliente> listaCL = new ArrayList<Cliente>();
	Contrato ct1 = new Contrato();
	Cliente cl = new Cliente();
	@Before
	public void setUp() throws Exception {
		ct1.setVelocidade("10");
		ct1.setValorMensal("60");
		ct1.setStatusContrato("Ativo");
		cl.setContrato(ct1);
		listaCL.add(cl);
	}

	@Test
	public void testContrato() {
		Contrato ct = new Contrato();
		ct.getStatusContrato();
	}

	@Test
	public void testContratoStringStringString() {
		Contrato ct = new Contrato("10", "60", "1");
		ct.getStatusContrato();
	}

	@Test
	public void testGetVelocidade() {
		assertEquals("10", ct1.getVelocidade());
	}

	@Test
	public void testGetValorMensal() {
		assertEquals("60", ct1.getValorMensal());
	}

	@Test
	public void testGetStatusContrato() {
		assertEquals("Ativo", ct1.getStatusContrato());
	}

	@Test
	public void testValidarOpcao1() {
		assertEquals(1, ct1.validarOpcao("1"));
	}
	
	@Test
	public void testValidarOpcao2() {
		assertEquals(0, ct1.validarOpcao("3"));
	}
	
	@Test
	public void testValidarStatusAtivo() {
		assertEquals(1, ct1.validarStatus(listaCL, 0, "Ativo"));
	}
	
	@Test
	public void testValidarStatusBloqueado() {
		assertEquals(0, ct1.validarStatus(listaCL, 0, "Bloqueado"));
	}
}
