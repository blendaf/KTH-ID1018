package eu;

import eu.Chessboard.Chesspiece;

public class ChessboardTest {

	public static void main(String[] args) {
		Chessboard ch1 = new Chessboard();
		System.out.println(ch1.toString());

		//Chesspiece p1 = new Pawn('w','P');
		
		Chessboard.Chesspiece pawn1 = ch1.new Pawn('w', 'P');
		Chessboard.Chesspiece pawn2 = ch1.new Pawn ('b', 'P');
		
		Chesspiece [] board = new Chesspiece[8];
		board [0] = pawn1;
		board [1] = pawn2; 
		
		pawn1.markReachableFields();
		System.out.println(ch1.toString());
		
		
		System.out.println(ch1.toString());
		
		for(int i = 0; i < 32; i++)
		{
			
			
		}
 		
		
	}

}
