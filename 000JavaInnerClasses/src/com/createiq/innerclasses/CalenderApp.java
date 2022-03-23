package com.createiq.innerclasses;

public enum CalenderApp {

	january((byte) 31), Feb((byte) 28);

	private byte days;

	private CalenderApp(byte days) {
		this.days = days;
	}

}
