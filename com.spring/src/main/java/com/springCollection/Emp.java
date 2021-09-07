package com.springCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> numbers;
	private Set<String> addr;
	private Map<String, String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	public Set<String> getAddr() {
		return addr;
	}

	public void setAddr(Set<String> addr) {
		this.addr = addr;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Emp(String name, List<String> numbers, Set<String> addr, Map<String, String> courses) {
		super();
		this.name = name;
		this.numbers = numbers;
		this.addr = addr;
		this.courses = courses;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", numbers=" + numbers + ", addr=" + addr + ", courses=" + courses + "]";
	}

}
