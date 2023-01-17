public class Character {
protected String name;
protected int hp,totalHp, xp;
public Character(String name, int totalHp, int xp) {
	super();
	this.name = name;
	this.totalHp = totalHp;
	this.xp = xp;
	hp = totalHp;
}
public Character() {
	this.name = "";
	this.totalHp = 100;
	this.xp = 0;
	hp = this.totalHp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}


public int getTotalHp() {
	return totalHp;
}
public void setTotalHp(int totalHp) {
	this.totalHp = totalHp;
}
public int getXp() {
	return xp;
}
public void setXp(int xp) {
	this.xp = xp;
}
public void attacks(Character c) {
	System.out.println(name + " punches " + c.getName());
	System.out.println(c.getName() + " lost 10 hp!\n" + getName() + " gained 5 xp!\n");
	c.setHp(c.getHp()-10);
	setXp(getXp()+5);
}
public void aiAttacks(Character c) {
	System.out.println(name + " punches " + c.getName());
	System.out.println(c.getName() + " lost 10 hp!\n" + getName() + " gained 5 xp!\n");
	c.setHp(c.getHp()-10);
	setXp(getXp()+5);
}
@Override
public String toString() {
	return "Name: " + name + " | hp: " + hp + " | totalHp: " + totalHp + " | xp: " + xp;
}

}
