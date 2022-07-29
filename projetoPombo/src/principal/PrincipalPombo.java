package principal;

import java.util.ArrayList;
import java.util.Iterator;

import entidade.Administrador;
import entidade.Pruu;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Pruu> pruusFeed = new ArrayList();
		
		Usuario admin = new Administrador("AdminUser","admin@admin","123456789");
		
		Usuario userJoao = new Usuario("Joazinho", "@joazinho", "123");
		Pruu pruuJoao1 = new Pruu("oi pessoal", userJoao);
		Pruu pruuJoao2 = new Pruu("to aqui enchendo o saco de novo!!!!!", userJoao);
		pruusFeed.add(pruuJoao1);
		pruusFeed.add(pruuJoao2);
		ArrayList<Pruu> pruusJoao = new ArrayList();
		userJoao.setPruus(pruusJoao);
		pruusJoao.add(pruuJoao1);
		pruusJoao.add(pruuJoao2);
		
		Usuario userMaria = new Usuario("Mariazinha", "maria@maria", "987654321-00");
		Pruu pruuMaria1 = new Pruu(" ", userMaria);
		Pruu pruuMaria2 = new Pruu("Agora foi gente!!!!! Boas Noites!!!!", userMaria);
		pruusFeed.add(pruuMaria1);
		pruusFeed.add(pruuMaria2);
		ArrayList<Pruu> pruusMaria = new ArrayList();
		userMaria.setPruus(pruusMaria);
		pruusMaria.add(pruuMaria1);
		pruusMaria.add(pruuMaria2);
		
		userMaria.darLike(pruuJoao2);
		userMaria.darLike(pruuJoao2);
		
		userJoao.darLike(pruuMaria2);
		
		((Administrador) admin).bloquearPruu(pruuJoao1);
		
		
		System.out.println("****    CONSULTA FEED - TODOS OS PRUUS    ****");
		for (int i = 0; i < pruusFeed.size(); i++) {
			System.out.println(pruusFeed.get(i));
			}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("******       CONSULTA PRUUS JOAO        ******");
		
		for (int i = 0; i < pruusJoao.size(); i++) {
			System.out.println(pruusJoao.get(i));
			}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("******       CONSULTA PRUUS MARIA       ******");
		
		for (int i = 0; i < pruusMaria.size(); i++) {
			System.out.println(pruusMaria.get(i));
		
			}
		
		
		
		
		
	}
}