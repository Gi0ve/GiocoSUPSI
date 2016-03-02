import java.util.Scanner;

public class InterfaceLayer {
void printMoveInterface(Game current,Player player,int cells){
	
	Scanner input = new Scanner(System.in);
	for (int i = 0; i < cells; i++) {
		Cell position=player.getCurrentPosition();
		current.getI().printField(current);
		System.out.println("Mosse rimanenti:"+(cells-i));
		System.out.println("Dove vuoi andare?\nW-Alto,A-Sinistra,D-Destra,S-Indietro");
		switch (input.nextLine()) {
		case "w":
			current.getLogic().move(player,position,position.getUp());
			break;
		case "a":
			current.getLogic().move(player,position,position.getLeft());
			break;
		case "s":
			current.getLogic().move(player,position,position.getDown());
			break;
		case "d":
			current.getLogic().move(player,position,position.getRight());
			break;

		default:
		break;
			
		}
		if(player.getCurrentPosition().getPlayers().size()>1){
			return;
		}
	}
	
}
void printField(Game current){
	Cell[][] cells=current.getField().getCells();
	for(int y=0;y<cells.length;y++){
		for(int x=0;x<cells[0].length;x++){
			if(cells[y][x]==null){
				System.out.print("|   ");
			}else{
				System.out.print("|"+cells[y][x].print());
			}
		}
		System.out.print("|");
		System.out.println("");
		for(int t=0;t<cells[0].length;t++){
			System.out.print("----");
		}
		System.out.println("");
	}
	
}
}
