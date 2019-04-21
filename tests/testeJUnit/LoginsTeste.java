package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Adm;
import com.netAssist.Funcionario;
import com.netAssist.Logins;

public class LoginsTeste {
	ArrayList<Funcionario> func = new ArrayList();
	Funcionario f = new Funcionario();
	Adm admin = new Adm();
	Logins lg = new Logins();
	String option;
	@Before
	public void setUp() throws Exception {
		lg.setAutenticacao("1");
		lg.setLoginAcesso("321");
		lg.setSenhaAcesso("321");
		lg.setTipoConexao("1");
		admin.setSenha("123");
		admin.setUsuario("123");
		func.add(admin);
		f.setUsuario("123");
		f.setSenha("123");
		
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
	public void testValidarOpcaoAutenticacaoUm() {
		assertEquals(1, lg.validarOpcao("1"));
		assertEquals(0, lg.validarOpcao("3"));
	}

	@Test
	public void testVerificarIndiceLogin() {
		assertEquals(0, lg.verificarIndiceLogin(f.getUsuario(), f.getSenha(), func));
	}

}
