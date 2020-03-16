public class DungeonCharacterFactory{

    public Monster createMonster(final int choice) {
        if(choice == 1)
            return new Ogre();
        else if(choice == 2)
            return new Gremlin();
        else if(choice == 3)
            return new Skeleton();
        else if(choice == 4)
            return new Bugbear();
        else if(choice == 5)
            return new Goblin();
        return new Skeleton();
    }

    public Hero createHero(final int choice, final String name) {
        if(choice == 1)
            return new Warrior(name);
        else if(choice == 2)
            return new Sorceress(name);
        else if(choice == 3)
            return new Thief(name);
        else if(choice == 4)
            return new Cleric(name);
        else if(choice == 5)
            return new Alchemist(name);
        return new Thief(name);
    }
}
