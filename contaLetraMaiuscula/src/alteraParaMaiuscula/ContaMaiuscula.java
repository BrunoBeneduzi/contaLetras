package alteraParaMaiuscula;

public class ContaMaiuscula {
	String palavra;
	String maiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public ContaMaiuscula(String palavra) {
		this.palavra = palavra;
	}

	public void verificaLetraMaiuscula() {//vai identificar se existe letras maiusculas
		int ocorrencia = 0;

		for(int i = 0; i < this.maiuscula.length(); i++) {
			if(this.palavra.indexOf(this.maiuscula.charAt(i)) != -1) {
				if(ocorrencia == 0) {//essa ocorrencia serve para imprimir a string 1 vez só e colocar os resultados logo em seguida
					ocorrencia = 1;
					System.out.print("Estas são as letras maiusculas que existem na palavra ou frase  -> ");
				}
				System.out.print(this.maiuscula.charAt(i) + " ");
			}
		}
		if(ocorrencia == 0) {//caso a ocorrencia seja 0, vai ser impresso uma das duas strings
			if(this.palavra.indexOf(' ') !=-1) {

				System.out.println("Não existe letras Maiusculas na frase especificada");
			}
			else {System.out.println("Não existe letras Maiusculas na palavra especificada");

			}
		}
	}
	
	public void verificaLetraMinuscula() {//vai identificar se existe letras minuscula 
		int ocorrencia = 0;

		for(int i = 0; i < this.maiuscula.length(); i++) {
			if(this.palavra.indexOf(this.maiuscula.toLowerCase().charAt(i)) != -1) {
				if(ocorrencia == 0) {//essa ocorrencia serve para imprimir a string 1 vez só e colocar os resultados logo em seguida
					ocorrencia = 1;
					System.out.print("Estas são as letras Minusculas que existem na palavra ou frase  -> ");
				}
				System.out.print(this.maiuscula.toLowerCase().charAt(i) + " ");
			}
		}
		if(ocorrencia == 0) {//caso a ocorrencia seja 0, vai ser impresso uma das duas strings
			if(this.palavra.indexOf(' ') !=-1) {

				System.out.println("Não existe letras Minusculas na frase especificada");
			}
			else {System.out.println("Não existe letras Minusculas na palavra especificada");

			}
		}
	}

	
	public void separa() {
		System.out.println();
	}



}