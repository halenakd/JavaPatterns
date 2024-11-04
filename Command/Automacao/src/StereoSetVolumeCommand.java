/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class StereoSetVolumeCommand implements Command {
    private Stereo stereo;
    private int previousVolume;
    private int newVolume;

    public StereoSetVolumeCommand(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.newVolume = volume;
    }

    public void execute() {
    	previousVolume = stereo.getVolume();
        stereo.setVolume(newVolume);
    }
    
    public void undo() {
    	stereo.setVolume(previousVolume);
    }
}
