
public class Pares {
	int[] n;
	int x;

	public Pares() {

	}

	public Pares(int[] n, int x) {
		this.n = n;
		this.x = x;

	}
	
	public int fazerDiferencas() {
		int count = 0;
		for(int i = 0; i < n.length; i++) {
			for( int j = i + 1; j < n.length; j++) {
				if(n[i]-n[j] == x || n[j]-n[i] == x) {
					count++;
				}				
			}
		}
		return count;
	}
	
	public int fazerDiferencas2() {
		int count = 0;
		for(int i = 0; i < n.length; i++) {
			for( int j = i + 1; j < n.length; j++) {
				if(Math.abs(n[i]-n[j]) == x) {
					count++;
				}				
			}
		}
		return count;
	}

}
