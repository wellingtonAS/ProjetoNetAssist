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
	public void testExibirMenuValida() {
		assertEquals(1, menu.exibirMenu("1"));
	}
	
	@Test
	public void testExibirMenuInvalida() {
		assertEquals(0, menu.exibirMenu("10"));
	}

	@Test
	public void testValidarTipoFuncionarioValido() {
		assertEquals(1, menu.validarOpcao("1"));
	}
	
	@Test
	public void testValidarTipoFuncionarioIvalido() {;
		assertEquals(0, menu.validarOpcao("3"));
	}
	
	@Test
	public void testValidarOpcaoAlteracaoValida() {
		assertEquals(1, menu.validarOpcaoAlteracao("1"));
	}
	
	@Test
	public void testValidarOpcaoAlteracaoInvalida() {
		assertEquals(0, menu.validarOpcaoAlteracao("3"));
	}
}
