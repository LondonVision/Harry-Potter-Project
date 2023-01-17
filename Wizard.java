import java.util.ArrayList;
import java.util.Scanner;

public class Wizard extends Character{
	private Scanner scan = new Scanner(System.in);
	protected ArrayList<Spell> unlockedSpells = new ArrayList<Spell>();
	
	
	public Wizard(String name, int totalHp,int xp) {
		super(name, totalHp,xp);
	}
	public Wizard() {
		super();
	}
	
	
	@Override
	public void aiAttacks(Character c) {	
		double maxPowAc; //power times percentage of accuracy
		int index = 0, max = 100, min = 0;
		maxPowAc = unlockedSpells.get(0).getPower()*(unlockedSpells.get(0).getAccuracy()/100.0);
		for(int i = 0; i<unlockedSpells.size();i++) {	
			if(((double)unlockedSpells.get(i).getPower())*(((double)unlockedSpells.get(i).getAccuracy())/100.0)>maxPowAc) {
				maxPowAc = ((double)unlockedSpells.get(i).getPower())*(((double)unlockedSpells.get(i).getAccuracy())/100.0);
				index = i;
			}
		}
		System.out.println(getName() + " says: " + unlockedSpells.get(index).getName() + " at " + c.getName());
		if((int)(Math.random()*(max-min+1)+min) > unlockedSpells.get(index).getAccuracy()) {
			System.out.println(getName() + " missed their spell!\n");
		}
		else {
			System.out.println(c.getName() + " lost "+ unlockedSpells.get(index).getPower() +"hp!\n" + 
					getName() + " gained " + (unlockedSpells.get(index).getPower()/2) + "xp!\n");
					c.setHp(c.getHp()-unlockedSpells.get(index).getPower());
					setXp(getXp()+(unlockedSpells.get(index).getPower()/2));
		}
	}
	
	@Override
	public void attacks(Character c) {
		System.out.println("Your arsenal:");
		
		Main.displaySpell(unlockedSpells);
		 System.out.println("What would you like to do? Enter the number of in front of the spell");
		int useSpell = scan.nextInt();
		scan.nextLine();
		while(useSpell<0 || useSpell>unlockedSpells.size()-1) {
			System.out.println("Invalid Input. Enter one of the valid numbers");
			useSpell = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.println(name + " says: " + unlockedSpells.get(useSpell).getName() + " at " + c.getName());
		
		int max = 100;
		int min = 0;
		
		if((int)(Math.random()*(max-min+1)+min) > unlockedSpells.get(useSpell).getAccuracy()) {
			System.out.println("Oh no! You missed your spell!\n");
		}
		else {
		System.out.println(c.getName() + " lost "+ unlockedSpells.get(useSpell).getPower() +"hp!\n" + 
		getName() + " gained " + (unlockedSpells.get(useSpell).getPower()/2) + "xp!\n");
		c.setHp(c.getHp()-unlockedSpells.get(useSpell).getPower());
		setXp(getXp()+(unlockedSpells.get(useSpell).getPower()/2));
		}
	}

}
