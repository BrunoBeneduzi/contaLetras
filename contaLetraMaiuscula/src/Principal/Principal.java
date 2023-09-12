package Principal;
import alteraParaMaiuscula.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaMaiuscula nome = null;
		int escolha = 0;

		System.out.print("Bem vindo ao programa que identifica quais foram as letras minusculas ou maiusculas digitadas\n"+"1- Verificar maiusculas\n"
				+"2- Verificar minusculas\n"+"3- Verificar os dois\n"+"-> ");


		try {
			escolha = sc.nextInt();
		}catch(Exception e) {
			System.out.println("..............Digite um codigo valido....................");
		}
		
		sc.nextLine();
		System.out.print("Digite uma frase ou palavra -> ");
		nome = new ContaMaiuscula(sc.nextLine());
		switch(escolha) {
		case 1:
			nome.verificaLetraMaiuscula();
			break;
		case 2:
			nome.verificaLetraMinuscula();
			break;
		case 3:
			nome.verificaLetraMaiuscula();
			System.out.println();
			nome.verificaLetraMinuscula();
			break;
		}
		
	











	}

}
