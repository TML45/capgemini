import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Encriptar sentence1 = new Encriptar("tenha um bom dia");
		System.out.println(sentence1.encriptando());
		assertEquals(sentence1.encriptando(), 4);
	}

}
