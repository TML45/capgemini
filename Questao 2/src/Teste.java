import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Teste {

	@Test
	public void test() {
		Pares n1 = new Pares(new int[] { 1, 5, 3, 4, 2 }, 2);
		System.out.println(n1.fazerDiferencas());
		assertEquals(n1.fazerDiferencas(),3);
	}
	
	@Test
	public void test2() {
		Pares n2 = new Pares(new int[] { 1, 5, 3, 4, 2 }, 2);
		System.out.println(n2.fazerDiferencas2());
		assertEquals(n2.fazerDiferencas2(),3);
	}

}
