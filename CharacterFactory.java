package finalProject;

public class CharacterFactory {


	    public Monster monsterMaker(final int monster) {
	        if(monster == 1)
	            return new Skeleton();
	        else if(monster == 2)
	            return new Ogre();
	        else if(monster == 3)
	        return new Gremlin();
	        else if (monster ==4)
	        	return new Bolg();
	        else
	        	return new Orc();
	        
	    }

	    public Hero heroMaker(final int hero, final String heroName) {
	    	
	        if(hero == 1)
	            return new Warrior(heroName);
	        else if(hero == 2)
	            return new Sorceress(heroName);
	        else if(hero == 3)
	            return new Thief(heroName);
	        else if(hero == 4)
	        	return new Arragorn(heroName);
	        else
	        	return new Gimly(heroName);
	        
	       
	        
	    }
	}
	
	

