package com.abpadan.grid;

import java.util.ArrayList;
import java.util.List;

public class Grid {
	private final int[] GRID_VALUES = { 2, 2, 2, 4 };
	
	public int[][] initGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				grid[row][col] = 0;
			}
		}
		return grid;
	}
	
	public boolean checkUpGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] != 0 && row - 1 >= 0) {
					if (grid[row - 1][col] == grid[row][col] || grid[row - 1][col] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean checkLeftGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] != 0 && col - 1 >= 0) {
					if (grid[row][col - 1] == grid[row][col] || grid[row][col - 1] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean checkDownGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] != 0 && row + 1 < grid.length) {
					if (grid[row + 1][col] == grid[row][col] || grid[row + 1][col] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean checkRightGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] != 0 && col + 1 < grid.length) {
					if (grid[row][col + 1] == grid[row][col] || grid[row][col + 1] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean gameValid(int[][] grid) {
		return (checkUpGrid(grid) || checkLeftGrid(grid) || checkDownGrid(grid) || checkRightGrid(grid));
	}
		
	public void printGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(String.format("%6s", grid[row][col]));
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void startGrid(int[][] grid) {
		int xPos1 = (int) (Math.random() * 4);
		int yPos1 = (int) (Math.random() * 4);
		int decider = (int) (Math.random() * 4);
		grid[xPos1][yPos1] = GRID_VALUES[decider];

		int xPos2 = (int) (Math.random() * 4);
		int yPos2 = (int) (Math.random() * 4);
		decider = (int) (Math.random() * 4);
		grid[xPos2][yPos2] = GRID_VALUES[decider];

		if (xPos1 == xPos2 && yPos1 == yPos2) {
			xPos1 = (int) (Math.random() * 4);
			yPos1 = (int) (Math.random() * 4);
			decider = (int) (Math.random() * 4);
			grid[xPos1][yPos1] = GRID_VALUES[decider];
		}
	}
	
	public void addNewTile(int[][] grid) {
		int decider = (int) (Math.random() * 4);
		
		List<GridCoordinates> coordinates = new ArrayList<GridCoordinates>();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				if (grid[row][col] == 0) {
					coordinates.add(new GridCoordinates(row, col));
				}
			}
		}
		
		int random = (int) (Math.random() * coordinates.size());
		int x = coordinates.get(random).getxPos();
		int y = coordinates.get(random).getyPos();
		grid[x][y] = GRID_VALUES[decider];
	}
}
