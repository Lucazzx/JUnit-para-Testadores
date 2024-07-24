package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio1.PrimeiroTeste;
import exercicio2.ValidacaoTrueFalse;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicaoDaClasse;

@RunWith(Suite.class)
@SuiteClasses({
	PrimeiroTeste.class, 
	ValidacaoTrueFalse.class, 
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class, 
	PreEPosCondicaoDaClasse.class
})

public class SuiteDeTeste {

}
