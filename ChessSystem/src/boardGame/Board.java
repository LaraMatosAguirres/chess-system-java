package boardGame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro de criação do tabuleiro: é necessário que haja pelo menos 1 linha e 1 coluna"); 
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece (int rows, int columns) {
		if (!positionExist(rows, columns)) {
			throw new BoardException("Essa posição não existe no tabuleiro");
		}
		return pieces[rows][columns];
	}
	
	public Piece piece (Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Essa posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPice(position)) {
			throw new BoardException("Já exite uma peça nessa posição " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Essa posição não existe no tabuleiro");
		}
		if(piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	public boolean positionExist(int row, int column) {
		return row >=0 && row< rows && column >=0 && column < columns;
	}
	
	public boolean positionExist(Position position) {
		return positionExist(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPice(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Essa posição não existe no tabuleiro");
		}
		return piece(position) != null;
	}
}
