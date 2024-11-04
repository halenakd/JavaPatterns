/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class GarageUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
    	garageDoor.up();
    }
    
    public void undo() {
        garageDoor.down();
    }
}
