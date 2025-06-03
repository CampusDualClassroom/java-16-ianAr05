package com.campusdual.classroom;

import java.sql.SQLOutput;

public class Plane implements IMachine{

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}

	@Override
	public void start() {
		System.out.println("Esta encendido");
	}

	@Override
	public void stop() {
		System.out.println("Esta apagado");
	}

	@Override
	public void maintenance() {
		System.out.println("Se ecnuentra realizando un mantenimiento");
	}
}
