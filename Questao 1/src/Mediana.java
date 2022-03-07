import java.util.Arrays;

public class Mediana {
	int[] lista;
	int auxVar;
	
	//Construtor 1: não possui parâmetros
	//Com esse construtor o objeto é instanciado, mas não inicializado
	public Mediana(){
		
	}
	
	//Construtor 2: possui parâmetros
	//Com esse construtor o objeto é instanciado e inicializado
	public Mediana(int[] lista){
		this.lista = lista;		
	}
	
	// Uma forma de encontrar a mediana utilizando for loops
	public int encontrarMediana() {
		for(int i = 0; i < lista.length; i++) {
			for( int j = i + 1; j < lista.length; j++) {
				if(lista[i]>lista[j]) {
					auxVar = lista[i];    
					lista[i] = lista[j];    
					lista[j] = auxVar;
				}
			}
		}
		return lista[(lista.length-1)/2];
	}
	
	// Outra forma de encontrar a mediana utilizando o method sort 
	public int encontrarMediana2() {
		Arrays.sort(lista);
		return lista[(lista.length-1)/2];		
	}

}
