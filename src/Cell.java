import java.util.ArrayList;

public class Cell {
	ArrayList<Player> players;
	int money;
	Cell up,down,left,right;
	
	
	
	public Cell getUp() {
		return up;
	}

	public void setUp(Cell up) {
		this.up = up;
	}

	public Cell getDown() {
		return down;
	}

	public void setDown(Cell down) {
		this.down = down;
	}

	public Cell getLeft() {
		return left;
	}

	public void setLeft(Cell left) {
		this.left = left;
	}

	public Cell getRight() {
		return right;
	}

	public void setRight(Cell right) {
		this.right = right;
	}

	public Cell() {
		this.players = new ArrayList<Player>();
	}
	
	ArrayList<Player> getPlayers(){
		return this.players;
	}

	void addPlayer(Player player){
		this.players.add(player);
	}
	void removePlayer(Player player){
		for(int i=0;i<this.getPlayers().size();i++){
			if(this.players.get(i)==player){
				this.players.remove(i);
			}
		}
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	String print(){
		if(this.money!=0){
			return" $ ";
		}else if(players.size()==1){
			return " "+players.get(0).getSymbol()+" ";
		}else if(players.size()==2){
			return players.get(0).getSymbol()+"/"+players.get(1).getSymbol();
		}else{
			return "   ";
		}
	}
}

