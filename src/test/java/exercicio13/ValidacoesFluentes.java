package exercicio13;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class ValidacoesFluentes {

	@Test
	public void validacaoEqualTo() {
		String produto = "TV 40 polegadas";
		assertThat(produto, equalTo("TV 40 polegadas"));
	}
	
	@Test
	public void validacaoIs() {
		int codigo = 5;
		assertThat(codigo, is(5));
	}
	
	@Test
	public void validacaoAnyOf() {
		String resultadoObtido = "A cor selecionada voi vermelha";
		assertThat(resultadoObtido, anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@Test
	public void validacaohasItems() {
		List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("iPhone 8 Plus 64GB");
		listaProdutos.add("Adaptador USB C VGA");
		listaProdutos.add("Apple TV 4 geração");
		
		assertThat(listaProdutos, hasItem("iPhone 8 Plus 64GB"));
	}
	
}
