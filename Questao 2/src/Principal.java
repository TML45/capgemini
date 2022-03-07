
public class Principal {

	public static void main(String[] args) {
		Pares n1 = new Pares(new int[]{1, 5, 3, 4, 2}, 2);
		System.out.println(n1.fazerDiferencas());
		
		Pares n2 = new Pares();
		n2.n = new int[] {1, 5, 3, 4, 2};
		n2.x = 2;
		System.out.println(n2.fazerDiferencas2());

	}

}
