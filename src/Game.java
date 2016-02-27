
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
		this.field.printGrid();
	}
	
}
