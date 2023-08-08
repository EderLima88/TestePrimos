package TesteNumerosPrimos;

import java.util.Scanner;

public class mainNumerosPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número para verificar e 0 para sair: ");
		
		int inputN;
				
		do{
			inputN = sc.nextInt();
			funcaoNumeroPrimo.idPrimos(inputN);
		}while(inputN!=0);

	}

}
