import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Teste {

	@Test
	public void test() {
		Mediana lista1 = new Mediana(new int[]{9, 2, 1, 4, 6});
		System.out.println(lista1.encontrarMediana());
		assertEquals(lista1.encontrarMediana(),4);
	}

}
