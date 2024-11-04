/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class CeillingFanLowSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private int previousSpeed;

    public CeillingFanLowSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
    	previousSpeed = ceilingFan.getSpeed();
        ceilingFan.lowSpeed();
    }
    
    public void undo() {
    	if(previousSpeed == 2) {
    		ceilingFan.mediumSpeed();	
    	} else if(previousSpeed == 3) {
    		ceilingFan.highSpeed();
    	}
    }
}
