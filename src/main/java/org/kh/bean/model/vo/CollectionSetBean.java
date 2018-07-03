package org.kh.bean.model.vo;

import java.util.Set;

public class CollectionSetBean {

	private Set<String> nameSet;

	public CollectionSetBean() {
	}

	public CollectionSetBean(Set<String> nameSet) {
		super();
		this.nameSet = nameSet;
	}

	@Override
	public String toString() {
		return "CollectionSetBean [nameSet=" + nameSet + ", getNameSet()=" + getNameSet() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Set<String> getNameSet() {
		return nameSet;
	}

	public void setNameSet(Set<String> nameSet) {
		this.nameSet = nameSet;
	}

}
