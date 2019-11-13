package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.character.Mage;

public class MageTrainingCamp implements TrainingCamp {
	
	@Override
	public Career train() {

		Mage mage = new Mage();
		mage.setHealthPoint(100);
		mage.setMagicPoint(200);
		mage.setAttack(10);
		mage.setMagicAttack(60);
		mage.setDefense(10);
		mage.setMagicDefense(70);

		return mage;

	}
}
