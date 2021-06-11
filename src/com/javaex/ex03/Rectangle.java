package com.javaex.ex03;

public class Rectangle {
	
	// field
	private int width;
	private int height;
	
	
	
	// constructors
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	// method
	public boolean equals(Rectangle rect) {
		return (this.width == rect.width) && (this.height == rect.height);
	}

}
