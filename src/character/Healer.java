package character;

public interface Healer {
	public void heal();
	public void heal(Hero...heros);
	public void heal(Hero her , int Hp);
}
