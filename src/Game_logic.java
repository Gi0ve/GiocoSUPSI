public class Game_logic {

	void start(Game corrente){
		placeRandomMoney(corrente.field, 10);
		Player player1=corrente.getPlayer1();
		Player player2=corrente.getPlayer2();
		while(true){
			playTurn(corrente,player1);
			check(corrente);
			if(checkForWinner(corrente)==true){
				break;
			}
			playTurn(corrente,player2);
			check(corrente);
			if(checkForWinner(corrente)==true){
				break;
			}
		}
	}
	void placeRandomMoney(Field field,int number){
		int x;
		int y;
		Cell[][] cells=field.getCells(); 
		for(int i=0;i<number;i++){
			y=(int)(Math.random()*10);
			x=(int)(Math.random()*10);
			while(cells[y][x].getPlayers().size()>0||cells[y][x].getMoney()!=0){
				y=(int)Math.random()*10;
				x=(int)Math.random()*10;
			}
			cells[y][x].setMoney(1);
		}
		
	}
	void check(Game corrente){
		if(corrente.getPlayer1().getCurrentPosition()==corrente.getPlayer2().getCurrentPosition()){
			fight(corrente);
		}
	}
	void playTurn(Game corrente,Player player){
		System.out.println("È il turno di"+player.getName());
		int cells=Dice.roll();
		System.out.println("Hai lanciato"+cells);
		corrente.getI().printMoveInterface(corrente, player, cells);
	}
	
	void fight(Game corrente){
		Field field=corrente.getField();
		Player player1=corrente.getPlayer1();
		Player player2=corrente.getPlayer2();
		

		System.out.println("DUELLO---- ZAM ZAM ZAM");
		while(true){
			int score1=Dice.roll();
			int score2=Dice.roll();
			if(score1>score2){
				System.out.println("Vince il duello "+player1.getName());
				player1.add1();
				player2.remove1();
				move(player2,player2.getCurrentPosition(), field.getCells()[9][0]);
				break;
			}else if(score1<score2){
				System.out.println("Vince il duello "+player2.getName());
				player2.add1();
				player1.remove1();
				move(player1,player1.getCurrentPosition(), field.getCells()[0][9]);
				break;
			}
		}
		
	}
	
	boolean checkForWinner(Game corrente){
		Player player1=corrente.getPlayer1();
		Player player2=corrente.getPlayer2();
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
	void move(Player player,Cell from,Cell to) {
		from.removePlayer(player);
		to.addPlayer(player);
		player.setCurrentPosition(to);
		if(to.getMoney()>0){
			player.setMoney(player.getMoney()+to.getMoney());
			to.setMoney(0);
		}
	
	}
	
}
