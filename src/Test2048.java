import java.util.Scanner;

import com.abpadan.grid.Grid;
import com.abpadan.grid.Solver;

public class Test2048 {
	public static void main(String[] args) {
		Solver solverObj = new Solver();
		Grid gridObj = new Grid();

		Scanner scanner = new Scanner(System.in);
		int grid[][] = new int[4][4];
		grid = gridObj.initGrid(grid);
		String choice;

		System.out.println("2048 game\nuse u for up, h for left\nk for right and n for down\n-1 to quit: \n");
		gridObj.startGrid(grid);
		gridObj.printGrid(grid);

		do {
			choice = scanner.next();

			if (choice.equals("u")) {
				if (gridObj.checkUpGrid(grid)) {
					solverObj.mergeUp(grid);
					solverObj.shiftUp(grid);
					gridObj.addNewTile(grid);
					gridObj.printGrid(grid);
				} 
			} else if (choice.equals("h")) {
				if (gridObj.checkLeftGrid(grid)) {
					solverObj.mergeLeft(grid);
					solverObj.shiftLeft(grid);
					gridObj.addNewTile(grid);
					gridObj.printGrid(grid);
				} 
			} else if (choice.equals("k")) {
				if (gridObj.checkRightGrid(grid)) {
					solverObj.mergeRight(grid);
					solverObj.shiftRight(grid);
					gridObj.addNewTile(grid);
					gridObj.printGrid(grid);
				} 
			} else if (choice.equals("n")) {
				if (gridObj.checkDownGrid(grid)) {
					solverObj.mergeDown(grid);
					solverObj.shiftDown(grid);
					gridObj.addNewTile(grid);
					gridObj.printGrid(grid);
				} 
			}
		} while (!choice.equals("-1") && gridObj.gameValid(grid));
		
		System.out.println("Game over.");
		System.out.println("Your score is: "+ solverObj.getScore());
		
		scanner.close();
	}
}
