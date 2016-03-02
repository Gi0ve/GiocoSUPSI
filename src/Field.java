
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
	}
	
	
	
	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}


}