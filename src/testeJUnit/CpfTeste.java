package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Cpf;
import com.netAssist.Funcionario;

public class CpfTeste {
	ArrayList<Funcionario> listaF = new ArrayList();
	ArrayList<Cliente> listaC = new ArrayList();
	Cpf cpf = new Cpf();
	Cliente c = new Cliente();
	Funcionario f1 = new Funcionario();

	@Before
	public void setUp() throws Exception {
		f1.setCpf("32165498709");
		listaF.add(f1);
		c.setCpf("32165498709");
		listaC.add(c);
	}

	@Test
	public void testValidarCpf() {
		assertEquals("32165498709", cpf.validarCpf());
	}

	@Test
	public void testVerificarCpfIndex() {
		assertEquals(0, cpf.verificarCpfIndex(listaF, f1.getCpf()));
	}

	@Test
	public void testVerificarCpfIndexCliente() {
		assertEquals(0, cpf.verificarCpfIndexCliente(listaC, c.getCpf()));
	}

}
