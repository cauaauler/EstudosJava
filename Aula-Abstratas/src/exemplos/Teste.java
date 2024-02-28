package exemplos;

import java.util.Iterator;

public class Teste {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Totó");
		Gato g1 = new Gato("Tinhoso");
		
		Animal[] a1 = new Animal[2];
		a1[0] = new Cachorro("Totó");
		a1[1] = new Gato("Tinhoso");
		
		for (Animal a : a1) {
			a.emitirSom();
		}
		
		for (int i = 0; i < a1.length; i++) {
			a1[i].emitirSom();
		}
		
	}
	

}
