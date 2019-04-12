package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Endereco;
import com.netAssist.Tecnico;

public class TecnicoTeste {
	Endereco end = new Endereco();
	Tecnico tecnico = new Tecnico();
	@Before
	public void setUp() throws Exception {
		tecnico.setEnd(end);
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
		//fail("Not yet implemented");
	}

	@Test
	public void testAlterarStatusCliente() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeletarCliente() {
		//fail("Not yet implemented");
	}

}
