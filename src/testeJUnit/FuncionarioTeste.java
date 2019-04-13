package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Funcionario;

public class FuncionarioTeste {
	ArrayList<Funcionario> listaF = new ArrayList();
	Funcionario fAux = new Funcionario();
	Funcionario f1 = new Funcionario();
	Funcionario f2 = new Funcionario();
	@Before
	public void setUp() throws Exception {
		fAux.setUsuario("adm");
		fAux.setSenha("adm");
		listaF.add(fAux);
		f1.setCargo("1");
		f1.setUsuario("adm");
		f1.setSenha("adm");
		f2.setUsuario("admin");
	}

	@Test
	public void testEfetuarLoginAutenticando() {
		assertEquals(2, fAux.efetuarLogin(f1, listaF)); //Caso em que Usuario e Senha est�o corretos	
	}
	@Test
	public void testEfetuarLoginErroNaoContinuar() {
		assertEquals(0, f2.efetuarLogin(f2, listaF)); //Caso em que Usuario e/ou Senha est�o errados, mas que se deseja tentar novamente		
	}
	@Test
	public void testEfetuarLoginErroContinuar() {
		assertEquals(1, f2.efetuarLogin(f2, listaF)); //Caso em que Usuario e/ou Senha est�o errados, mas que NAO se deseja tentar novamente
		
	}

}
