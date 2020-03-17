public abstract class Monster extends DungeonCharacter implements Attack {

    public Monster(final String name, final Stats stats) {
        super(name, stats);
    }

    public void heal() {
        boolean canHeal = (Math.random() <= super.getStats().getChanceToHeal()) && (super.getCurrentHP() > 0);
        int hp = 0;
        int[] healVariance = super.getStats().getHealVariance();
        if (canHeal) {
            hp = (int) (Math.random() * (healVariance[1] - healVariance[0] + 1)) + healVariance[0];
            this.addHP(hp);
        }
    }

    public void addHP(final int hp) {
        super.addHP(hp);

        //moved from the heal function. probably something that I should fix
        System.out.println(super.getName() + " healed itself for " + hp + " points.\n" + "Total hit points remaining are: " + super.getCurrentHP());
        System.out.println();
    }

    public void subHP(final int hp) {
        super.subHP(hp);
        this.heal();
    }
}


