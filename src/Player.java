public class Player {
	String name;
	int money;
	String symbol;
	Cell currentPosition;

	public Player(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	public Cell getCurrentPosition() {
		return currentPosition;
	}

	public void add1(){
		money++;
	}
	public void remove1(){
		money--;
	}

	public void setCurrentPosition(Cell currentPosition) {
		this.currentPosition = currentPosition;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	


}
