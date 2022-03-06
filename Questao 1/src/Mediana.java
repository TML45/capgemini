
public class Mediana {
	int[] lista;
	int auxVar;
	
	//Construtor 1: n�o possui par�metros
	//Com esse construtor o objeto � instanciado, mas n�o inicializado
	public Mediana(){
		
	}
	
	//Construtor 2: possui par�metros
	//Com esse construtor o objeto � instanciado e inicializado
	public Mediana(int[] lista){
		this.lista = lista;		
	}
	
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

}
