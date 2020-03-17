public class Bugbear extends Monster implements Attack {

    public Bugbear() {
        super("An'hek the Bugbear", Stats.getOgreStats());
    }

    @Override
    public void attack(DungeonCharacter opponent) {
        System.out.println(super.getName() + " brings its dual-wielded axes down on the head of " + opponent.getName() + ":");
        super.attack(opponent);
    }
}