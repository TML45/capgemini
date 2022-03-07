
public class Encriptar {
	String sentence;

	public Encriptar() {

	}

	public Encriptar(String sentence) {
		this.sentence = sentence;
	}

	public String encriptando() {
		return sentence.replaceAll("\\s+", "");
	}

}
