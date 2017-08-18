package revisao.heranca;

public abstract class Personagem {
	
	protected String name;
	protected int stamina;
	protected int life;
	
	
	
	public Personagem(String name, int stamina, int life) {
		super();
		this.name = name;
		this.stamina = stamina;
		this.life = life;
	}


	

	public int getStamina() {
		return stamina;
	}




	public void setStamina(int stamina) {
		this.stamina = stamina;
	}




	public double getLife() {
		return life;
	}




	public void setLife(double life) {
		this.life = (int) life;
	}




	public abstract void attack(IWeapon weapon, Personagem personagem);
	
	

}
