
public class Pares {
	int[] n;
	int x;
	int count = 0;

	public Pares() {

	}

	public Pares(int[] n, int x) {
		this.n = n;
		this.x = x;

	}
	
	public int fazerDiferencas() {
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
