package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Funcionario;

public class FuncionarioTeste {
	ArrayList<Funcionario> listaF = new ArrayList();
	Funcionario f1 = new Funcionario();
	Funcionario f2 = new Funcionario();
	
	@Before
	public void setUp() throws Exception {
		f1.setUsuario("adm");
		f1.setSenha("adm");
		listaF.add(f1);
		f2.setUsuario("adm");
		f2.setSenha("adm");
	}

	@Test
	public void testEfetuarLogin() {
		assertEquals(2, f1.efetuarLogin(f2, listaF)); //Caso em que Usuario e Senha estão corretos
		f2.setUsuario("adm");
		f2.setSenha("admin");
		assertEquals(0, f2.efetuarLogin(f2, listaF)); //Caso em que Usuario e/ou Senha estão errados, mas que se deseja tentar novamente
		assertEquals(1, f2.efetuarLogin(f2, listaF)); //Caso em que Usuario e/ou Senha estão errados, mas que NAO se deseja tentar novamente
		
	}

	@Test
	public void testListarFuncionario() {
		//assertArrayEquals(ArrayList<Funcionario> lista, f2.listarFuncionario(listaF));
	}

	@Test
	public void testListarCliente() {
		//fail("Not yet implemented");
	}

}
