
public class Game {
	Player player1;
	Player player2;
	Field field;
	public Game(String name1,String name2) {
		this.player1=new Player(name1,"X");
		this.player2=new Player(name2,"Y");
		this.field=new Field(10, 10,player1,player2);
	}
	void start(){
		while(true){
			playTurn(player1);
			check();
			if(checkForWinner()==true){
				break;
			}
			playTurn(player2);
			check();
			if(checkForWinner()==true){
				break;
			}
		}
	}
	
	void playTurn(Player player){
		Menu menu=new Menu();
		System.out.println("È il turno di"+player.getName());
		int cells=Dice.roll();
		System.out.println("Hai lanciato"+cells);
		menu.move(cells, player,this.field);
	}
	void fight(){
		System.out.println("DUELLO---- ZAM ZAM ZAM");
		field.printGrid();
		while(true){
			int score1=Dice.roll();
			int score2=Dice.roll();
			if(score1>score2){
				System.out.println("Vince il duello "+player1.getName());
				player1.add1();
				player2.remove1();
				player2.move(player2.getCurrentPosition(), field.getCells()[9][0]);
				break;
			}else if(score1<score2){
				System.out.println("Vince il duello "+player2.getName());
				player2.add1();
				player1.remove1();
				player1.move(player1.getCurrentPosition(), field.getCells()[0][9]);
				break;
			}
		}
	}
	void check(){
		if(player1.getCurrentPosition()==player2.getCurrentPosition()){
			fight();
		}
	}
	boolean checkForWinner(){
		if(player1.getMoney()<0){
			System.out.println("Vince "+player2.getName());
		return true;	
		}
		if(player2.getMoney()<0){
			System.out.println("Vince "+player1.getName());
			return true;
		}
		return false;
	}
	
	
}
