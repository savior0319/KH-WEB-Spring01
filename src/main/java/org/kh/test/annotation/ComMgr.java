package org.kh.test.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComMgr {

	@Autowired
	private Computer com;

	public ComMgr() {
	}

	public ComMgr(Computer com) {
		super();
		this.com = com;
	}

	@Override
	public String toString() {
		return "ComMgr [com=" + com + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

}
