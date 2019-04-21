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
	ArrayList<Cliente> listaCS = new ArrayList();
	ArrayList<Cliente> listaCS2 = new ArrayList();
	ArrayList<Funcionario> listaFS = new ArrayList();
	ArrayList<Funcionario> listaFS2 = new ArrayList();
	Senha senha = new Senha();
	Funcionario f = new Funcionario();
	Cliente c = new Cliente();
	Logins lg = new Logins();
	@Before
	public void setUp() throws Exception {
		f.setUsuario("tec");
		listaFS.add(f);
		c.setLogin(lg);
		c.setLoginAcesso("cliente");
		listaCS.add(c);
	}

	@Test
	public void testValidarUsuario() {
		assertEquals(1, senha.validarUsuario(listaFS, "xxx"));
		assertEquals(0, senha.validarUsuario(listaFS, "tec"));
		assertEquals(1, senha.validarUsuario(listaFS2, "yyy"));
	}

	@Test
	public void testValidarUsuarioCliente() {
		assertEquals(1, senha.validarUsuarioCliente(listaCS, "xxx"));
		assertEquals(0, senha.validarUsuarioCliente(listaCS, "cliente"));
		assertEquals(1, senha.validarUsuarioCliente(listaCS2, "yyy"));
	}

}
