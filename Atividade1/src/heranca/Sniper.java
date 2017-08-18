package revisao.heranca;

public class Sniper extends Personagem {

	public Sniper(String name, int stamina, int life) {
		super(name, stamina, life);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IWeapon weapon, Personagem personagem) {

		if (this.stamina > 0) {
			weapon.damage(personagem);
			this.stamina = this.stamina - 20;
		}
	}

}
