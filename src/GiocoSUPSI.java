public class GiocoSUPSI {
	public static void main(String[] args){
		Game partita=new Game("Nino", "Brian",new Game_logic(),new InterfaceLayer());
		partita.start();
		
	}
}

