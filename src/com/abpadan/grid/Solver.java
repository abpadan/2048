package com.abpadan.grid;

public class Solver {
	private int score;
	
	public Solver() {

	}
	
	public int getScore() {
		return score;
	}
	
	public void mergeLeft(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] != 0) {

					for (int dim = col + 1; dim < grid.length; dim++) {
						if (grid[row][dim] != 0) {

							if (grid[row][col] == grid[row][dim]) {
								grid[row][col] *= 2;
								score += grid[row][col];
								grid[row][dim] = 0;
							}
							break;
						}
					}
				}
			}
		}
	}

	public void shiftLeft(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == 0) {
					for (int dim = col + 1; dim < grid.length; dim++) {
						if (grid[row][col] == 0 && grid[row][dim] != 0) {
							grid[row][col] = grid[row][dim];
							grid[row][dim] = 0;
						}
					}
				}
			}
		}
	}
	
	public void mergeRight(int[][] grid) {
		for (int row = grid.length - 1; row >= 0; row--) {
			for (int col = grid[row].length - 1; col >= 0; col--) {
				if (grid[row][col] != 0) {

					for (int dim = col - 1; dim >= 0; dim--) {
						if (grid[row][dim] != 0) {

							if (grid[row][col] == grid[row][dim]) {
								grid[row][col] *= 2;
								score += grid[row][col];
								grid[row][dim] = 0;
							}
							break;
						}
					}
				}
			}
		}
	}

	public void shiftRight(int[][] grid) {
		for (int row = grid.length - 1; row >= 0; row--) {
			for (int col = grid[row].length - 1; col >= 0; col--) {
				if (grid[row][col] == 0) {
					for (int dim = col - 1; dim >= 0; dim--) {
						if (grid[row][col] == 0 && grid[row][dim] != 0) {
							grid[row][col] = grid[row][dim];
							grid[row][dim] = 0;
						}
					}
				}
			}
		}
	}
	
	public void mergeUp(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] != 0) {

					for (int dim = row + 1; dim < grid.length; dim++) {
						if (grid[dim][col] != 0) {

							if (grid[row][col] == grid[dim][col]) {
								grid[row][col] *= 2;
								score += grid[row][col];
								grid[dim][col] = 0;
							}
							break;
						}
					}
				}
			}
		}
	}
	
	public void shiftUp(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == 0) {
					for (int dim = row + 1; dim < grid.length; dim++) {
						if (grid[row][col] == 0 && grid[dim][col] != 0) {
							grid[row][col] = grid[dim][col];
							grid[dim][col] = 0;
						}
					}
				}
			}
		}
	}

	public void mergeDown(int[][] grid) {
		for (int row = grid.length - 1; row >= 0; row--) {
			for (int col = grid[row].length - 1; col >= 0; col--) {
				if (grid[row][col] != 0) {

					for (int dim = row - 1; dim >= 0; dim--) {
						if (grid[dim][col] != 0) { 

							if (grid[row][col] == grid[dim][col]) {
								grid[row][col] *= 2;
								score += grid[row][col];
								grid[dim][col] = 0;
							}
							break;
						}
					}
				}
			}
		}
	}
	
	public void shiftDown(int[][] grid) {
		for (int row = grid.length - 1; row >= 0; row--) {
			for (int col = grid[row].length - 1; col >= 0; col--) {
				if (grid[row][col] == 0) {
					for (int dim = row - 1; dim >= 0; dim--) {
						if (grid[row][col] == 0 && grid[dim][col] != 0) {
							grid[row][col] = grid[dim][col];
							grid[dim][col] = 0;
						}
					}
				}
			}
		}
	}
}