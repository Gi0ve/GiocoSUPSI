
public class Game {
	Player player1;
	Player player2;
	Field field;
	Game_logic logic;
	InterfaceLayer i;
	
	public Game(String name1,String name2,Game_logic logic,InterfaceLayer i) {
		this.player1=new Player(name1,"X");
		this.player2=new Player(name2,"Y");
		this.field=new Field(10, 10,player1,player2);
		this.logic=logic;	
		this.i=i;
	}
	void start(){
		logic.start(this);
	}
	
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public Game_logic getLogic() {
		return logic;
	}
	public void setLogic(Game_logic logic) {
		this.logic = logic;
	}
	public InterfaceLayer getI() {
		return i;
	}
	public void setI(InterfaceLayer i) {
		this.i = i;
	}
	
}
