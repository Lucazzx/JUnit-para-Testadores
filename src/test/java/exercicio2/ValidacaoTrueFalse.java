package exercicio2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoTrueFalse {
	
	@Test
	public void validacaoTrueFalse() {
		
		boolean campoEstaPresente = true;
		assertTrue(campoEstaPresente);
		
	}
	
	@Test
	public void validacaoTrueFalse2() {
		
		boolean campoEstaPresente = true;
		assertFalse("campo não está presente", campoEstaPresente);
		
	}
	
}
