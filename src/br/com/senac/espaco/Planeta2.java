package br.com.senac.espaco;

/**
 *  Estrututa para analisar alvo
 * @author evandro.bmarques
 */
public class Planeta2 {
    public static void main(String[] args) {
	EspecieAlien alien2 = new EspecieAlien();
	alien2.segundo();
	alien2.verific();
	alien2.alvo();
	alien2.velocidade = 80;
	alien2.resist = "So All Anti-Virus";
	System.out.println("Planet2: Alien2");
	System.out.println("Speed: " + alien2.velocidade + "%");
	System.out.println("Resistance: " + alien2.resist);
	alien2.anti();
	alien2.atacar();
		
    }
    
}
