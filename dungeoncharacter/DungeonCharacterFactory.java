public class DungeonCharacterFactory {

	public Monster createMonster(final int choice) {
		if(choice == 1)
			return new Ogre();
		else if(choice == 2)
			return new Gremlin();
		else if(choice == 3)
			return new Skeleton();
		return new Skeleton();	
	}
	
	public Hero createHero(final int choice, final String name) {
		if(choice == 1) 
			return new Warrior(name);
		else if(choice == 2)
			return new Sorceress(name);
		else if(choice == 3)
			return new Thief(name);
		return new Thief(name);
	}
}
