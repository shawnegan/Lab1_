package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {

		// Execute Come Out roll, value ComeOutScore
		// Create a loop that will execute a roll until point is made, or
		// seven-out

		Roll a = new Roll();
		ComeOutScore = a.getScore();
		if (ComeOutScore == 7 || ComeOutScore == 11) {
			rolls.addLast(a);
		} else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			rolls.addLast(a);
		} else {
			rolls.addLast(a);
			int NewRoll;
			do {
				Roll b = new Roll();
				NewRoll = b.getScore();
				rolls.addLast(b);
			} while (NewRoll != 7 && NewRoll != ComeOutScore);
		}

		// value the eGameResult after the round is complete

		if (ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = pkgCore.eGameResult.NATURAL;
		} else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = pkgCore.eGameResult.CRAPS;
		} else if (rolls.getLast().getScore() == 7) {
			eGameResult = pkgCore.eGameResult.SEVEN_OUT;
		} else {
			eGameResult = pkgCore.eGameResult.POINT;
		}
	}

	public int RollCount() {

		// Return the roll count

		return rolls.size();
	}

	// I felt the need to do something with the value of eGameResult
	// I know this was not required
	public eGameResult GameResult() {
		return eGameResult;
	}
}
