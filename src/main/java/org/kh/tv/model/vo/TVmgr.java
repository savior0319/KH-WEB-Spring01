package org.kh.tv.model.vo;

public class TVmgr {

	private TV tv;

	public TVmgr() {
	}

	public TVmgr(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public String toString() {
		return "TVmgr [tv=" + tv + "]";
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

}
