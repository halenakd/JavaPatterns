/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Interface Subject, que vai ser implementada pela classe de dados de tempo */

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
