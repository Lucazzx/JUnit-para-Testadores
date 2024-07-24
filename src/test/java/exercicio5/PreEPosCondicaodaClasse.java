package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreEPosCondicaodaClasse {
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("Executou a pr� condi��o da classe");
	}
	
	@Before
	public void setup() {
		System.out.println("Executou a pr� condi��o");
	}
	
	@Test
	public void teste1() {
		System.out.println("Executou o teste 1");
	}
	
	@Test
	public void teste2() {
		System.out.println("Executou o teste 2");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("Executou a p�s condi��o da classe");
	}
	
	@After
	public void tearDownClass() {
		System.out.println("Executou a p�s condi��o");
	}	
}
