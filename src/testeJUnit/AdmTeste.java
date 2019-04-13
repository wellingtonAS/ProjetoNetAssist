package testeJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Adm;
import com.netAssist.Endereco;

public class AdmTeste {
	Adm admin = new Adm();
	Endereco ender = new Endereco();
	@Before
	public void setUp() throws Exception {
		admin.setEnd(ender);
	}

	@Test
	public void testAdm() {
		Adm admin = new Adm();
	}

	@Test
	public void testAdmStringStringStringStringStringEndereco() {
		Adm adm1 = new Adm("admin", "admin", "2", "Teste", "32136537632", ender);
	}

	@Test
	public void testCadastrarFuncionario() {
		//Não conseguimos manipular através dos métodos conhecidos as funções sem retornos!
	}

	@Test
	public void testAlterarFuncionario() {
		//Não conseguimos manipular através dos métodos conhecidos as funções sem retornos!
	}

	@Test
	public void testDeletarFuncionario() {
		//Não conseguimos manipular através dos métodos conhecidos as funções sem retornos!
	}

}
