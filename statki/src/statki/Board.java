package statki;

public class Board{
	
	public int boardSize = 10;
	
	private char[][] board;
	public char letter;
	public char num;
	public int number;
	public String point;
	

	public static final char[] BOARD_X = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	private Field board_field; 
	
	public void createBoard (){
		board = new char[boardSize][boardSize];
		System.out.print("\t");
		for(int n=0; n < BOARD_X.length; n++) {
			System.out.print(BOARD_X[n] + "  ");
		}
		System.out.println();
		for(int i = 0; i < boardSize; i++) {
			System.out.print((i+1) + "\t");
            for(int j = 0; j < boardSize; j++) {
                board[i][j] = Field.board_field;
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
		}
	}
	public char[][] getBoard() {
		return board;
	}
	
	public void printBoard(char[][] board) {
		System.out.print("\t");
		for(int n=0; n < BOARD_X.length; n++) {
			System.out.print(BOARD_X[n] + "  ");
		}
		System.out.println();
		for(int i = 0; i < boardSize; i++) {
			System.out.print((i+1) + "\t");
            for(int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j]+"  ");
            }
           System.out.println();
		}
		
	}
	public int getNumber(char letter) {
		int column = 10;
		
		switch(letter){
		case 'A':
			column = 0;
			break;
		case 'B':
			column = 1;
			break;
		case 'C':
			column = 2;
			break;
		case 'D':
			column = 3;
			break;
		case 'E':
			column = 4;
			break;
		case 'F':
			column = 5;
			break;
		case 'G':
			column = 6;
			break;
		case 'H':
			column = 7;
			break;
		case 'I':
			column = 8;
			break;
		case 'J':
			column = 9;
			break;
		}
		return column;
	}
	public char getLetter(int i){
		  return (char) (i + 64);
		}
	
	public int boardSize(int size) {
		size = this.boardSize;
		return size;
	}
	
}
