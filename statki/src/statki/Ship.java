package statki;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ship {
	
	private ArrayList<Integer> shipLengthArray = new ArrayList<Integer>();
	private ArrayList<Integer> shipCharArray = new ArrayList<Integer>();
	public Ships ships;
	Random rand = new Random();
	
	public String name;
	public int lives;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	Ship(String name, int lives){
		this.name = name;
		this.lives = lives;
	}

	public enum Ships {

		ANNA (5, 1, "ANNA"),
		BOGNA (4, 2, "BOGNA"),
		DARIA (3, 4, "DARIA"),
		SARA (3, 19, "SARA"),
		PATRYCJA (2, 16, "PATRYCJA"),
		MONIKA (2, 13, "Monika"),
		NATALIA (1, 14, "Natalia"),
		WERONIKA (1, 23, "Weronika");
		
		final int shipSize;
		final int shipMarker;
		final String shipString;

		Ships(int shipSize, int shipMarker, String shipString) {
			this.shipSize = shipSize;
			this.shipMarker = shipMarker;
			this.shipString = shipString;
		}
		
		public int getShipLength() {
			return shipSize;
		}
		
		public int getShipMarker() {
			return shipMarker;
		}
		
		public String getShipString() {
			return shipString;
		}
	}
	
	public void createShipArray(){
		shipLengthArray.add(ships.ANNA.getShipLength()); 
		shipLengthArray.add(ships.BOGNA.getShipLength()); 
		shipLengthArray.add(ships.DARIA.getShipLength()); 
		shipLengthArray.add(ships.SARA.getShipLength()); 
		shipLengthArray.add(ships.PATRYCJA.getShipLength()); 
		shipLengthArray.add(ships.MONIKA.getShipLength());
		shipLengthArray.add(ships.NATALIA.getShipLength());
		shipLengthArray.add(ships.WERONIKA.getShipLength());

		shipCharArray.add(ships.ANNA.getShipMarker());
		shipCharArray.add(ships.BOGNA.getShipMarker());
		shipCharArray.add(ships.DARIA.getShipMarker());
		shipCharArray.add(ships.SARA.getShipMarker());
		shipCharArray.add(ships.PATRYCJA.getShipMarker());
		shipCharArray.add(ships.MONIKA.getShipMarker());
		shipCharArray.add(ships.NATALIA.getShipMarker());
		shipCharArray.add(ships.WERONIKA.getShipMarker());
	
	}
	public void isItSunk(Ship ship){
		if (ship.lives == 0) {
			System.out.println(ship.name + " " + "zatopiona!");
		}
	}
	
	public void positionShips(Board board) {

			for (int j = 0; j < shipLengthArray.size();j++) {
				boolean shipsOnBoard = false;
				
				boolean spaceFree = false;
			
			start:
			while (!shipsOnBoard){		
				
				boolean horizontal = rand.nextBoolean();

				int col = rand.nextInt(board.boardSize);
				int row = rand.nextInt(board.boardSize);
			
				if (board.getBoard()[row][col] != '-'
					||(row<9 && board.getBoard()[row+1][col] != '-')
					||(row>0 && board.getBoard()[row-1][col] != '-')
					||(col<9 && board.getBoard()[row][col+1] != '-')
					||(col>0 && board.getBoard()[row][col-1] != '-')){
					continue;
				}
				// je�li horizontal ustawi na true
				if (horizontal) {
					
					for (int i = 0; i < shipLengthArray.get(j); i++) {
						// sprawdza czy cala powierzchnie gdzie chce po�o�y� jest pusta i tu pewnie tzreba wrzuci� szukanie czy dookola ca�ej przestrzeni nic nie ma
						if (board.getBoard()[row][i+1] != '-') {
							continue start;
						} else {
						board.getBoard()[row][i+1] = board.getLetter(shipCharArray.get(j));
						}
					}

				// je�li horizontal b�dzi� na false
				} else { //uklada pionowo
					
					for (int i = 0; i < shipLengthArray.get(j); i++) {
						//System.out.println(board.getBoard()[row][i+1]);
						if (board.getBoard()[i+1][col] != '-') {
							continue start;
						} else {
							board.getBoard()[i+1][col] = board.getLetter(shipCharArray.get(j));
						}
					}
				}				
				shipsOnBoard = true;
			}	
		} 	
	 }
}

