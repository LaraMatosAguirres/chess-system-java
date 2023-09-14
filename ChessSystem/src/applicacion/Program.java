package applicacion;

import Chess.ChessMacth;

public class Program {

	public static void main(String[] args) {
		
		ChessMacth chessmatch = new ChessMacth();
		UI.printBoard(chessmatch.getPieces());
	}

}
