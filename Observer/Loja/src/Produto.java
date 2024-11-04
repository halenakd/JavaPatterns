/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */


public class Produto {
	private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
