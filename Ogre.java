public class Ogre extends Monster {

    public Ogre() {
        super("Og-Mar the Ogre", Stats.getOgreStats());
    }


    public void attack(DungeonCharacter opponent) {
        System.out.println(super.getName() + " slowly swings a club toward's " + opponent.getName() + ":");
        super.attack(opponent);
    }
}


