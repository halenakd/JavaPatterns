/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
    
    public void undo() {
    	ceilingFan.highSpeed();
    }
}
