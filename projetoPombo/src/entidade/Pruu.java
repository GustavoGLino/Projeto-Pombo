package entidade;

import java.util.Date;

public class Pruu {
	
	private static int id;
	private int idPruu;
	private String texto;
	private Date dataCriacao;
	private int quantidadeDeLike;
	private boolean bloqueado;
	private Usuario usuario;
	private boolean textoValido = true;
	
	public Pruu(String texto, Usuario usuario) {
		super();
		validarTexto(texto);
		if (textoValido) {
			this.texto = texto;
			this.usuario = usuario;
			id++;
			this.idPruu = id;
			this.dataCriacao = new Date();
							
		} else {
			this.texto = "Texto fora de parametros, pruu descartado";
			this.usuario = usuario;
			this.dataCriacao = new Date();
		}
		
	}
	
	public boolean validarTexto (String texto) {
		if((texto.length() > 300) || (texto.trim().length() < 1)) {
			textoValido = false;
		}
		return textoValido;
	}
	
	public void somarLike () {
		this.quantidadeDeLike++;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Pruu.id = id;
	}

	public int getIdPruu() {
		return idPruu;
	}

	public void setIdPruu(int idPruu) {
		this.idPruu = idPruu;
	}

	public String getTexto() {
		return texto;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public int getQuantidadeDeLike() {
		return quantidadeDeLike;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isTextoValido() {
		return textoValido;
	}

	public void setTextoValido(boolean textoValido) {
		this.textoValido = textoValido;
	}

	@Override
	public String toString() {
		return "ID: " + idPruu + "\nPruu: " + texto + "\nData de postagem: " + dataCriacao +
				"\n" + quantidadeDeLike + " curtidas" +  "\nUsuario" + usuario;
	}

	
	
	
	
}


