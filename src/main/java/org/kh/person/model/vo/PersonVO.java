package org.kh.person.model.vo;

public class PersonVO {

	private String name, adrr;
	private int age;

	public PersonVO() {
	}

	public PersonVO(String name, int age, String adrr) {
		super();
		this.name = name;
		this.adrr = adrr;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", adrr=" + adrr + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdrr() {
		return adrr;
	}

	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
