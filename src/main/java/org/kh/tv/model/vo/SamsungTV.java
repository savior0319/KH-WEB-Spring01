package org.kh.tv.model.vo;

public class SamsungTV implements TV {

	public SamsungTV() {

	}

	@Override
	public void turnOn() {
		System.out.println("SamsungTV 전원 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("SamsungTV 전원 끔");
	}

	@Override
	public void soundUp() {
		System.out.println("SamsungTV 볼륨다운");
	}

	@Override
	public void soundDown() {
		System.out.println("SamsungTV 볼륨다운");
	}

}
