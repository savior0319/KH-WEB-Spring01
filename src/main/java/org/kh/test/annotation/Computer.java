package org.kh.test.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

	@Resource(name="apple")
	private Speaker sonySpeaker;


	public Speaker getSonySpeaker() {
		return sonySpeaker;
	}

	public void setSonySpeaker(Speaker sonySpeaker) {
		this.sonySpeaker = sonySpeaker;
	}

	public void setSonySpeaker(SonySpeaker sonySpeaker) {
		this.sonySpeaker = sonySpeaker;
	}

	public Computer() {
		System.out.println("컴퓨터 객체 생성 성공");
	}

	public void powerOn() {
		System.out.println("켜짐");
	}

}
