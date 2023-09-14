package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}
}
