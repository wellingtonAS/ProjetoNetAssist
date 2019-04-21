package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Cliente;
import com.netAssist.Cpf;
import com.netAssist.Funcionario;

public class CpfTeste {
	ArrayList<Funcionario> listaFC = new ArrayList<Funcionario>();
	ArrayList<Funcionario> listaFC2 = new ArrayList<Funcionario>();
	ArrayList<Cliente> listaC1 = new ArrayList<Cliente>();
	ArrayList<Cliente> listaC2 = new ArrayList<Cliente>();
	Cpf cpf = new Cpf();
	Cliente c = new Cliente();
	Funcionario f1 = new Funcionario();

	@Before
	public void setUp() throws Exception {
		f1.setCpf("12345678909");
		listaFC.add(f1);
		c.setCpf("12345678909");
		listaC1.add(c);
	}

	@Test
	public void testValidarCpf() {
		assertEquals(1, cpf.validarCpf("12345678909"));
	}

	@Test
	public void testVerificarCpfIndex1() {
		assertEquals(0, cpf.verificarCpfIndex(listaFC, f1.getCpf()));
	}
	
	@Test
	public void testVerificarCpfIndex2() {
		assertEquals(0, cpf.verificarCpfIndex(listaFC2, f1.getCpf()));
	}

	@Test
	public void testVerificarCpfIndexCliente1() {
		assertEquals(0, cpf.verificarCpfIndexCliente(listaC1, c.getCpf()));
	}
	
	@Test
	public void testVerificarCpfIndexCliente2() {
		assertEquals(-1, cpf.verificarCpfIndexCliente(listaC2, c.getCpf()));
	}
	
	@Test
	public void testverificarExisteCpf(){
		assertEquals(0, cpf.verificarExisteCpf(listaFC, "12345678909"));
	}

}
