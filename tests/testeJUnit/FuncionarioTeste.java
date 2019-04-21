package testeJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.netAssist.Endereco;
import com.netAssist.Funcionario;

public class FuncionarioTeste {
	ArrayList<Funcionario> listaFunc = new ArrayList();
	Funcionario fAux = new Funcionario();
	Funcionario f1 = new Funcionario();
	Funcionario f2 = new Funcionario();
	@Before
	public void setUp() throws Exception {
		Endereco endT = new Endereco();
		Funcionario fConst = new Funcionario("111", "222", "2", "Jose", "08975612367", endT);
		fAux.setUsuario("adm");
		fAux.setSenha("adm");
		listaFunc.add(fAux);
		f1.setCargo("1");
		f1.setUsuario("adm");
		f1.setSenha("adm");
		f2.setUsuario("admin");
		fConst.getCargo();
	}

	@Test
	public void testEfetuarLoginAutenticando() {
		assertEquals(2, fAux.efetuarLogin(fAux.getUsuario(), fAux.getSenha(), listaFunc)); //Caso em que Usuario e Senha estão corretos	
	}
}

