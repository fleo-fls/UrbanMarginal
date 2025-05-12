/**
 * Gestion de la boule
 *
 */
public class Boule extends Objet {

	/**
	 * instance de JeuServeur pour la communication
	 */
	private JeuServeur jeuServeur ;
	
	/**
	 * Constructeur
	 */
	public Boule() {
	}
	
	/**
	 * Tire d'une boule
	 */
	public void tireBoule() {
	}

	public JeuServeur getJeuServeur() {
		return jeuServeur;
	}

	public void setJeuServeur(JeuServeur jeuServeur) {
		this.jeuServeur = jeuServeur;
	}
	
}
