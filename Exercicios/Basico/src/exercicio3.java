import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A,B,C,D,Diferença;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		Diferença = (A*B-C*D);
		System.out.print("Diferença = " + Diferença);
		sc.close();
	}

}
