package homework;

import java.awt.Color;

public enum ColorEnum{
	BLACK("black",Color.black),
	BLUE("blue",Color.blue),
	RED("red",Color.red);

	
	private String colorCode;
	private Color color;
	
	private ColorEnum(String colorCode, Color color){
		this.colorCode = colorCode;
		this.color = color;
		
	}

	public String getColorCode() {
		return colorCode;
	}

	public Color getColor() {
		return color;
	}

	
	
}
