
public class Field {
	Cell cells[][];

	public Field(int X,int Y,Player p1,Player p2) {
		this.cells = new Cell[Y][X];
		
		for(int y=0;y<cells.length;y++){
			for(int x=0;x<cells[0].length;x++){
				cells[y][x]=new Cell();
			}
		}
		
		this.cells[0][9].addPlayer(p1);
		this.cells[9][0].addPlayer(p2);
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
	void placeRandomMoney(int number){
		for(int i=0;i<number;i++){
			
		}
		
	}
}