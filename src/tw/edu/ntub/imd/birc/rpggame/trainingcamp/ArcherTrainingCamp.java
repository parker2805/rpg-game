package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Archer;
import tw.edu.ntub.imd.birc.rpggame.character.Career;

public class ArcherTrainingCamp implements TrainingCamp {
	
	@Override
	public Career train() {

		Archer archer = new Archer();
		archer.setHealthPoint(120);
		archer.setMagicPoint(120);
		archer.setAttack(60);
		archer.setMagicAttack(40);
		archer.setDefense(50);
		archer.setMagicDefense(30);

		return archer;

	}
}
