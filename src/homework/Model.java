package homework;

import java.awt.Color;

public class Model {

	int fontSize;
	String color;
	String text;
	
	public Model(){
		fontSize = 12;
		color =  "BLACK";
		text = "TEST";
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
