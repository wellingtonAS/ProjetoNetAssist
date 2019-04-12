package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Logins;

public class LoginsTeste {
	Logins lg = new Logins();
	String option;
	@Before
	public void setUp() throws Exception {
		lg.setAutenticacao("1");
		lg.setLoginAcesso("321");
		lg.setSenhaAcesso("321");
		lg.setTipoConexao("1");
	}

	@Test
	public void testLogins() {
		Logins lg = new Logins();
	}

	@Test
	public void testLoginsStringStringStringString() {
		Logins lg1 = new Logins("1", "1", "321", "321");
	}

	@Test
	public void testGetAutenticacao() {
		assertEquals("1", lg.getAutenticacao());
	}

	@Test
	public void testGetTipoConexao() {
		assertEquals("1", lg.getTipoConexao());
	}

	@Test
	public void testGetLoginAcesso() {
		assertEquals("321", lg.getLoginAcesso());
	}

	@Test
	public void testGetSenhaAcesso() {
		assertEquals("321", lg.getSenhaAcesso());
	}

	@Test
	public void testValidarOpcaoAutenticacao() {
		option = lg.validarOpcaoAutenticacao();
		if(lg.validarOpcaoAutenticacao().equals("1")) {
			assertEquals("1", );
		}
	}

	@Test
	public void testVerificarIndiceLogin() {
		fail("Not yet implemented");
	}

}
