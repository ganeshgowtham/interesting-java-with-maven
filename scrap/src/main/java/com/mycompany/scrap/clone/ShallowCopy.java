package com.mycompany.scrap.clone;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {

	private String firstName;

	private String lastName;
	
	private List<String> dbNames = new ArrayList<>();

	
	public List<String> getDbNames() {
		return dbNames;
	}
	
	private void setdb() {
		// TODO Auto-generated method stub

	}
	public ShallowCopy() {
		super();
		dbNames.add("a1");
		System.out.println("def cons");
	}
	
	public ShallowCopy(String firstName) {
		super();
		this.firstName = firstName;
		
	}


	public ShallowCopy(String firstName, String lastName) {
		super();
		dbNames.add("a1");
		System.out.println("par cons");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "ShallowCopy [firstName=" + firstName + ", lastName=" + lastName + ", dbNames=" + dbNames + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShallowCopy other = (ShallowCopy) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) throws Exception {
		ShallowCopy c1 = new ShallowCopy("hello", "world");
		System.out.println(c1);
		c1.getDbNames().add("b1");
		// Class.forName("com.mycompany.scrap.clone.ShallowCopy");
		// ShallowCopy c1 = ShallowCopy.class.newInstance();
		System.out.println(c1);
	}
}
