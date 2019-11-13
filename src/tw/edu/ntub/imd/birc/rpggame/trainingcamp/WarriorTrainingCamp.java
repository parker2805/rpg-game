package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.character.Warrior;

public class WarriorTrainingCamp implements TrainingCamp {
	
    @Override
	public Career train() {

		Warrior warrior = new Warrior();
		warrior.setHealthPoint(150);
		warrior.setMagicPoint(80);
		warrior.setAttack(50);
		warrior.setMagicAttack(20);
		warrior.setDefense(80);
		warrior.setMagicDefense(60);

		return warrior;

	}
}
