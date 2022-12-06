package com.babu;

public class TestMap {
	private int id;
	private String name;
	
	public TestMap() {
		
	}
	
	public TestMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		/*
		 * final int prime = 31; int result = 1; result = prime * result + id; return
		 * result;
		 */
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestMap other = (TestMap) obj;
		if (name != other.name)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TestMap [id=" + id + ", name=" + name + "]";
	}
	
		
	

}
