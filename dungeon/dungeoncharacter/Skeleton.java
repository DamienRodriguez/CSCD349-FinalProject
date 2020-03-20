package dungeon.dungeoncharacter;

public class Skeleton extends Monster {

    public Skeleton() {
        super("Skeletor the Skeleton Warrior", Stats.getSkeletonStats());
    }


    public void attack(DungeonCharacter opponent) {
        System.out.println(super.getName() + " slices his rusty longsword at " + opponent.getName() + ":");
        System.out.println();
        super.attack(opponent);
    }
}


