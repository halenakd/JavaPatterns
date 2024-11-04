/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */


public class Notificador {
    public void enviarNotificacao(Usuario usuario, String message) {
        usuario.update(message);
    }
}
