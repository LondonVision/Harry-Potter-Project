import java.util.ArrayList;

public class GoodWizard extends Wizard {
	public static ArrayList<Spell> goodArsenal = new ArrayList<Spell>();

	public GoodWizard(String name, int totalHp, int xp) {
		
		super(name, totalHp, xp);
		this.totalHp += 25;
		this.hp = this.totalHp;		
		this.unlockedSpells.add(goodArsenal.get(0));
		if (xp >= 500) {
			this.unlockedSpells.add(goodArsenal.get(1));
		}
		if (xp >= 1000) {
			this.unlockedSpells.add(goodArsenal.get(2));
		}
		if (xp >= 1500) {
			this.unlockedSpells.add(goodArsenal.get(3));
		}
		if (xp >= 2000) {
			this.unlockedSpells.add(goodArsenal.get(4));
		}
		if (xp >= 2500) {
			this.unlockedSpells.add(goodArsenal.get(5));
		}
		if (xp >= 3000) {
			this.unlockedSpells.add(goodArsenal.get(6));
		}
		if (xp >= 3500) {
			this.unlockedSpells.add(goodArsenal.get(7));
		}
	}

	public static void createGoodSpells() {
		goodArsenal.add(new Spell("Expelliarmus", "Disarming spell", 25, 80));
		goodArsenal.add(new Spell("Impedimenta", "Slowing spell", 20, 85));
		goodArsenal.add(new Spell("Incendio", "Fire spell", 65, 60));
		goodArsenal.add(new Spell("Petrificus Totalus", "Petrify spell", 30, 70));
		goodArsenal.add(new Spell("Reducto", "Reduces to pieces spell", 75, 50));
		goodArsenal.add(new Spell("Stupify", "Stunning spell", 25, 65));
		goodArsenal.add(new Spell("Wingardium Leviosa", "Levitation spell", 20, 95));
		goodArsenal.add(new Spell("Zap", "Zap", 15, 99));
	}

}
