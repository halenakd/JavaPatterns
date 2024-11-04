/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */


public class Usuario implements Observador {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    // recebe as notificações
    public void update(String message) {
        System.out.println(nome + " recebeu a seguinte notificação: " + message);
    }
}