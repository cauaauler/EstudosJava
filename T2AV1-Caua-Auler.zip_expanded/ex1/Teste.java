package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		//oque o usuario deseja fazer
		boolean x = true;
		while (x) {
			
			Fabricante fabricante = new Fabricante();
			Produto produto = new Produto();
			
			System.out.println("(1)Adicionar novo produto"
					+ "\n(2)Remover um produto"
					+ "\n(3)Remover todos os produtos"
					+ "\n(4)Mostrar a lista de produtos "
					+ "\n(5)Mostrar um produto em particular "
					+ "\n(0)Sair do programa");
			int acao = Integer.parseInt(leitor.nextLine());
			if(acao == 0) {
				x = false;
			}
			if (acao == 1) {
				
				//fabricante
				System.out.println("Nome do frabricante: ");
				fabricante.setNome(leitor.nextLine());
				System.out.println("Endereço do frabricante: ");
				fabricante.setEndereco(leitor.nextLine());
				
				//produto
				System.out.println("Nome do produto: ");
				produto.setNome(leitor.nextLine());
				System.out.println("Código do produto: ");
				produto.setCodigo(Integer.parseInt(leitor.nextLine()));
				System.out.println("Valor do produto: ");
				produto.setValor(Double.parseDouble(leitor.nextLine()));
				produto.setFabricante(fabricante);
				
				produtos.add(produto);
				
			}
			//remover usando codigo do produto
			else if(acao == 2) {
				boolean produtoEncontrado = false;
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println("Código do produto que deseja remover: ");
					int codigoRemover = Integer.parseInt(leitor.nextLine());
					String produtoBkp = produtos.get(i).getNome();
					
					if(produtos.get(i).getCodigo() == codigoRemover) {
						produtos.remove(i);
						System.out.println("Você removeu " + produtoBkp + "\n");
						produtoEncontrado = true;
						
					}
				}if(produtoEncontrado == false) {
					System.out.println("O código que você procura não foi encontrado!");
				}
						
				
			}
			//remover lista
			else if(acao == 3) {
				produtos.clear();
				System.out.println("Lista apagada !" + "\n");
			}
		
			//mostrar a lista
			else if(acao == 4) {
				for (int j = 0; j < produtos.size(); j++) {
					System.out.println("\nProduto " + (j+1));
					
					System.out.println("Nome do Fabricante: " + produtos.get(j).getFabricante().getNome());
					System.out.println("Endereço do Fabricante: " + produtos.get(j).getFabricante().getEndereco());
					System.out.println("Código do produto: " +produtos.get(j).getCodigo());
					System.out.println("Nome do produto: " +produtos.get(j).getNome());
					System.out.println("Valor do produto: R$" +produtos.get(j).getValor());
					System.out.println("\n");
				}		
			}
			//mostrar um produto
			else if(acao == 5)
			{
				System.out.println("Código do produto que deseja ver: ");
				int codigoVer = Integer.parseInt(leitor.nextLine());
			    boolean produtoEncontrado = false;
				for (int k = 0; k < produtos.size(); k++) {
					if(produtos.get(k).getCodigo() == codigoVer) {
						System.out.println("\n Nome do Fabricante: " + produtos.get(k).getFabricante().getNome());
						System.out.println("Endereço do Fabricante: " + produtos.get(k).getFabricante().getEndereco());
						System.out.println("Código do produto: " +produtos.get(k).getCodigo());
						System.out.println("Nome do produto: " +produtos.get(k).getNome());
						System.out.println("Valor do produto: R$" +produtos.get(k).getValor() + "\n");	
						produtoEncontrado = true;
						
					}if(produtoEncontrado == false) {
						System.out.println("O código que você procura não foi encontrado!");
					}
						
				}
				
			}
			
			
		}
	}
}
