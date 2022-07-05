import java.util.Scanner;

public class alteraVariavel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a forma de pagamento: [1 p/ avista 2 p/ a prazo]");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAvista = tipoPagamento.equals(1);
		
		Double juro = 0.0;
		
		if (pagamentoAvista) {
			System.out.println("O valor do seu produto é: " + valorProduto);
		}else {
			juro = 5.0;
		}
		
		Double acrescimo = valorProduto * juro / 100;
		Double valorTotal = valorProduto + acrescimo;
		
		System.out.println(" O valor total do produto com os acrescimos e : " + valorTotal);
		
	}

}
