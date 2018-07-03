package org.kh.bean.model.vo;

import java.util.Map;

public class CollectionMapBean {

	private Map<String, String> nameMap;

	public CollectionMapBean() {
	}

	public CollectionMapBean(Map<String, String> nameMap) {
		super();
		this.nameMap = nameMap;
	}

	public Map<String, String> getNameMap() {
		return nameMap;
	}

	public void setNameMap(Map<String, String> nameMap) {
		this.nameMap = nameMap;
	}

	@Override
	public String toString() {
		return "CollectionMapBean [nameMap=" + nameMap + "]";
	}

}
