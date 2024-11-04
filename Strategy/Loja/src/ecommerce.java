/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */


public class ecommerce {
    public static void main(String[] args) {
        // instanciando uma loja
        Loja loja = new Loja();

        // instanciando usuários
        Usuario usuario1 = new Usuario("Usuario1");
        Usuario usuario2 = new Usuario("Usuario2");

        // registrando usuários como observadores da loja
        loja.registerObserver(usuario1);
        loja.registerObserver(usuario2);

        // adicionando produtos à loja, que vai ser notificado aos usuários
        loja.adicionarProduto(new Produto("Produto1", 100));
        loja.adicionarProduto(new Produto("Produto2", 200));

        // alterando o preço de um produto na loja, que vai ser notificado aos usuários
        loja.alterarPreco("Produto1", 150);
    }
}
