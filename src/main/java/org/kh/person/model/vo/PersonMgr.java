package org.kh.person.model.vo;

public class PersonMgr {

	private PersonVO ps;

	public PersonMgr() {
	}

	public PersonMgr(PersonVO ps) {
		super();
		this.ps = ps;
	}

	@Override
	public String toString() {
		return "PersonMgr [ps=" + ps + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public PersonVO getPs() {
		return ps;
	}

	public void setPs(PersonVO ps) {
		this.ps = ps;
	}

}
