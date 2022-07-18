package principal;

import java.util.ArrayList;

import entidade.Pruu;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario joaozin = new Usuario("Joanzin", "joao@joao", "2345678910");
		
		Pruu novoPruu = new Pruu("Agora vaaaaaaaaaaaiiiii!!!!!", joaozin);
		joaozin.darLike(novoPruu);
		ArrayList <Pruu> pruusJoaozin = new ArrayList();
		joaozin.setPruus(pruusJoaozin);
		pruusJoaozin.add(novoPruu);
		
//		System.out.println(novoPruu.getIdPruu());
//		System.out.println(novoPruu.getTexto());
//		System.out.println(novoPruu.getDataCriacao());
//		System.out.println(novoPruu.getUsuario());
//		System.out.println(novoPruu.getQuantidadeDeLike());
//		System.out.println(pruusJoaozin);
		System.out.println(novoPruu);
		
	}

}
