package TesteNumerosPrimos;

public class funcaoNumeroPrimo {
	
	public static int idPrimos(int num) {
			
		if(num==0) {
			System.out.println("Saindo.....");	 	
		}else {
			int numero = num;
			int cont = 0;
			
			for(int i = 2; i<=numero/2; i++) {
				if(numero%i==0) {
					cont++;
				}
			}
				
			if(cont==0) {
				System.out.println("Primo");
			}else {
				System.out.println("Não é primo");
			}
		}
		return num;	
	}
}
	
	

