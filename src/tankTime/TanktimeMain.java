package tankTime;
import java.util.*;

public class TanktimeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game g1= new Game(scan);
		g1.play_game();
		
		scan.close();

	}

}
