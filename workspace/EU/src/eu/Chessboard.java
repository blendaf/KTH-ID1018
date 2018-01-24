package eu;

public class Chessboard {

	public static class Field
	
	{
		private char row;
		private byte column;
		private Chesspiece piece = null;
		private boolean marked = false;
		
		//konstruktor, skapar ett objekt av Field
		public Field (char row, byte column)
		{
			this.row = row;
			this.column = column;
		}
		
		
		public void put (Chesspiece piece)
		{
			this.piece = piece;
		}
		
		public Chesspiece take ()	
		{
			Chesspiece piece = this.piece;
			this.piece = null;
			return this.piece;
		}
		
		public void mark()
		{
			this.marked = true;
		}
		
		public void unmark ()
		{
			this.marked = false;
		}
		
		public String toString ()
		{
			String s = (marked)? "xx" : "--";
			return (piece == null)? s: piece.toString();
		}
	}
		
		public static final int NUMBER_OF_ROWS = 8;
		public static final int NUMBER_OF_COLUMNS = 8;
		public static final int FIRST_ROW = 'a';
		public static final int FIRST_COLUMN = 1;
		
		
		private Field[][]  fields;
		
		//Konstruktor - skapar ett shackbräde
		public Chessboard ()
		{
			fields = new Field[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
			char row= 0;

			byte column = 0;
			for (int r = 0; r < NUMBER_OF_ROWS; r++) 
			{
				row = (char)  (FIRST_ROW + r);
				column = FIRST_COLUMN;
				for (int c = 0; c < NUMBER_OF_COLUMNS; c++) 
			{
				fields[r][c] = new Field (row, column);
				column++; 
			
			}	
			}
		}
		public String toString () 
		{
			String s = "   1  2  3  4  5  6  7  8";
			
			StringBuilder sb = new StringBuilder(s);
			for (int j = 0; j < 8; j++)
			{
				sb.append("\r" + j + " ");
				for (int i = 0 ; i < NUMBER_OF_COLUMNS; i++)
				{
					sb.append(fields[j][i].toString() + " ") ;
				}	
			}
			
			return sb.toString();
		}
		
		
		public boolean isValidField (char row, byte column) 
		{
			return (row >= 'a' && row < 'a' + NUMBER_OF_ROWS && column >= FIRST_COLUMN && column < FIRST_COLUMN + NUMBER_OF_COLUMNS) ? true : false;
		}
		
		
public abstract class Chesspiece 
		
{
		private char color; 
		// w - white, b - black
		
		private char name;
		// K - King, Q - Queen, 
		// P – Pawn
		
		protected char row = 0;
		protected byte column = -1;
		
		protected Chesspiece (char color, char name) 
		{
			this.color = color;
			this.name = name;
		}
		
		public String toString (){
			return "" + color + name; }
		
		public boolean isOnBoard () {
			return Chessboard.this.isValidField (row, column); }
		
		public void moveTo (char row, byte column) throws NotValidFieldException 
		{
			if (!Chessboard.this.isValidField (row, column))
				throw new NotValidFieldException ("bad field: " + row + column );
		
			this.row = row; 
			this.column = column;
			
		
			int r = row - FIRST_ROW;
			int c = column - FIRST_COLUMN; 
			Chessboard.this.fields[r][c].put (this);
		}
		
		//tar bort pjäserna från brädet
		public void moveOut () 
		{
			if (this.isOnBoard())
			{
				int r = row - FIRST_ROW;
				int c = column - FIRST_COLUMN;
				Chessboard.this.fields[r][c].take();
			}
			
			this.row = 0;
			this.column = -1;
			
		}
		
		//markReachableFields markerar alla de fält på brädet som pjäsen kan nå med ett steg
		public abstract void markReachableFields ();
		
		//unmarkReachableFields tar bort markeringarna från alla de fält som pjäsen kan nå med ett steg
		public abstract void unmarkReachableFields (); 
		
}


//bonde
public class Pawn extends Chesspiece
{
		//skapar bonden utifrån dess färg och namn, bonde ligger utanför brädet
		public Pawn (char color, char name) 
		{
			super (color, name); 
			
			
		}
		
		public void markReachableFields ()
		
		{
			byte col = (byte) (column + 1);
			if (Chessboard.this.isValidField (row, col)) 
			{
				int r = row - FIRST_ROW;
				int c = col - FIRST_COLUMN; 
				Chessboard.this.fields[r][c].mark ();
			} 
		}
		public void unmarkReachableFields ()
		{
			byte col = (byte) (column + 1);
			if (Chessboard.this.isValidField (row, col)) 
			{
				int r = row - FIRST_ROW;
				int c = col - FIRST_COLUMN; 
				Chessboard.this.fields[r][c].unmark ();
			} 
		}	
}


	//torn
	public class Rook extends Chesspiece 
		{
			public Rook (char color, char name) 
			{
				super (color, name); 
			}
			
			public void markReachableFields ()
			
			{
				byte col = (byte)(column);
				char ro = (char)(row);
				
				if (Chessboard.this.isValidField (ro, col))
				{
				
				for (char r = 'a'; r <= 'h'; r++)
					{Chessboard.this.fields[r][col].mark();}
				
				for (byte c = 1; c <= NUMBER_OF_COLUMNS; c++)
					{Chessboard.this.fields[ro][c].mark();}
				} 
			}
			
			public void unmarkReachableFields ()
			{
				byte col = (byte)(column);
				char ro = (char)(row);
				
				if (Chessboard.this.isValidField (ro, col))
				{
				
				for (char r = 'a'; r <= 'h'; r++)
					{Chessboard.this.fields[r][col].unmark();}
				
				for (byte c = 1; c <= NUMBER_OF_COLUMNS; c++)
					{Chessboard.this.fields[ro][c].unmark();}
				}	
			} 
		
			
			
		/*
		 * 
		 * 
		 * Löpare
		 * 
		 * 
		 */
			
		public class Bishop extends Chesspiece 
		{
			public Bishop (char color, char name)
			{ 
				super (color, name);
			}

			
			public void markReachableFields() 
			{
				byte colUp = (byte)(column+1);
				char roUp = (char)(row+1);
				
				while (colUp <= 8 && roUp <= 'h')
				{if (Chessboard.this.isValidField (roUp, colUp))
				{
					Chessboard.this.fields[roUp][colUp].mark();
					
				}
				roUp++;
				colUp++;
				}
				
				byte colDown = (byte)(column-1);
				char roDown = (char)(row -1);
				
				while (colDown >= 1 && roDown >= 'a')
				{if (Chessboard.this.isValidField (roDown, colDown))
				{
					Chessboard.this.fields[roDown][colDown].mark();
					
				}
				roDown--;
				colDown--;
				}
			}

			
			public void unmarkReachableFields() 
			{
				byte colUp = (byte)(column+1);
				char roUp = (char)(row+1);
				
				while (colUp <= 8 && roUp <= 'h')
				{
					if (Chessboard.this.isValidField (roUp, colUp))
					{
						Chessboard.this.fields[roUp][colUp].unmark();
						
						
					}	
					roUp++;
					colUp++;
				}
				
				byte colDown = (byte)(column-1);
				char roDown = (char)(row -1);
				
				while (colDown >= 1 && roDown >= 'a')
				{if (Chessboard.this.isValidField (roDown, colDown))
				{
					Chessboard.this.fields[roDown][colDown].unmark();
					
				}
				roDown--;
				colDown--;
				}
				
			}
		} 
		
		/*
		 * 
		 * 
		 * Springare
		 * 
		 * 
		 */
		public class Knight extends Chesspiece 
		{
			public Knight (char color, char name)
			{
				super(color, name);
			}

			public void markReachableFields() {
				
				
			}

		
			public void unmarkReachableFields() {
			
				
			}
		} 
		
		/*
		 * 
		 * DAM
		 * 
		 * 
		 */
		
		public class Queen extends Chesspiece 
		{
			public Queen (char color, char name)
			{
				super(color, name);
			}

		
			public void markReachableFields() {
			
				
			}

			
			public void unmarkReachableFields() {
				
				
			}
			
		} 
		
		
		/*
		 * 
		 * KUNG
		 * 
		 */
		
		public class King extends Chesspiece {
			
			public King (char color, char name) 
			{
				super (color, name); 
			}
			
			public void markReachableFields ()
			{
				byte colUp = (byte) (column +1);
				
				if (Chessboard.this.isValidField (row, colUp)) 
					{Chessboard.this.fields[row][colUp].mark ();} 
				
				byte colDown = (byte)(column -1) ;
				
				if (Chessboard.this.isValidField (row, colDown)) 
					{Chessboard.this.fields[row][colDown].mark ();} 
				
				
				char roRight = (char)(row+1);
		
				if (Chessboard.this.isValidField (roRight, column)) 
					{Chessboard.this.fields[roRight][column].mark ();} 
				
				char roLeft = (char)(row-1);
				
				if (Chessboard.this.isValidField (roLeft, column)) 
					{Chessboard.this.fields[roLeft][column].mark ();} 
			}
			
			public void unmarkReachableFields ()
			{
				byte col = (byte) (column);
				
				if (Chessboard.this.isValidField (row, col)) 
					{Chessboard.this.fields[row][col+1].unmark ();}
			 
				if (Chessboard.this.isValidField (row, col)) 
					{Chessboard.this.fields[row][col-1].unmark ();} 
				
				
				char ro = (char)(row);
				
				if (Chessboard.this.isValidField (ro, col)) 
					{Chessboard.this.fields[ro+1][col].unmark ();}
				
				if (Chessboard.this.isValidField (ro, col)) 
					{Chessboard.this.fields[ro-1][col].unmark ();} 
			} 
		}	
	}
		


}

	
		
	



	

