package org.kh.tv.model.vo;

public class LGTV implements TV {

	public LGTV() {
	}

	@Override
	public void turnOn() {
		System.out.println("LGTV 전원 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("LGTV 전원 끔");
	}

	@Override
	public void soundUp() {
		System.out.println("LGTV 볼륨업");
	}

	@Override
	public void soundDown() {
		System.out.println("LGTV 볼륨다운");
	}
}
