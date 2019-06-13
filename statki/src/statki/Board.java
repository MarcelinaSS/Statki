package statki;

public class Board{
	
	public static final int BOARD_SIZE = 10;
	
	private char[][] board;
	public static final char[] BOARD_X = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	public static final char BOARD_POLE = '-';
	
	public void createBoard (){
		board = new char[BOARD_SIZE][BOARD_SIZE];
		System.out.print("\t");
		for(int n=0; n < BOARD_X.length; n++) {
			System.out.print(BOARD_X[n] + "  ");
		}
		System.out.println();
		for(int i = 0; i < BOARD_SIZE; i++) {
			System.out.print((i+1) + "\t");
            for(int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = BOARD_POLE;
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
		}
	}
}

