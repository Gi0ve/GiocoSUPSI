
public class Field {
	Cell cells[][];

	public Field(int X,int Y,Player p1,Player p2) {
		this.cells = new Cell[Y][X];
		
		for(int y=0;y<cells.length;y++){
			for(int x=0;x<cells[0].length;x++){
				cells[y][x]=new Cell();
			}
		}
		//connetto le celle
		for(int v=0;v<cells.length;v++){
			for(int h=0;h<cells[0].length;h++){
				if(v==0){
					cells[v][h].setUp(cells[9][h]);
				}else{
					cells[v][h].setUp(cells[v-1][h]);
				}
				if(v==9){
					cells[v][h].setDown(cells[0][h]);
				}else{
					cells[v][h].setDown(cells[v+1][h]);
				}
				if(h==9){
					cells[v][h].setRight(cells[v][0]);
				}else{
					cells[v][h].setRight(cells[v][h+1]);
				}
				if(h==0){
					cells[v][h].setLeft(cells[v][9]);
				}else{
					cells[v][h].setLeft(cells[v][h-1]);
				}
			}
		}
		
		this.cells[0][9].addPlayer(p1);
		p1.setCurrentPosition(this.cells[0][9]);
		this.cells[9][0].addPlayer(p2);
		p2.setCurrentPosition(this.cells[9][0]);
		placeRandomMoney(10);
	}
	
	void printGrid(){
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
	
	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}

	void placeRandomMoney(int number){
		int x;
		int y;
		for(int i=0;i<number;i++){
			y=(int)(Math.random()*10);
			x=(int)(Math.random()*10);
			while(this.cells[y][x].getPlayers().size()>0||this.cells[y][x].getMoney()!=0){
				y=(int)Math.random()*10;
				x=(int)Math.random()*10;
			}
			this.cells[y][x].setMoney(1);
		}
		
	}
}