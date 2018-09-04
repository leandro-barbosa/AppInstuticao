package negocio;

public class Graduacao extends Curso {

	private boolean tecnologo;
	
	public Graduacao(String nome, int cargaHoraria, float valor, boolean tecnologo) {
		super(nome, cargaHoraria, valor);
		this.tecnologo = tecnologo;
	}

	public void show() {
		System.out.println("#graduacao");
		
		super.show();
		
		System.out.printf(
				"Tecn�logo: %s\n\n",
			  tecnologo ? "sim" : "n�o"
			);
	}

	public boolean isTecnologo() {
		return tecnologo;
	}
	public void setTecnologo(boolean tecnologo) {
		this.tecnologo = tecnologo;
	}
}