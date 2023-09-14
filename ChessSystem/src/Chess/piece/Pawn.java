package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "P";
	}

}