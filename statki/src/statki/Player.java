package statki;
import java.util.Scanner;

public class Player{
	

    private int lives = 21;
    
    public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
    
    public void turn(Field field, Board board, Ship anna, Ship bogna, Ship patrycja, Ship monika, Ship natalia,
    		Ship weronika, Ship sara, Ship daria, Player p) {
    	boolean f = false;
    	
    	start:
    	while(!f) {
    	System.out.println("Podaj pole:");
        Scanner pole = new Scanner(System.in);
        String skan = pole.nextLine();
        System.out.println(skan);
        String s1 = "A1";
        
    	if(!skan.equals("A1") && !skan.equals("A2") && !skan.equals("A3") && !skan.equals("A4") && !skan.equals("A5") && !skan.equals("A6") && !skan.equals("A7") && !skan.equals("A8") && !skan.equals("A9") && !skan.equals("A10")
    		&&!skan.equals( "B1") && !skan.equals("B2") && !skan.equals("B3") && !skan.equals("B4") && !skan.equals("B5") && !skan.equals("B6") && !skan.equals("B7") && !skan.equals("B8") && !skan.equals("B9") && !skan.equals("B10")
    		&&!skan.equals( "C1") && !skan.equals("C2") && !skan.equals("C3") && !skan.equals("C4") && !skan.equals("C5") && !skan.equals("C6") && !skan.equals("C7") && !skan.equals("C8") && !skan.equals("C9") && !skan.equals("C10")
    		&&!skan.equals( "D1") && !skan.equals("D2") && !skan.equals("D3") && !skan.equals("D4") && !skan.equals("D5") && !skan.equals("D6") && !skan.equals("D7") && !skan.equals("D8") && !skan.equals("D9") && !skan.equals("D10")
    		&&!skan.equals( "E1") && !skan.equals("E2") && !skan.equals("E3") && !skan.equals("E4") && !skan.equals("E5") && !skan.equals("E6") && !skan.equals("E7") && !skan.equals("E8") && !skan.equals("E9") && !skan.equals("E10")
    		&&!skan.equals( "F1") && !skan.equals("F2") && !skan.equals("F3") && !skan.equals("F4") && !skan.equals("F5") && !skan.equals("F6") && !skan.equals("F7") && !skan.equals("F8") && !skan.equals("F9") && !skan.equals("F10")
    		&&!skan.equals( "G1") && !skan.equals("G2") && !skan.equals("G3") && !skan.equals("G4") && !skan.equals("G5") && !skan.equals("G6") && !skan.equals("G7") && !skan.equals("G8") && !skan.equals("G9") && !skan.equals("G10")
    		&&!skan.equals( "H1") && !skan.equals("H2") && !skan.equals("H3") && !skan.equals("H4") && !skan.equals("H5") && !skan.equals("H6") && !skan.equals("H7") && !skan.equals("H8") && !skan.equals("H9") && !skan.equals("H10")
    		&&!skan.equals( "I1") && !skan.equals("I2") && !skan.equals("I3") && !skan.equals("I4") && !skan.equals("I5") && !skan.equals("I6") && !skan.equals("I7") && !skan.equals("I8") && !skan.equals("I9") && !skan.equals("I10")
    		&&!skan.equals( "J1") && !skan.equals("J2") && !skan.equals("J3") && !skan.equals("J4") && !skan.equals("J5") && !skan.equals("J6") && !skan.equals("J7") && !skan.equals("J8") && !skan.equals("J9") && !skan.equals("J10")) {
    		System.out.println("Nie ma takiego pola! Podaj inny punkt:");
    		continue;
    	}else {
		field.readField(board, skan);
		field.shot(board, anna, bogna, patrycja, monika, natalia, weronika, sara,daria,(board.getBoard()[board.number][board.getNumber(board.letter)]), board.letter, board.number, p);
		
		//field.shot(board.letter, board.number, field.hit, board );
    	}
    	f = true;
    	}
    	
    }
    
}
    	
  

