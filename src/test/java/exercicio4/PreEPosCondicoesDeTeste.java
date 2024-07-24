package exercicio4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEPosCondicoesDeTeste {

	@Before
	public void setup() {
		System.out.println("Executou a pré condição");
	}
	
	@Test
	public void teste1() {
		System.out.println("Executou o teste 1");
	}
	
	@Test
	public void teste2() {
		System.out.println("Executou o teste 2");
	}
	
	@After
	public void tearDown() {
		System.out.println("Executou a pós condição");
	}	
}
