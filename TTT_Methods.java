import javax.swing.JOptionPane;

public class TTT_Methods {

  static String sBoard = "";
	static String cell1 = "1", cell2 = "2", cell3 = "3", cell4 = "4", cell5 = "5", cell6 = "6", cell7 = "7", cell8 = "8", cell9 = "9";
	static String susermove;

	/*
	 * Get user move and validate -- repeat until valid move is made
	 */
	static void UserMove() {
		boolean InvalidMove = true;
		InvalidMove = true;
		// loop till valid move
		do { // loop till valid move
			sBoard = cell1 + "|" + cell2 + "|" + cell3 + "\n";
			sBoard = sBoard + "--|--|--\n";
			sBoard = sBoard + cell4 + "|" + cell5 + "|" + cell6 + "\n";
			sBoard = sBoard + "--|--|--" + "\n";
			sBoard = sBoard + cell7 + "|" + cell8 + "|" + cell9 + "\n";
			sBoard = sBoard + "Enter Number Between 1-9;";
			susermove = JOptionPane.showInputDialog(null, sBoard);

			if (susermove.equalsIgnoreCase("1")) {

				if (cell1.equalsIgnoreCase("1")) {
					cell1 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"Slot Occupied!\nSelect Different Move");
					InvalidMove = true;
				}

			} else if (susermove.equalsIgnoreCase("2")) {

				if (cell2.equalsIgnoreCase("2")) {
					cell2 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}
			} else if (susermove.equalsIgnoreCase("3")) {

				if (cell3.equalsIgnoreCase("3")) {
					cell3 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}

			} else if (susermove.equalsIgnoreCase("4")) {

				if (cell4.equalsIgnoreCase("4")) {
					cell4 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}

			} else if (susermove.equalsIgnoreCase("5")) {
				if (cell5.equalsIgnoreCase("5")) {
					cell5 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}

			} else if (susermove.equalsIgnoreCase("6")) {
				if (cell6.equalsIgnoreCase("6")) {
					cell6 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}

			} else if (susermove.equalsIgnoreCase("7")) {

				if (cell7.equalsIgnoreCase("7")) {
					cell7 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}

			} else if (susermove.equalsIgnoreCase("8")) {

				if (cell8.equalsIgnoreCase("8")) {
					cell8 = "X";
					InvalidMove = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"INVALID!\nSelect Different Move");
					InvalidMove = true;
				}
			} else if (susermove.equalsIgnoreCase("9")) {
				if (cell9.equalsIgnoreCase("9"))
					cell9 = "X";
				InvalidMove = false;
			} else {
				JOptionPane.showMessageDialog(null,
						"INVALID!\nSelect Different Move");
				InvalidMove = true;
			}

		} while	(InvalidMove);
	}

	/*
	 * Generate computer move and validate -- repeat until valid move is made
	 */
	static void ComputerMove() {
		boolean InvalidMove = true;
		// Computer Move
		do {
			int computerNum = 0;

			computerNum = 1 + (int) (Math.random() * 9);

			if (computerNum == 1) {

				if (cell1.equalsIgnoreCase("1")) {
					cell1 = "O";
					InvalidMove = false;
				} else {
					InvalidMove = true;
				}
			} else if (computerNum == 2) {

				if (cell2.equalsIgnoreCase("2")) {
					cell2 = "O";
					InvalidMove = false;
				} else
					InvalidMove = true;

			} else if (computerNum == 3) {

				if (cell3.equalsIgnoreCase("3")) {
					cell3 = "O";
					InvalidMove = false;
				} else {

					InvalidMove = true;
				}
			}

			else if (computerNum == 4) {

				if (cell4.equalsIgnoreCase("4")) {
					cell4 = "O";
					InvalidMove = false;
				} else {
					InvalidMove = true;
				}

			}

			else if (computerNum == 5) {

				if (cell5.equalsIgnoreCase("5")) {
					cell5 = "O";
					InvalidMove = false;
				} else {
					InvalidMove = true;
				}

			}

			else if (computerNum == 6) {

				if (cell6.equalsIgnoreCase("6")) {
					cell6 = "O";
					InvalidMove = false;
				} else {

					InvalidMove = true;
				}

			}

			else if (computerNum == 7) {

				if (cell7.equalsIgnoreCase("7")) {
					cell7 = "O";
					InvalidMove = false;
				} else {

					InvalidMove = true;
				}

			}

			else if (computerNum == 8) {

				if (cell8.equalsIgnoreCase("8")) {
					cell8 = "O";
					InvalidMove = false;
				} else {
					InvalidMove = true;
				}

			}

			else if (computerNum == 9) {

				if (cell9.equalsIgnoreCase("9")) {
					cell9 = "O";
					InvalidMove = false;
				} else {
					InvalidMove = true;
				}
			}
		} while (InvalidMove);

	}

	/*
	 * Check for winner
	 */
	static boolean CheckWinner() {
		boolean Playing = true;
		// Check to see if player wins
		if ((cell1.equals("X") && cell2.equals("X") && cell3
				.equals("X"))
				|| (cell4.equals("X") && cell5.equals("X") && cell6
						.equals("X"))
				|| (cell7.equals("X") && cell8.equals("X") && cell9
						.equals("X"))
				|| (cell1.equals("X") && cell4.equals("X") && cell7
						.equals("X"))
				|| (cell2.equals("X") && cell5.equals("X") && cell8
						.equals("X"))
				|| (cell3.equals("X") && cell6.equals("X") && cell9
						.equals("X"))
				|| (cell1.equals("X") && cell5.equals("X") && cell9
						.equals("X"))
				|| (cell3.equals("X") && cell5.equals("X") && cell7
						.equals("X"))) {

			JOptionPane.showMessageDialog(null, "You Win!!!",
					"winner!!!!", JOptionPane.PLAIN_MESSAGE);
			Playing = false;
			}

		// Check to see if computer wins
		else if ((cell1.equals("O") && cell2.equals("O")
				&& cell3.equals("O") || cell4.equals("O")
				&& cell5.equals("O") && cell6.equals("O")
				|| cell7.equals("O") && cell8.equals("O")
				&& cell9.equals("O") || cell1.equals("O")
				&& cell4.equals("O") && cell7.equals("O") || (cell2
				.equals("O")
				&& cell5.equals("O")
				&& cell8.equals("O")
				|| cell3.equals("O")
				&& cell6.equals("O")
				&& cell9.equals("O")
				|| cell1.equals("O")
				&& cell5.equals("O") && cell9.equals("O") || cell3
				.equals("O") && cell5.equals("O") && cell7.equals("O")))) {
			JOptionPane.showMessageDialog(null, " you lose!!!",
					"loser!!", JOptionPane.PLAIN_MESSAGE);
				Playing = false;
			}

		else if (!cell1.equals("1") && !cell2.equals("2") && !cell3.equals("3")
				&& !cell4.equals("4") && !cell5.equals("5")
				&& !cell6.equals("6") && !cell7.equals("7")
				&& !cell8.equals("8") && !cell9.equals("9")) {
			JOptionPane.showMessageDialog(null, "TIE!!!!", "Not bad",
					JOptionPane.PLAIN_MESSAGE);
			Playing = false;
		}
		return Playing;
	}


	public static void main(String args[]) {
		boolean Playing = true;
		// Loop until game is over
		do {
			UserMove();
			Playing = CheckWinner();
			ComputerMove();
			Playing = CheckWinner();
		} while (Playing);
		// All done
		JOptionPane.showMessageDialog(null, "Goodbye!!!!", "Thanks for playing", JOptionPane.PLAIN_MESSAGE);
	}

}
