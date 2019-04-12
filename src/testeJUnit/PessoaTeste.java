package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Adm;
import com.netAssist.Endereco;
import com.netAssist.Funcionario;

public class PessoaTeste {
	Funcionario f = new Funcionario();
	Endereco end1 = new Endereco();
	@Before
	public void setUp() throws Exception {
		Funcionario f = new Funcionario();
	}

	@Test
	public void testPessoaStringStringEndereco() {
		Funcionario f1 = new Funcionario("Alexandre", "123", "1", "Alexandre Barbosa", "89442347504", end1);
	}
	
	@Test
	public void testGetEnd() {
		f.setEnd(end1);
		assertEquals(end1, f.getEnd());
	}
	
	@Test
	public void testGetCidade() {
		Endereco end = new Endereco();
		Adm admin = new Adm();
		admin.setEnd(end);
		admin.setCidade("ARAPIRACA");
		assertEquals("ARAPIRACA", admin.getCidade());
	}

	@Test
	public void testGetEstado() {
		Endereco end = new Endereco();
		Adm admin = new Adm();
		admin.setEnd(end);
		admin.setEstado("AL");
		assertEquals("AL", admin.getEstado());
	}

	@Test
	public void testGetNome() {
		f.setNome("Maria");
		assertEquals("Maria", f.getNome());
	}

	@Test
	public void testGetCpf() {
		f.setCpf("89745698703");
		assertEquals("89745698703", f.getCpf());
	}

}
