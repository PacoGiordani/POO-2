package revisao.heranca;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {

		Personagem sniper1 = new Sniper("Atirador", 100, 100);
		Personagem knight1 = new Knight("Kavalero", 100, 100);
		Personagem wizard1 = new Wizard("Mago", 100, 100);
		Personagem wizard2 = new Wizard("Joelma", 100, 100);
		Personagem sniper2 = new Sniper("Snipe", 100, 100);
		
		Spell spell = new Spell();
		Sword sword = new Sword();
		AwpRifle awp = new AwpRifle();
		
		
		ArrayList<Personagem> listaPerson =  new ArrayList<Personagem>();
		ArrayList<IWeapon> listaArmas =  new ArrayList<IWeapon>();
		
		listaPerson.add(sniper1);
		listaPerson.add(knight1);
		listaPerson.add(wizard1);
		listaPerson.add(wizard2);
		listaPerson.add(sniper2);
		
		listaArmas.add(spell);
		listaArmas.add(sword);
		listaArmas.add(awp);
		
		
		Random n = new Random();		
		
		while(listaPerson.size() != 1){
			
			int numPersonagens = listaPerson.size();;
			int numAleatorio;
			int numAleatorio2;
			int arma;
			
			numAleatorio = n.nextInt(numPersonagens);
			numAleatorio2 = n.nextInt(numPersonagens);
			arma = n.nextInt(listaArmas.size());
						
			if(listaPerson.get(numAleatorio).stamina > 0){
				
				if(numAleatorio != numAleatorio2){
					listaPerson.get(numAleatorio).attack(listaArmas.get(arma), listaPerson.get(numAleatorio2));										
						if(listaPerson.get(numAleatorio2).life <= 0){
							listaPerson.remove(numAleatorio2);
						}
				}
				
			}else{
				listaPerson.remove(numAleatorio);
			}
		}
		
		System.out.println(listaPerson.get(0).name + " é o vencedor!");
		
		
		
		
		
		
		

		

	}

}
