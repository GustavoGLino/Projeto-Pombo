package entidade;

public class Administrador extends Usuario {

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String email, String cpf) {
		super(nome, email, cpf);
		// TODO Auto-generated constructor stub
	}

	
	public void bloquearPruu(Pruu pruuParaBloquear) {
		pruuParaBloquear.setBloqueado(true);
	}
	
	public void desbloquearPruu (Pruu pruuParaDesbloquear) {
		pruuParaDesbloquear.setBloqueado(false);
	}
}