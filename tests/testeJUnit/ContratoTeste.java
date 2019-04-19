package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Contrato;

public class ContratoTeste {
	Contrato ct1 = new Contrato();
	Cliente cl = new Cliente();
	
	@Before
	public void setUp() throws Exception {
		ct1.setVelocidade("10");
		ct1.setValorMensal("60");
		ct1.setStatusContrato("1");
	}

	@Test
	public void testContrato() {
		Contrato ct = new Contrato();
	}

	@Test
	public void testContratoStringStringString() {
		Contrato ct = new Contrato("10", "60", "1");
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
		assertEquals("1", ct1.getStatusContrato());
	}


	@Test
	public void testValidarOpcao() {
		Contrato ct1 = new Contrato();
		Cliente cl = new Cliente();
		cl.setContrato(ct1);
		assertEquals("1", ct1.validarOpcao());
		assertEquals("2", ct1.validarOpcao());
	}

}
