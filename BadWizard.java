import java.util.ArrayList;

public class BadWizard extends Wizard{
	public static ArrayList<Spell> badArsenal = new ArrayList<Spell>();

	
	
	public BadWizard(String name, int totalHp,int xp) {
		super(name, totalHp,xp);
		
			this.totalHp-=10;
			this.hp = this.totalHp;
			unlockedSpells.add(badArsenal.get(0));
			if (xp >= 500) {
				unlockedSpells.add(badArsenal.get(1));
			}
			if (xp >= 1000) {
				unlockedSpells.add(badArsenal.get(2));
			}
			if (xp >= 1500) {
				unlockedSpells.add(badArsenal.get(3));
			}
			if (xp >= 2500) {
				unlockedSpells.add(badArsenal.get(4));
			}
			if (xp >= 3500) {
				unlockedSpells.add(badArsenal.get(5));
			}
			if (xp >= 5000) {
				unlockedSpells.add(badArsenal.get(6));
			}
	}
	
	public static void createBadSpells() {
		badArsenal.add(new Spell("Avada Kedavra", "The Killing Curse", 100, 25));
		badArsenal.add(new Spell("Bombardo", "Explosion spell", 30, 65));
		badArsenal.add(new Spell("Crucio", "The Torture Curse", 85, 35));
		badArsenal.add(new Spell("Locomotor Mortis", "The Leg-Locker Curse", 25, 90));
		badArsenal.add(new Spell("Sectumsempra", "Bleeding spell", 35, 60));
		badArsenal.add(new Spell("Zap", "Zap", 15, 99));
		badArsenal.add(new Spell("Incarcerous", "Rope choking spell", 20, 80));

	}

}
