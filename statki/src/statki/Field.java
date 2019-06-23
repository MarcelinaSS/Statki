package statki;
import java.util.Scanner;

public class Field {
	 	private String koordynataX;
	    private String koordynataY;
	    public Boolean statek;
	    public static char board_field = '-';
	    public static char water = '~';
	    public static char miss = '*';
	    public static char hit = 'X';
	    public String skan;

	    public void shot (char x, int y, char z, Board board) {
	    if (x == board.letter & y == board.number) {
	    //setBoard_field('x');
	    (board.getBoard()[board.number][board.getNumber(board.letter)]) = z;
	    System.out.println(board.getBoard()[board.number][board.getNumber(board.letter)]);
	    
	    	return;
	    }
	    }
	    public void readField(Board board, String skan){
			//Scanner scan1 = new Scanner(System.in);
			//System.out.println("Podaj pole do strza³u:");
			// = scan1.nextLine();
	    	board.point = skan;
			board.letter = board.point.charAt(0);
			board.num = (board.point.charAt(1));
			int number = board.num;
			board.number = (number-49);
			
	    }

		public static int getBoard_field() {
			return board_field;
		}

		public static void setBoard_field(char board_field) {
			Field.board_field = board_field;
		}
	    

//	    public void pole (){
//	    	Scanner scanX = new Scanner(System.in);
//	    	Scanner scanY = new Scanner(System.in);
	    	
//	    	System.out.println("Podaj pole X:");
//	        koordynataX = scanX.nextLine();
//	        System.out.println("Podaj pole Y:");
//	        koordynataY = scanY.nextLine();
//	        System.out.println("Wybrane pole :" + koordynataX + koordynataY);
//	    }
//
//	    	}
}

