package applicacion;

import java.util.Scanner;

import Chess.ChessMacth;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMacth chessmatch = new ChessMacth();
		
		while(true) {
		UI.printBoard(chessmatch.getPieces());
		System.out.println();
		System.out.print("Digite a posição de origem: ");
		ChessPosition source = UI.readChesssPosition(sc);
		
		System.out.println();
		System.out.println("Digite a posição de destino: ");
		ChessPosition target = UI.readChesssPosition(sc);
		
		ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
		
		}
	}

}
