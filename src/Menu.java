import java.util.Scanner;

public class Menu {
	
	void move(int cells,Player player,Field field){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < cells; i++) {
			Cell position=player.getCurrentPosition();
			field.printGrid();
			System.out.println("Mosse rimanenti:"+(cells-i));
			System.out.println("Dove vuoi andare?\nW-Alto,A-Sinistra,D-Destra,S-Indietro");
			switch (input.nextLine()) {
			case "w":
				player.move(position,position.getUp());
				break;
			case "a":
				player.move(position,position.getLeft());
				break;
			case "s":
				player.move(position,position.getDown());
				break;
			case "d":
				player.move(position,position.getRight());
				break;

			default:
			break;
				
			}
			if(player.getCurrentPosition().getPlayers().size()>1){
				return;
			}
		}
	} 
}
