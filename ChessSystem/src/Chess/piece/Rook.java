package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;
import boardGame.Position;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new  boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		//Para cima
		p.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// Para esquerda
		p.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()- 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// Para direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// Para baixo
		p.setValues(position.getRow() + 1, position.getColumn());
		while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
}
