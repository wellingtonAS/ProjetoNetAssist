package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Endereco;

public class EnderecoTeste {
	Endereco end2 = new Endereco();
	@Before
	public void setUp() throws Exception {
		end2.setCidade("MACEIO“");
		end2.setEstado("AL");
	}

	@Test
	public void testEndereco() {
		Endereco end2 = new Endereco();
		end2.getCidade();
	}

	@Test
	public void testEnderecoStringString() {
		Endereco end = new Endereco("Taquarana", "AL");
		end.getCidade();
	}

	@Test
	public void testGetCidade() {
		assertEquals("MACEIO“", end2.getCidade());
	}

	@Test
	public void testGetEstado() {
		assertEquals("AL", end2.getEstado());
	}

}
