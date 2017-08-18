package revisao.heranca;

public class Wizard extends Personagem{

	public Wizard(String name, int stamina, int life) {
		super(name, stamina, life);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IWeapon weapon, Personagem personagem) {
		if (this.stamina > 0) {
			weapon.damage(personagem);
			this.stamina = this.stamina - 19;
		}
	}

}
