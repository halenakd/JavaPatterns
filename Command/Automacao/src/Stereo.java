/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class Stereo {
	private int vol;
	
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo is set for CD input");
    }
    
    public void setDVD() {
        System.out.println("Stereo is set for DVD input");
    }
    
    public void setRadio() {
        System.out.println("Stereo is set for Radio mode");
    }

    public void setVolume(int vol) {
        System.out.println("Stereo volume set to " + vol);
    }
    
    public int getVolume() {
        return vol;
    }
}
