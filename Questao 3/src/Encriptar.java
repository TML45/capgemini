
public class Encriptar {
	String sentence;

	public Encriptar() {

	}

	public Encriptar(String sentence) {
		this.sentence = sentence;
	}

	public String encriptando() {
		sentence = sentence.replaceAll("\\s+", "");
		int tamanho = sentence.length();
		int linha, coluna;
		int count = 0;
		int count2 = 0;
		coluna = (int) Math.ceil(Math.sqrt(tamanho));
		linha = coluna - 1;
		if (linha * coluna < sentence.length()) {
			coluna++;
			if (linha * coluna < sentence.length()) {
				linha++;
			}
		}
		char s[][] = new char[linha][coluna];
		char f[] = new char[linha * coluna + coluna - 1];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (count < tamanho) {
					s[i][j] = sentence.charAt(count);
					count++;
				}
			}
		}

		for (int i = 0; i < coluna; i++) {
			for (int j = 0; j < linha; j++) {
				f[count2] = s[j][i];
				count2++;
			}
		}
		String str = String.valueOf(f);
		return str;
	}

}
