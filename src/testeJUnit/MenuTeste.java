package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Menu;

public class MenuTeste {
	Menu menu = new Menu();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExibirMenu() {
		assertEquals("1", menu.exibirMenu());
	}

	@Test
	public void testValidarTipoFuncionario() {
		assertEquals("1", menu.validarOpcao());
	}

	@Test
	public void testValidarOpcaoAlteracao() {
		assertEquals("1", menu.validarOpcaoAlteracao());
	}

}
