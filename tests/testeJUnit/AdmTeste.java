package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Adm;
import com.netAssist.Endereco;
import com.netAssist.Funcionario;

public class AdmTeste {
	ArrayList<Funcionario> listaF = new ArrayList();
	Adm admin = new Adm();
	Adm adminT = new Adm();
	Adm adm = new Adm();
	Adm admin3 = new Adm();
	Endereco ender = new Endereco();
	@Before
	public void setUp() throws Exception {
		admin.setEnd(ender);
		admin.setNome("NOME TESTE");
		admin.setCpf("32145698709");
		admin.setCidade("CIDADE TESTE");
		admin.setEstado("AL");
		admin.setCargo("Administrador");
		admin.setUsuario("123");
		admin.setSenha("123");
		adminT.setCpf("45632178909");
		admin3.setCpf("98712365409");
		listaF.add(admin);
		listaF.add(adminT);
		listaF.add(admin3);
	}

	@Test
	public void testAdm() {
		Adm admin1 = new Adm();
	}

	@Test
	public void testAdmConstrutor() {
		Adm admin2 = new Adm("321", "321", "Tecnico", "NOME TESTE", "98745632101", ender);
	}

	@Test
	public void testCadastrarFuncionario() {
		assertEquals(1, admin.cadastrarFuncionario(listaF, "1", "NOME TESTE 2", "12345678909", "CIDADELA", "ARUNA", "21", "21"));
		assertEquals(1, admin.cadastrarFuncionario(listaF, "2", "NOME TESTE 3", "09847845699", "CIDADELA2", "ARUNA2", "12", "12"));
	}
	@Test
	public void testAlterarFuncionario() {
		assertEquals(1, admin.alterarFuncionario(listaF, 0, "1", "000", "000"));
		assertEquals(1, admin.alterarFuncionario(listaF, 0, "2", "000", "000"));
	}

	@Test
	public void testDeletarFuncionario() {
		assertEquals(1, adm.deletarFuncionario(listaF, 1, "45632178909"));
	}

}
