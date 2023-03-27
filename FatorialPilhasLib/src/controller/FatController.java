package controller;
import br.edu.fateczl.pilhaint.*;

public class FatController {

	public FatController() {
		super();
	}
	
	public int fatorial(int fat) throws Exception {
		Pilha p = new Pilha();

		/*if (fat != 1) {
			p.push(fat);
			fat--;
		} else {
			size = p.size();
			for (int i = 0; i < size; i ++) {
				v1 = p.pop();
				resultado = resultado * v1;
			}	
		}*/
		
		//return resultado;
		
		do {
			p.push(fat);
			fat--;
		} while (fat != 1);
		
		do {
			fat = fat * p.pop();
		} while (p.isEmpty() == false);
		
		return fat;
		
	}
}
