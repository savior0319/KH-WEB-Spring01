package org.kh.test.annotation;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("애플 스피커 객체 생성 완료");
	}

	@Override
	public void powerOn() {
		System.out.println("애플 스피커 전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("애플 스피커 전원 꺼짐");
	}
}
