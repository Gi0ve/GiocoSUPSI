import java.util.ArrayList;

public class Cell {
	ArrayList<Player> players;
	int money;
	
	public Cell() {
		this.players = new ArrayList<Player>();
	}

	void addPlayer(Player player){
		this.players.add(player);
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

