package com.bharath.patterns.command;

public class RemoteControl {

	Command command;

	public void pressButton() {
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
