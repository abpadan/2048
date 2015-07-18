package com.abpadan.grid;

public class GridCoordinates {
	private int xPos;
	private int yPos;
	
	public GridCoordinates(int xPos, int yPos) {
		setxPos(xPos);
		setyPos(yPos);
	}
	
	public int getxPos() {
		return xPos;
	}
	
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	public int getyPos() {
		return yPos;
	}
	
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}
