package statki;
import java.util.Scanner;

import statki.Ship.Ships;

public class Main {
	
	
	public static void main (String[]args) {
		Field field = new Field();
		//Board board = new Board();
		//Player player = new Player();
		Board player_board = new Board();
		Board serwer_board = new Board();
		
		
		Ship anna = new Ship("Anna", 5);
		Ship bogna = new Ship("Bogna", 4);
		Ship daria = new Ship("Daria", 3);
		Ship sara = new Ship("Sara", 3);
		Ship patrycja = new Ship("Patrycja", 2);
		Ship monika = new Ship("Monika", 2);
		Ship natalia = new Ship("Natalia", 1);
		Ship weronika = new Ship("Weronika", 1);
		
		System.out.println("Czy chcesz do��czy� do gry jako gracz czy serwer? Je�li jako gracz podaj g, je�li jako serwer podaj s:");
		Scanner scann = new Scanner(System.in);
		String choice = scann.nextLine();
		if (choice.equals("g") || choice.equals("s") ){
			Player player = new Player();
			Player serwer = new Player();
			
			System.out.println("Oto plansza, na kt�rej zostan� rozstawione statki gracza:");
			player_board.createBoard();
			anna.createShipArray();
			System.out.println("Oto rozstawienie statk�w gracza:");
			anna.positionShips(player_board);
			player_board.printBoard(player_board.getBoard());
			
			System.out.println("Oto plansza, na kt�rej zostan� rozstawione statki serwera:");
			serwer_board.createBoard();
			bogna.createShipArray();
			System.out.println("Oto rozstawienie statk�w serwera:");
			bogna.positionShips(serwer_board);
			serwer_board.printBoard(serwer_board.getBoard());
			System.out.println("Zaczynamy! Rozpoczyna gracz!");
			
			
			while(serwer.getLives() != 0 || player.getLives() != 0) {
			System.out.println("Kolej gracza:");
			player.turn(field,serwer_board,anna,bogna, patrycja, monika, natalia, weronika, sara,daria, serwer);
			System.out.println("Kolej serwera:");
			serwer.turn(field,player_board,anna,bogna, patrycja, monika, natalia, weronika, sara,daria, player);
			};
			
			if (serwer.getLives() == 0) {
				System.out.println("Gracz wygra�! Gratulacje");
			}else {
				System.out.println("Serwer wygra�! Gratulacje");
			}
			
		}
		else {
			System.out.print("nic nie wybra�e�, spr�buj ponowanie");
		}

		
	}
}
