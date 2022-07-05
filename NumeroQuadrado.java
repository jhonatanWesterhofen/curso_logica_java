import java.util.Scanner;

public class NumeroQuadrado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um número para calcular");
		Integer valorResultado = scanner.nextInt();
		
		Integer resultado = valorResultado * valorResultado;
		
		System.out.println("valor dessa casseta" +resultado);
		
		
		
	}

}
