import java.util.Random;

public class Dice {
	static int roll(){
		Random rand=new Random();
		return rand.nextInt(6)+1;
	}
}
