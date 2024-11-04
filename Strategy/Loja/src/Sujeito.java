/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */


public interface Sujeito {
    void registerObserver(Observador observer);
    void removeObserver(Observador observer);
    void notifyObservers(String message);
}
