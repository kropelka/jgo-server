package pl.cba.kpiotrowski;

import java.util.function.Function;

public class JGo {
	public static void main(String[] args) {
		System.out.println("JGo server (c) 2015 Karol Piotrowski");
		Player b = new Player(1);
		Player w = new Player(2);
		Game game = new Game(b, w, 9);
		game.putStone(FieldState.WHITE, new Coords(0, 0));
		game.putStone(FieldState.BLACK, new Coords(6, 6));
		game.board.displayDebugState();
	}

}
