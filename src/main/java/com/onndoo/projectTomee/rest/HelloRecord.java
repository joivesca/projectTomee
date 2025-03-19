package com.onndoo.projectTomee.rest;

public class HelloRecord {
	private String text;

	public HelloRecord(String text) {
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}