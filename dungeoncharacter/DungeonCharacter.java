public abstract class DungeonCharacter implements Attack {

	private String name;
	private int currentHP;
	private Stats stats;
	
	
	public DungeonCharacter(final String name, final Stats stats) {
		if(name.isEmpty())
			throw new IllegalArgumentException("Name parmesan in DuneonCharacter constructor was empty.");
		if(name == null)
			throw new NullPointerException("Name parmesan was passed in as null");

		setStats(stats);
		setName(name);
		setCurrentHP();
	}
	
	public void setStats(final Stats stats) {
		this.stats = stats;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public void setCurrentHP() {
		this.currentHP = stats.getHP();
	}
	
	private void addHP(final int hp) {
		this.currentHP += hp;
	}
	
	private void subHP(final int hp) {
		this.currentHP -= hp;
	}
	
	public void attack(final DungeonCharacter opponent) {
	
		boolean canAttack = false;
		int damage = 0;
		
		canAttack = Math.random() <= this.stats.getChanceToHit();
		
		if(canAttack) {
			System.out.println(this.getName() + "'s attack connected with the " + opponent.getName();
			damage = (int)(Math.random() * (damageMax - damageMin + 1)) + damageMin ;
			opponent.subHP(damage);
			
		} else {
			System.out.println(this.getName() + "'s attack failed to connect with the " + opponent.getName();
			System.out.println();
		}
	}
}
