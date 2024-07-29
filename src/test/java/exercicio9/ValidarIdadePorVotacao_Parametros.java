package exercicio9;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros {
	
	@Parameter(0) public String nome;
	@Parameter(1) public int anoDeNascimento;
	@Parameter(2) public String resultado;
	
	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado,  Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<Object []> data(){
		return Arrays.asList(new Object[][] {
			{"Maria", 2009, "Maria voce nao pode votar"},
			{"Rodrigo", 2008, "Rodrigo seu voto e facultativo"},
			{"Joao", 2007, "Joao seu voto e facultativo"},
			{"Carla", 2006, "Carla seu voto e obrigatorio"},
			{"Jose", 1999, "Jose seu voto e obrigatorio"},
			{"Ana", 1954, "Ana seu voto e obrigatorio"},
			{"Pedro", 1953, "Pedro seu voto e facultativo"},
		});
	}
	
}
