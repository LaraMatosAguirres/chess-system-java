package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
