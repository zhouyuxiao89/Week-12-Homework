
import javax.swing.JOptionPane;

public class PlayGame {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToeClass mTTT = new TicTacToeClass();

		boolean Playing = true;
		// Loop until game is over
		do {			
			mTTT.UserMove();
			Playing = mTTT.CheckWinner();
			mTTT.ComputerMove();
			Playing = mTTT.CheckWinner();
		} while (Playing);
		// All done
		JOptionPane.showMessageDialog(null, "Goodbye!!!!", "Thanks for playing", JOptionPane.PLAIN_MESSAGE);

	}




}
