/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class CeilingFan {
	private int speed;

    public void highSpeed() {
        speed = 3;
        System.out.println("Ceiling fan is on high");
    }

    public void mediumSpeed() {
        speed = 2;
        System.out.println("Ceiling fan is on medium");
    }

    public void lowSpeed() {
        speed = 1;
        System.out.println("Ceiling fan is on low");
    }

    public int getSpeed() {
        return speed;
    }

    public void off() {
        speed = 0;
        System.out.println("Ceiling fan is off");
    }
}
