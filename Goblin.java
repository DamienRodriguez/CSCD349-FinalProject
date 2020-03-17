public class Goblin extends Monster implements Attack{

    public Goblin() {
        super("Tik the Goblin", Stats.getOgreStats());
    }

    @Override
    public void attack(DungeonCharacter opponent) {
        System.out.println(super.getName() + " slices a bone dagger at " + opponent.getName() + ":");
        super.attack(opponent);
    }
}