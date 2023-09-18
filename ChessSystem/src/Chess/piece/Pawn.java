package Chess.piece;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;
import boardGame.Position;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "P";
	}
	

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new  boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		if(getColor() == color.WHITE) {
			p.setValues(position.getRow() - 1, position.getColumn());
			while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() - 2, position.getColumn());
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p) && getBoard().positionExist(p2) && !getBoard().thereIsAPice(p2) && moveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;					
			}		
			
			p.setValues(position.getRow() - 1, position.getColumn() - 1);
			while(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			while(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		else {
			p.setValues(position.getRow() + 1, position.getColumn());
			while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() + 2, position.getColumn());
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			while(getBoard().positionExist(p) && !getBoard().thereIsAPice(p) && getBoard().positionExist(p2) && !getBoard().thereIsAPice(p2) && moveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;				
			}		
			
			p.setValues(position.getRow() + 1, position.getColumn() - 1);
			while(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			while(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
			
		
		return mat;
	}

}
