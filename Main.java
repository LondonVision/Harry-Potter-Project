import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Character> list = new ArrayList<Character>();
	private static Wizard player = new Wizard();

	public Main() {

		startUpSpell();
		startUpCharacters();

		System.out.println("Welcome to Harry Potter battles!");

		String playerName;
		playerName = createName();
		player = createPlayer(playerName);

		gameplay();

	}

	public void sortByPower(ArrayList<Spell> arr) {

		for (int i = 0; i < arr.size() - 1; i++) {
			Spell min = new Spell(arr.get(i).getName(), arr.get(i).getTitle(), arr.get(i).getPower(),
					arr.get(i).getAccuracy());
			int index = i;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j).getPower() < min.getPower()) {
					min = arr.get(j);
					index = j;
				}
			}
			Collections.swap(arr, i, index);
		}
	}

	public void sortByXp(ArrayList<Character> arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			Character min = new Character(arr.get(i).getName(), arr.get(i).getTotalHp(), arr.get(i).getXp());
			int index = i;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j).getXp() < min.getXp()) {
					min = arr.get(j);
					index = j;
				}
			}
			Collections.swap(arr, i, index);

		}
	}

	public static void displaySpell(ArrayList<Spell> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + ": " + arr.get(i));
		}
	}

	public void checkUnlockedSpells(Wizard g) {
		if (g instanceof GoodWizard) {
			if (g.getXp() >= 500 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(1))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(1));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(1).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(1));
			} else if (g.getXp() >= 1000 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(2))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(2));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(2).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(2));
			} else if (g.getXp() >= 1500 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(3))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(3));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(3).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(3));
			} else if (g.getXp() >= 2000 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(4))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(4));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(4).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(4));
			} else if (g.getXp() >= 2500 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(5))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(5));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(5).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(5));
			} else if (g.getXp() >= 3000 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(6))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(6));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(6).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(6));
			} else if (g.getXp() >= 3500 && !g.unlockedSpells.contains(GoodWizard.goodArsenal.get(7))) {
				g.unlockedSpells.add(GoodWizard.goodArsenal.get(7));
				System.out.println("You have gained " + GoodWizard.goodArsenal.get(7).getTitle() + "\n Its stats are: "
						+ GoodWizard.goodArsenal.get(7));
			}
		} else if (g instanceof BadWizard) {
			if (g.getXp() >= 500 && !g.unlockedSpells.contains(BadWizard.badArsenal.get(1))) {
				g.unlockedSpells.add(BadWizard.badArsenal.get(1));
				System.out.println("You have gained " + BadWizard.badArsenal.get(1).getTitle() + "\n Its stats are: "
						+ BadWizard.badArsenal.get(1));
			} else if (g.getXp() >= 1000 && !g.unlockedSpells.contains(BadWizard.badArsenal.get(2))) {
				g.unlockedSpells.add(BadWizard.badArsenal.get(2));
				System.out.println("You have gained " + BadWizard.badArsenal.get(2).getTitle() + "\n Its stats are: "
						+ BadWizard.badArsenal.get(2));
			} else if (g.getXp() >= 1500 && !g.unlockedSpells.contains(BadWizard.badArsenal.get(3))) {
				g.unlockedSpells.add(BadWizard.badArsenal.get(3));
				System.out.println("You have gained " + BadWizard.badArsenal.get(3).getTitle() + "\n Its stats are: "
						+ BadWizard.badArsenal.get(3));
			} else if (g.getXp() >= 2500 && !g.unlockedSpells.contains(BadWizard.badArsenal.get(4))) {
				g.unlockedSpells.add(BadWizard.badArsenal.get(4));
				System.out.println("You have gained " + BadWizard.badArsenal.get(4).getTitle() + "\n Its stats are: "
						+ BadWizard.badArsenal.get(4));
			} else if (g.getXp() >= 3500 && !g.unlockedSpells.contains(BadWizard.badArsenal.get(5))) {
				g.unlockedSpells.add(BadWizard.badArsenal.get(5));
				System.out.println("You have gained " + BadWizard.badArsenal.get(5).getTitle() + "\n Its stats are: "
						+ BadWizard.badArsenal.get(5));
			} else if (g.getXp() >= 5000 && !g.unlockedSpells.contains(BadWizard.badArsenal.get(6))) {
				g.unlockedSpells.add(BadWizard.badArsenal.get(6));
				System.out.println("You have gained " + BadWizard.badArsenal.get(6).getTitle() + "\n Its stats are: "
						+ BadWizard.badArsenal.get(6));
			}
		}
	}

	public void startUpSpell() {
		GoodWizard.createGoodSpells();
		BadWizard.createBadSpells();

		sortByPower(GoodWizard.goodArsenal);
		sortByPower(BadWizard.badArsenal);
	}

	public void startUpCharacters() {
		Character harry = new GoodWizard("Harry", 100, 550);// name hp xp
		Character draco = new BadWizard("Draco", 100, 525);
		Character ron = new GoodWizard("Ron", 100, 500);
		Character dudley = new Character("Dudley", 100, 15);
		Character hermione = new GoodWizard("Hermione", 100, 1050);
		Character voldemort = new BadWizard("Voldemort", 100, 5000);
		Character dumbledore = new GoodWizard("Dumbledore", 100, 5050);
		Character belatrix = new BadWizard("Bellatrix", 100, 3050);
		Character umbridge = new BadWizard("Umbridge", 100, 2000);
		list.add(harry);
		list.add(draco);
		list.add(ron);
		list.add(dudley);
		list.add(belatrix);
		list.add(dumbledore);
		list.add(voldemort);
		list.add(hermione);
		list.add(umbridge);
		sortByXp(list);

	}

	public String createName() {

		String nameCheck = "";
		System.out.println("Create your character \nWhat is your character's name?");
		String pName = scan.nextLine();
		System.out.println("Are happy with the name: " + pName + "\nType yes or no");
		nameCheck = scan.nextLine();

		while (!nameCheck.equalsIgnoreCase("yes") && !nameCheck.equalsIgnoreCase("no")) {
			System.out.println("Invalid input. Please type yes or no");
			nameCheck = scan.nextLine();
		}
		while (nameCheck.equals("no")) {
			System.out.println("Please enter a new name");
			pName = scan.nextLine();

			System.out.println("Are happy with the name: " + pName + "\nType yes or no");
			nameCheck = scan.nextLine();

			while (!nameCheck.equalsIgnoreCase("yes") && !nameCheck.equalsIgnoreCase("no")) {
				System.out.println("Invalid input. Please type yes or no");
				nameCheck = scan.nextLine();
			}
		}

		return pName;
	}

	public Wizard createPlayer(String pName) {

		System.out.println("Would you like to be a: \n1: Good Wizard \n2: Bad Wizard");
		String charCheck = "";
		charCheck = scan.nextLine();
		while (!charCheck.equals("1") && !charCheck.equals("2")) {
			System.out.println("Invalid input. Please choose a type of character by entering 1 or 2");
			charCheck = scan.nextLine();
		}
		if (charCheck.equals("1")) {
			Wizard player = new GoodWizard(pName, 100, 0);
			System.out.println("Good Wizard Selected");
			return player;
		}
		Wizard player = new BadWizard(pName, 100, 0);
		System.out.println("Bad Wizard Selected");

		return player;
	}

	public void gameplay() {
		String menu = "", arcade = "";
		while (!menu.equals("0")) {
			System.out.println(
					"MAIN MENU \nEnter a section by entering it's number.\n1: Arcade Battle Mode \n2: Spells \n3: Your stats \n0: Exit");
			menu = scan.nextLine();
			while (!menu.equals("1") && !menu.equals("2") && !menu.equals("3") && !menu.equals("0")) {
				System.out.println("Invalid Input. Please enter 1, 2, 3, or 0");
				menu = scan.nextLine();
			}
			if (menu.equals("1")) {
				System.out.println("You have entered arcade mode.\nWho would you like to battle?\n"
						+ "Difficulty goes from easy to hard.\n1 Dudley\n2 Ron\n3 Draco\n4 Harry\n5 Hermione\n6 Umbridge"
						+ "\n7 Bellatrix\n8 Voldemort\n9 Dumbledore\n0 Exit");
				arcade = scan.nextLine();
				while (!arcade.equals("1") && !arcade.equals("2") && !arcade.equals("3") && !arcade.equals("4")
						&& !arcade.equals("5") && !arcade.equals("6") && !arcade.equals("7") && !arcade.equals("8")
						&& !arcade.equals("9") && !arcade.equals("0")) {
					System.out.println(
							"Invalid input. Please choose a Character to fight by entering a number 1-9 or exit by entering 0");
					arcade = scan.nextLine();
				}
				if (arcade.equals("1")) {
					System.out.println("You are about to battle Dudley!\nDudley: \"You are going down loser!\"");
					if(battle(0, 100)) {
						System.out.println("Dudley: \"MOM! " + player.getName() + " did you know what!!!\"");
					}
					else {
						System.out.println("Dudley: \"Now you know not to mess with me loser\"");
					}
				} else if (arcade.equals("2")) {
					System.out.println("You are about to battle Ron!\nRon: \"Good luck mate. You're gonna need it\"");
					if(battle(1, 150)) {
						System.out.println("Ron: \"I let you do that. Next time I won't be so nice.\"");
					}
					else {
						System.out.println("Ron: \"Nice one mate. You ok?\"");
					}
				} else if (arcade.equals("3")) {
					System.out.println(
							"You are about to battle Draco!\nDraco: \"You'll Soon Find Out That Some Wizarding Families Are Better Than Others. You're gonna down\"");
					if(battle(2, 200)) {
						System.out.println("Draco: \"My father will hear about this!!!\"");
					}
					else {
						System.out.println("Draco: \"You filthy mudblood! I knew that I would win!\"");
					}
				} else if (arcade.equals("4")) {
					System.out.println(
							"You are about to battle Harry!\nHarry: \"I am the Chosen One. You don't stand a chance\"");
					if(battle(3, 250)) {
						System.out.println("Harry: \"Good job! You faught well\"");
					}
					else {
						System.out.println("Harry: \"No one can defeat the Chosen One!\"");
					}
				} else if (arcade.equals("5")) {
					System.out.println(
							"You are about to battle Hermione!\nHermione: \"I've been reading all night. I have a few new spells to try\"");
					if(battle(4, 300)) {
						System.out.println("Hermione: \"I should have rested last night instead of reading.\"");
					}
					else {
						System.out.println("Hermione: \"All the reading paid off!\"");
					}
				} else if (arcade.equals("6")) {
					System.out.println(
							"You are about to battle Umbridge!\nUmbridge: \"Naughty children deserve to be punished. I WILL HAVE ORDER\"");
					if(battle(5, 350)) {
						System.out.println("Umbridge: \"Things at Hogwarts are far worse than I feared\"");
					}
					else {
						System.out.println("Umbridge: \"Let that sink in.\"");
					}
				} else if (arcade.equals("7")) {
					System.out.println(
							"You are about to battle Bellatrix!\nBellatrix: \"You filthy Half Breed! I will destroy you\"");
					if(battle(6, 400)) {
						System.out.println("Bellatrix: \"I may have lost this time but the Dark Lord will smite you\"");
					}
					else {
						System.out.println("Bellatrix: \"The Dark Lord will be pleased\"");
					}
				} else if (arcade.equals("8")) {
					System.out.println(
							"You are about to battle Voldemort!\nVoldemort: \"Only I can live forever. You are in my way\"");
					if(battle(7, 450)) {
						System.out.println("Voldemort: \"I'll be back and next time you will be sorry\"");
					}
					else {
						System.out.println("Voldemort: \"There is no good and evil, there is only power and those too weak to seek it.\"");
					}
				} else if (arcade.equals("9")) {
					System.out.println(
							"You are about to battle Dumbledore!\nDumbledore: \"Only while we keep fighting can evil be eradicated. That is why I must eradicate you\"");
					if(battle(8, 500)) {
						System.out.println("Dumbledore: \"Well done my young wizard. You still have more to learn\"");
					}
					else {
						System.out.println("Dumbledore: \"You cannot defeat me! I am the greatest wizard of all time!\"");
					}
				}

				System.out.println("\nReturning you to Main menu...\n");

			} else if (menu.equals("2")) {
				String spellMenu = "";
				System.out.println(
						"Welcome to the Spells Menu \nWould you like to see: \n1: Your Spells \n2: All Good Wizard Spells \n3: All Bad Wizard Spells \n0: Exit");
				spellMenu = scan.nextLine();
				while (!spellMenu.equals("1") && !spellMenu.equals("2") && !spellMenu.equals("3")
						&& !spellMenu.equals("0")) {
					System.out.println("Invalid Input. Please enter 1, 2, 3, or 0");
					spellMenu = scan.nextLine();
				}
				if (spellMenu.equals("1")) {
					System.out.println("Your Spells:");
					displaySpell(player.unlockedSpells);
				} else if (spellMenu.equals("2")) {
					displaySpell(GoodWizard.goodArsenal);
				} else if (spellMenu.equals("3")) {
					displaySpell(BadWizard.badArsenal);
				}
				System.out.println();

			} else if (menu.equals("3")) { // stats
				System.out.println("Your stats are:");
				System.out.println(player);
				System.out.println();
			} else if (menu.equals("0")) {
				String exit = "";
				System.out.println(
						"Are you sure you want to exit? All your progress will be lost \nPlease type yes or no");
				exit = scan.nextLine();
				while (!exit.equalsIgnoreCase("yes") && !exit.equalsIgnoreCase("no")) {
					System.out.println("Invalid Input. Please enter yes or no");
					exit = scan.nextLine();
				}
				if (exit.equalsIgnoreCase("yes")) {
					System.out.println("Goodbye!");
					System.exit(0);
				}
				System.out.println("Returning you to Main menu...");
				menu = "";
			}

		}
	}

	public boolean battle(int index, int addXp) {
		while (player.getHp() > 0 && list.get(index).getHp() > 0) {
			System.out.println(list.get(index).getName() + "'s stats: " + list.get(index) + "\nYour stats: " + player);
			player.attacks(list.get(index));
			System.out.println();
			if (list.get(index).getHp() > 0) {
				list.get(index).aiAttacks(player);
			}
		}
		if (player.getHp() < list.get(index).getHp()) {
			System.out.println("You have been defeated by " + list.get(index).getName());
			player.setHp(player.getTotalHp());
			list.get(index).setHp(list.get(index).getTotalHp());
			checkUnlockedSpells(player);
			return false;
		} else {
			System.out.println("You have beaten " + list.get(index).getName() + "\nYou have gained " + addXp + " xp! ");
			player.setXp(player.getXp() + addXp);
		}
		player.setHp(player.getTotalHp());
		list.get(index).setHp(list.get(index).getTotalHp());
		checkUnlockedSpells(player);
		return true;
	}

	public static void main(String[] args) {
		new Main();
	}

}
