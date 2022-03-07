import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Teste {

	@Test
	public void test() {
		Mediana lista1 = new Mediana(new int[]{9, 2, 1, 4, 6});
		System.out.println(lista1.encontrarMediana());
		assertEquals(lista1.encontrarMediana(),4);
	}
	
	@Test
	public void test2() {
		Mediana lista2 = new Mediana();
		lista2.lista = new int[] {9, 2, 1, 4, 6};
		System.out.println(lista2.encontrarMediana());
		assertEquals(lista2.encontrarMediana(),4);
	}
	
	@Test
	public void test3() {
		Mediana lista3 = new Mediana(new int[]{9, 2, 1, 4, 6, 0, -2});
		System.out.println(lista3.encontrarMediana2());
		assertEquals(lista3.encontrarMediana(),2);
	}

}
