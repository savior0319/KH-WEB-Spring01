package org.kh.bean.model.vo;

import java.util.List;

public class CollectionBean {

	private List<String> nameList;

	public CollectionBean() {
	}

	public CollectionBean(List<String> nameList) {
		super();
		this.nameList = nameList;
	}

	@Override
	public String toString() {
		return "CollectionBean [nameList=" + nameList + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
}
