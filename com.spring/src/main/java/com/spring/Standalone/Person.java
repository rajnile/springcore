package com.spring.Standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> addr;
	private Map<String, Integer> cources;
	private Properties properties;

	public List<String> getAddr() {
		return addr;
	}

	public void setAddr(List<String> addr) {
		this.addr = addr;
	}

	public Map<String, Integer> getCources() {
		return cources;
	}

	public void setCources(Map<String, Integer> cources) {
		this.cources = cources;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
