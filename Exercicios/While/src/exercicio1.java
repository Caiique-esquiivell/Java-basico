import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int senha = scanner.nextInt();
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scanner.nextInt();
		}
		System.out.print("Acesso Permitido");

		scanner.close();
	}

}
