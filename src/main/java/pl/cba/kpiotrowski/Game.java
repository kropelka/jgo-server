package pl.cba.kpiotrowski;

class Move {
	Coords coords;
	FieldState newFieldState;
	Move(int coordX, int coordY, FieldState fieldState) {
		newFieldState = fieldState;
		coords = new Coords(coordX, coordY);
	}
	
	Move(Coords coords, FieldState fieldState) {
		this.coords = coords; this.newFieldState = fieldState; 
	}
	
	FieldState getNewFieldState() {
		return newFieldState;
	}
	Coords getCoords() {
		return coords;
	}
	boolean isValidOn(Board board) {
		if(Math.max(coords.getX(), coords.getY()) < board.getSize()) {
			return true;
		}
		return false;
	}
	void putOnBoard(Board board) {
		board.setField(newFieldState, coords);
	}
}


public class Game {
	Player blackPlayer, whitePlayer;
	Board board;
	Game(Player blackPlayer, Player whitePlayer, int boardSize) {
		this.blackPlayer = blackPlayer;
		this.whitePlayer = whitePlayer;
		board = new Board(boardSize);
	}
	 
	int putStone(FieldState color, Coords coords) {
		if(color == FieldState.EMPTY) {
			System.err.println("Invalid color!");
			return -1;
		};
		Move move = new Move(coords, color);
		if(!move.isValidOn(board)) {
			System.err.println("Nieprawidlowy ruch!");
			return -1;
		};
		move.putOnBoard(board);
		return 0;		
	}
	
}

class GameController {
	Game game;
	
	

	public GameController(Game game) {
		super();
		this.game = game;
	}
	
}

