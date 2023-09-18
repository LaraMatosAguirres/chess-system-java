package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;
import boardGame.Position;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new  boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		//Acime
		p.setValues(position.getRow()- 1, position.getColumn());
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//Baixo
		p.setValues(position.getRow()+ 1, position.getColumn());
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//Esquerda
		p.setValues(position.getRow(), position.getColumn() -1);
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//Direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//nw
		p.setValues(position.getRow()- 1, position.getColumn() - 1);
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//ne
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//sw
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//se
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if(getBoard().positionExist(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
}
