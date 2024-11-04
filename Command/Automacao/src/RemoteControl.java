/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class RemoteControl {
	// comandos que vão nos botões de on
    private Command[] onCommands;
    // comandos que vão nos botões de off
    private Command[] offCommands;
    // comando undo, desfazer
    private Command undoCommand;

    public RemoteControl(int numSlots) {
        onCommands = new Command[numSlots];
        offCommands = new Command[numSlots];
        
        // inicializando todos os slots como sem comando/vazios
        for (int i = 0; i < numSlots; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        // o undo também
        undoCommand = new NoCommand();
    }

    // função para setar os slots com os comandos de on e off
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // botão de on pressionado - executa a ação do comando setado
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        // o undo vai guardar o último comando chamado para poder chamar o undo dele
        undoCommand = onCommands[slot];
    }

    // botão de off pressionado - executa a ação do comando setado
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        // o undo vai guardar o último comando chamado para poder chamar o undo dele
        undoCommand = offCommands[slot];
    }
    
    // botão de undo pressionado - desfaz a ação do último comando
    public void undoButtonWasPushed() {
    	undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ").append(i).append("] ")
                         .append(onCommands[i].getClass().getName()).append(" ")
                         .append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuilder.toString();
    }
}
