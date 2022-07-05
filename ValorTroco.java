import java.util.Scanner;

public class ValorTroco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("informe o valor do produto");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade dos produtos");
		Double valorQuantidade = scanner.nextDouble();
		
		Double resultado = valorQuantidade - valorProduto;
		
		System.out.println("valor da brincadeira" + resultado);
		
		scanner.close();
		
	}

}
