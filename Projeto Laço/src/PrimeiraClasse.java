import java.util.Scanner; 

public class PrimeiraClasse {
	
	public static void main (String[] args) {
	
	while (true){
		System.out.println("Informe a calculadora");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		for(int i=0; i<=10; i++){
			
			System.out.println(numero + " * "+ i + " = ");
			System.out.println(numero * 1);
		}
		
		break;
	}

}
