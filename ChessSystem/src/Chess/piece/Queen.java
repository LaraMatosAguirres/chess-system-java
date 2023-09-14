package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "Q";
	}

}
