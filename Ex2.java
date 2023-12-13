package estrutura.dados;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Stack<String> pilha = new Stack<>();

		while (true) {

			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");

			int opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				String nomeLivro = ler.next();
				pilha.push(nomeLivro);
				break;
			case 2:
				System.out.println("Lista de livros na pilha:");
				for (String livro : pilha) {
					System.out.println(livro);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					String livroRemovido = pilha.pop();
					System.out.println("Livro removido: " + livroRemovido);
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
