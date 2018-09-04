package teste;

import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	public static void main(String[] args) {
		Especializacao especializacao = new Especializacao("ADS", 200, 1000, 2021);
		especializacao.show();
		
		
		
		Graduacao graduacao = new Graduacao("ADS", 400, 2000, true);
		graduacao.show();
	}
}
