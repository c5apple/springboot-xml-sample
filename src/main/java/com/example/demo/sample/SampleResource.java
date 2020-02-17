package com.example.demo.sample;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

// Lombokを使えば良い
@XmlRootElement
public class SampleResource {

	private Integer integer;
	private String string;
	private List<String> strings;

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
}
