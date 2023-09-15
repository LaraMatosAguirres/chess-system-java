package applicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMacth;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMacth chessmatch = new ChessMacth();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessmatch.getPieces());
				System.out.println();
				System.out.print("Digite a posição de origem: ");
				ChessPosition source = UI.readChesssPosition(sc);
				
				System.out.println();
				System.out.println("Digite a posição de destino: ");
				ChessPosition target = UI.readChesssPosition(sc);
				
				ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
			} catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				sc.nextLine();
			}
		}
	}

}
