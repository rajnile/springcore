package com.spring.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("raj nile")
	private String name;
	@Value("akluj")
	private String city;
	@Value("9096717039")
	private long mobile;
	@Value("#{temp}")
	private List<String> addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public List<String> getAddr() {
		return addr;
	}

	public void setAddr(List<String> addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}

}
