package pl.cba.kpiotrowski;

enum FieldState {
	BLACK, WHITE, EMPTY
}

class Coords {
	int x, y;
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	Coords(int x, int y) {
		this.x = x; this.y = y;
	}
}

public class Board {
	FieldState[][] fieldState;
	Board(int boardSize) {
		fieldState = new FieldState[boardSize][boardSize];
		for(int x = 0; x < boardSize; ++x) {
			for(int y = 0; y < boardSize; ++y) {
				fieldState[x][y] = FieldState.EMPTY;
			}
		}
	}
	void setField(FieldState state, Coords coords) {
		fieldState[coords.getX()][coords.getY()] = state;
	}
	
	int getSize() {
		return fieldState[0].length;
	}
	
	void displayDebugState() {
		for(int x=0; x < getSize(); ++x) {
			for(int y=0; y < getSize(); ++y) {
				switch(fieldState[x][y]) {
					case BLACK:
						System.out.print("#");
						break;
					case WHITE:
						System.out.print("O");
						break;
					case EMPTY:
						System.out.print(".");
						break;
				};
			};
			System.out.println("");
		}
	}
}
