public class AB {

	private String racine;
	private AB gauche;
	private AB droite;
	
	
	public AB(String racine, AB gauche, AB droite) {

		this.racine = racine;
		this.gauche = gauche;
		this.droite = droite;
		
	}
	
	public AB(String racine,AB abGauche) {
		this.racine = racine;
		this.gauche = abGauche;
		this.droite = null;
	}
	
	public AB(String racine) {
		this.racine = racine;
		this.gauche = null;
		this.droite = null;
	}
	
	
	public String getRacine() {
		return this.racine;
	}
	public void setRacine(String racine) {
		this.racine = racine;
	}
	public AB getGauche() {
		return gauche;
	}
	public void setGauche(AB gauche) {
		this.gauche = gauche;
	}
	public AB getDroite() {
		return droite;
	}
	public void setDroite(AB droite) {
		this.droite = droite;
	}
		
	
	//Vérifie l'arbre est vide =>  A CORRIGER
	public boolean estVide(){
		return (this.equals(null));
	}
	
	
	//Compte le nombre de noeud => Ok ! 
	public int taille(){
 		 int result = 1;
 	     if (!this.getGauche().estVide()) result += this.getGauche().taille();
 	     if (!this.getDroite().estVide()) result += this.getDroite().taille();
 	     return result;
	}
	
	
	//Parcours préfixe => Ok ! 
	public String parcoursPrefixe(){
		 String parcours = this.getRacine();
 	     if (!this.getGauche().estVide()) parcours += " "+this.getGauche().parcoursPrefixe()+" ";
 	     if (!this.getDroite().estVide()) parcours += " "+this.getDroite().parcoursPrefixe()+" ";
 	     return parcours;
	}
	
	
	//Vérifie si la diff de hauteur des sous-arbres est entre 1 et -1. ==> OK
	public boolean estEquilibre(){
		boolean result = false;
		if((this.getDroite().hauteur()-this.getGauche().hauteur())<=1 || (this.getDroite().hauteur()-this.getGauche().hauteur())<-1) result = true;
		return result;
	}
	
	//Compter la hauteur de l'arbre binaire ==> OK
	public int hauteur(){
		int hauteur = 0;
		if(this.getGauche() != null || this.getDroite() != null){
			if(this.getGauche() != null) return 1+ this.getGauche().hauteur();
			if(this.getDroite() != null) return 1+ this.getDroite().hauteur();
		}else hauteur = 1; return hauteur;
	}
	
	
	//A FAIRE
	public AB rotationG(){
		return new AB(null,null,null);
	}
	
}