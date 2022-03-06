
public class Principal {
	
	public static void main(String[] args) {
		
		Mediana lista1 = new Mediana(new int[]{9, 2, 1, 4, 6});
		System.out.println(lista1.encontrarMediana());
		
		Mediana lista2 = new Mediana();
		lista2.lista = new int[] {9, 2, 1, 4, 6};
		System.out.println(lista2.encontrarMediana());
		
		
	}

}
