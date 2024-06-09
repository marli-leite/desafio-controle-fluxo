import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try {
			Scanner terminal = new Scanner(System.in);

			System.out.print("Por favor, digite o primeiro número ");
			int parametroUm = terminal.nextInt();

			System.out.print("Por favor, digite o segundo número ");
			int parametroDois = terminal.nextInt();

			if (parametroDois < parametroUm) {
				throw new ParametrosInvalidosExeption("");
			}

			for (int numero = parametroUm; numero < parametroDois; numero++) {
				System.out.println(numero);
			}
		} catch (ParametrosInvalidosExeption e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
	}
}

class ParametrosInvalidosExeption extends Exception {
	public  ParametrosInvalidosExeption(String texto) {
		
	}
}
