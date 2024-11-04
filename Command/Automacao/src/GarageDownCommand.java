/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class GarageDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
    	garageDoor.down();
    }
    
    public void undo() {
        garageDoor.up();
    }
}
