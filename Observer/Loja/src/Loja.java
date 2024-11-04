/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */


import java.util.ArrayList;
import java.util.List;

public class Loja implements Sujeito {
	private List<Observador> observers = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    // aiciona um produto à loja e notifica usuários
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        notifyObservers("Novo produto adicionado: " + produto.getNome());
    }

    // alteraa o preço de um produto na loja e notifica usuários
    public void alterarPreco(String nomeProduto, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                produto.setPreco(novoPreco);
                notifyObservers("Preço do produto " + produto.getNome() + " alterado para " + novoPreco);
                return;
            }
        }
        // erro
        System.out.println("Produto não encontrado na loja.");
    }

    // funções para adicionar, remover e notificar observers
    public void registerObserver(Observador observer) {
        observers.add(observer);
    }

    public void removeObserver(Observador observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observador observer : observers) {
            observer.update(message); // chama o update de cada observador
        }
    }
}