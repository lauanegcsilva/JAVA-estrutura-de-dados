package estrutura.dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		while (true) {

			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");

			int opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente:\n");
				String nomeCliente = ler.next();
				fila.add(nomeCliente);
				break;
			case 2:
				System.out.println("\nLista de clientes na fila:\n");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (!fila.isEmpty()) {
					String clienteRetirado = fila.poll();
					System.out.println("O cliente " + clienteRetirado + " foi chamado!");
				} else {
					System.out.println("A fila está vazia!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				return;
			default:
				System.out.println("Opção inválida!");
			}

		}

	}
}
