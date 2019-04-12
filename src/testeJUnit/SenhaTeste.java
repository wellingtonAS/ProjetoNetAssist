package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Funcionario;
import com.netAssist.Logins;
import com.netAssist.Senha;

public class SenhaTeste {
	ArrayList<Cliente> listaC = new ArrayList();
	ArrayList<Funcionario> listaF = new ArrayList();
	Senha senha = new Senha();
	Funcionario f = new Funcionario();
	Cliente c = new Cliente();
	Logins lg = new Logins();
	@Before
	public void setUp() throws Exception {
		f.setUsuario("tec");
		listaF.add(f);
		c.setLogin(lg);
		c.setLoginAcesso("cliente");
		listaC.add(c);
	}

	@Test
	public void testValidarUsuario() {
		assertEquals("xxx", senha.validarUsuario(listaF));
	}

	@Test
	public void testValidarUsuarioCliente() {
		assertEquals("yyy", senha.validarUsuarioCliente(listaC));
	}

}
