package com.mycompany.scrap.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * http://tutorials.jenkov.com/java-collections/hashcode-equals.html
 * 
 * @author lkodavali
 *
 */
public class HashcodeEquals extends BaseHashcodeEquals {

	private String firstName;
	private String lastName;
	private long age;
	private long employeeId;
	private long salary;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (age ^ (age >>> 32));
		result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((getSurname() == null) ? 0 : getSurname().hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeEquals other = (HashcodeEquals) obj;
		if (age != other.age)
			return false;
		if (employeeId != other.employeeId)
			return false;
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
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HashcodeEquals [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + "]";
	}

	public HashcodeEquals() {
		super();
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
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public HashcodeEquals(String firstName, String lastName, long age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public static void main(String[] args) {
		HashcodeEquals h1 = new HashcodeEquals("a", "a", 90);
		HashcodeEquals h2 = new HashcodeEquals("a", "a", 900);
		System.out.println(h1.hashCode() + "   " + h2.hashCode());
		System.out.println(h1.equals(h2));

	}
}
