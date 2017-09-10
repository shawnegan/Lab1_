package pkgMain;

import pkgCore.Round;

public class cMain {

	public static void main(String[] args) {

		Round s1 = new Round();
		int a = s1.RollCount();

		System.out.println("You rolled a " + s1.GameResult() + " in " + a + " roll" + (a == 1 ? "!" : "s!"));
		int numCraps = 0;
		int numNaturals = 0;
		int numSandP = 0;
		for (int b = 0; b < 1000000; b++) {
			Round one = new Round();
			if (one.GameResult() == pkgCore.eGameResult.CRAPS) {
				// should happen ~111111 times
				numCraps += 1;
			} else if (one.GameResult() == pkgCore.eGameResult.NATURAL) {
				// should happen ~222222 times
				numNaturals += 1;
				// Seven_outs and points should add to ~666667
			} else {
				numSandP += 1;
			}
		}
		System.out.println("1,000,000 Round Tests:");
		System.out.println("Craps: " + numCraps);
		System.out.println("Naturals: " + numNaturals);
		System.out.println("Seven_outs and Points: " + numSandP);
	}
}