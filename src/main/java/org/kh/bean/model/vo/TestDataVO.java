package org.kh.bean.model.vo;

public class TestDataVO {

	private int data;

	public TestDataVO() {
	}

	public TestDataVO(int data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "TestDataVO [data=" + data + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
