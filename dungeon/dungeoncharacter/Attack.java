package dungeoncharacter;
public interface Attack {
	public abstract void attack(final DungeonCharacter opponent);
	public abstract void addHP(final int hp);
	public abstract void subHP(final int hp);
}
