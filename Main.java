package org.billGeneration;

public class Main {
	public static void main(String[] args) {
		FriedRise f=new FriedRise(false);
		//f.addExtraMayo();
		f.addExtraKetchup();
		f.addExtraCoke();
		//f.addExtraPepsi();
		//.takeAway();
		f.getBill();
	}
}
