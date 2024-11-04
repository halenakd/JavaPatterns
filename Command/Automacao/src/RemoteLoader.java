/*
 * Autor: Halena Kulmann Duarte
 * Data: 03/04/2024
 * Versão: 05/04/2024
 */

public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl(7);

		// instanciando cada objeto de luz, ventilador, som, porta
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        CeilingFan ceilingFan = new CeilingFan();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();

        // instanciando alguns comandos para serem usados
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command ceilingFanHigh = new CeilingFanHighSpeedCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);
        Command garageDoorUp = new GarageUpCommand(garageDoor);
        Command garageDoorDown = new GarageDownCommand(garageDoor);

        // interligando os comandos aos slots do controle
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(5, new NoCommand(), new NoCommand());
        remoteControl.setCommand(6, new NoCommand(), new NoCommand());

        // print do estado atual dos slots do controle
        System.out.println(remoteControl);

        // testes botões/comandos do controle
        // usa o botão de on e depois o de off
        // cada botão tem um comando setado
        System.out.println("Living Room:");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed(); // teste do undo

        System.out.println("Kitchen:");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println("Ceiling Fan:");
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        System.out.println("Garage Door:");
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        
        System.out.println("Stereo:");
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        
	}
}