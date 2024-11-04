/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class CeilingFanHighSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private int previousSpeed;

    public CeilingFanHighSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
    	previousSpeed = ceilingFan.getSpeed();
        ceilingFan.highSpeed();
    }
    
    public void undo() {
    	if(previousSpeed == 1) {
    		ceilingFan.lowSpeed();	
    	} else if(previousSpeed == 2) {
    		ceilingFan.mediumSpeed();
    	}
    }
}
