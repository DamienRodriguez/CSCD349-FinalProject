public interface Attack {
    void attack(final DungeonCharacter opponent);

    void addHP(final int hp);

    void subHP(final int hp);
}
