/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class CeillingFanMediumSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private int previousSpeed;

    public CeillingFanMediumSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
    	previousSpeed = ceilingFan.getSpeed();
        ceilingFan.mediumSpeed();
    }
    
    public void undo() {
    	if(previousSpeed == 1) {
    		ceilingFan.lowSpeed();	
    	} else if(previousSpeed == 3) {
    		ceilingFan.highSpeed();
    	}
    }
}
