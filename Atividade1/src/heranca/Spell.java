package revisao.heranca;

public class Spell implements IWeapon {

	@Override
	public void damage(Personagem personagem) {
		personagem.setLife(personagem.getLife() - 35);

	}

}
