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

	    public void change (char x, int y, char z, Board board) {
	    if (x == board.letter & y == board.number) {
	    //setBoard_field('x');
	    (board.getBoard()[board.number][board.getNumber(board.letter)]) = z;
	    System.out.println(board.getBoard()[board.number][board.getNumber(board.letter)]);
	    
	    	return;
	    }
	    }
	    public void shot (Board board, Ship anna, Ship bogna, Ship patrycja, Ship monika, Ship natalia,
	    		Ship weronika, Ship sara, Ship daria, char point, char pointx, int pointy, Player p){
	    	boolean shot = false;
	    	
	    	do {
	    		if(point == '*' || point == 'x'){
	    		System.out.println("Już tu celowałeś! Podaj inny punkt:");
	    		continue;
	    		}
	    		if(point == 'A') {
		    		change(pointx, pointy, hit, board);
		    		System.out.println("Trafiony!");
		    		anna.setLives(anna.getLives()-1);
		    		p.setLives(p.getLives()-1);
		    		anna.isItSunk(anna);
		    		shot = true;}
	    		
	    		if(point == 'B') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		bogna.setLives(bogna.getLives()-1);
	    		bogna.isItSunk(bogna);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		
	    		if(point == 'D') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		daria.setLives(daria.getLives()-1);
	    		daria.isItSunk(daria);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		
	    		if(point == 'S') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		sara.setLives(sara.getLives()-1);
	    		sara.isItSunk(sara);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		
	    		if(point == 'N') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		natalia.setLives(natalia.getLives()-1);
	    		natalia.isItSunk(natalia);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		
	    		if(point == 'M') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		monika.setLives(monika.getLives()-1);
	    		monika.isItSunk(monika);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		
	    		if(point == 'P') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		patrycja.setLives(patrycja.getLives()-1);
	    		patrycja.isItSunk(patrycja);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		
	    		}
	    		if(point == 'W') {
	    		change(pointx, pointy, hit, board);
	    		System.out.println("Trafiony!");
	    		weronika.setLives(weronika.getLives()-1);
	    		weronika.isItSunk(weronika);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		if(point == '-'){
	    		System.out.println("Pudło!");
	    		change(pointx, pointy, miss, board);
	    		p.setLives(p.getLives()-1);
	    		shot = true;
	    		}
	    		
	    	}while(shot = false);
	    	
	}
	    
	    	
	    public void readField(Board board, String skan){

		    	if(skan.length() >2 ) {
		    	board.point = skan;
				board.letter = board.point.charAt(0);;
				board.number = 9;}
		    	else {board.point = skan;
				board.letter = board.point.charAt(0);
				board.num = (board.point.charAt(1));
				int number = board.num;
				board.number = (number-49);
		    	}
		    	
	    	 }    

		public static int getBoard_field() {
			return board_field;
		}

		public static void setBoard_field(char board_field) {
			Field.board_field = board_field;
		}
	    
}

