package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/** Representa uma operação com argumento de qualquer tipo e não retorna resultado.
Utilizada para realizar ações nos elementos do Stream sem modificar ou retornar um valor
**/

public class ConsumerExample {
	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		numeros.forEach(n -> {;
			if(n % 2 == 0) {
				System.out.println(n);
			}
		});
	}
}
