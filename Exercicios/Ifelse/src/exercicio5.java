import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo =sc.nextInt();
		int quant = sc.nextInt();
		double valor;
		
		if(codigo == 1 ) {
			valor = 4.00 * quant;
			System.out.printf("Total: R$ %.2f%n",valor);
		}
		else if(codigo == 2) {
			valor = 4.50 * quant;
			System.out.printf("Total: R$ %.2f%n",valor);
		}
		else if(codigo == 3) {
			valor = 5.00 * quant;
			System.out.printf("Total: R$ %.2f%n",valor);
		}
		else if(codigo == 4) {
			valor = 2.00 * quant;
			System.out.printf("Total: R$ %.2f%n",valor);
		}
		else if(codigo == 5) {
			valor = 1.50 * quant;
			System.out.printf("Total: R$ %.2f%n",valor);
		}
		else {
			System.out.print("Digite outro codigo de 1 ate 5");
		}
		
		
		sc.close();
	}

}
