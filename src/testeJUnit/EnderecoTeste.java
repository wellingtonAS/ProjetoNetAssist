package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Endereco;

public class EnderecoTeste {
	Endereco end2 = new Endereco();
	@Before
	public void setUp() throws Exception {
		end2.setCidade("MACEIӓ");
		end2.setEstado("AL");
	}

	@Test
	public void testEndereco() {
		Endereco end2 = new Endereco();
	}

	@Test
	public void testEnderecoStringString() {
		Endereco end = new Endereco("Taquarana", "AL");
	}

	@Test
	public void testGetCidade() {
		assertEquals("MACEIÓ", end2.getCidade());
	}

	@Test
	public void testGetEstado() {
		assertEquals("AL", end2.getEstado());
	}

}
