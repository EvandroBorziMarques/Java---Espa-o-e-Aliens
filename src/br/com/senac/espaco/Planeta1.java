package br.com.senac.espaco;

/**
 *  Estrutura para atacar.
 * @author evandro.bmarques
 */
public class Planeta1 {
    public static void main(String[] args) {
	EspecieAlien alien1 = new EspecieAlien();
	alien1.primeiro();
	alien1.verific();
	alien1.alvo();
	alien1.defeat = 30;
	alien1.nivelint = 100;
	alien1.ataque = "Infalível";
	System.out.println("Your computer this: " + alien1.defeat + "% so defeat");
	System.out.println("Planet1: Alien1");
	System.out.println("Level so Inteligency: " + alien1.nivelint + "%");
	System.out.println("Atack: " + alien1.ataque);
	alien1.anti();
	alien1.atacar();
		
			
    }
    
}
