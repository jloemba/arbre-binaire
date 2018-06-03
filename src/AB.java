public class AB {

	private String racine; // La racine du noeud
	private AB gauche; //Le noeud externe de gauche
	private AB droite;//Le noeud externe de droite
	
	
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
	
	public AB(){
		
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
	
	
	//
	public AB getGauche() {
		if(this.gauche == null) return null;
		return this.gauche;
	}
	public void setGauche(AB gauche) {
		this.gauche = gauche;
	}
	
	//
	public AB getDroite() {
		if(this.droite == null) return null;
		return this.droite;
	}
	public void setDroite(AB droite) {
		this.droite = droite;
	}
		
	
	//Vérifie l'arbre est vide =>  OK
	public boolean estVide(){
		if(this.getGauche() == null && this.getDroite() == null) return true;
		else return false;
	}
	
	//Compte le nombre de noeud  ==> OK
	public int taille(){
 		 int result = 0;
 	     if (this.getGauche()!= null) result += 1+this.getGauche().taille();
 	     if (this.getDroite()!= null) result += 1+this.getDroite().taille();
 	     return result;
	}
	
	
	//Parcours préfixe => en cours
	public String parcoursPrefixe(){
		 String parcours = this.getRacine()+" ";
	     if (this.getGauche()!=null) parcours += this.getGauche().parcoursPrefixe();
	     if (this.getDroite()!=null) parcours += this.getDroite().parcoursPrefixe();
	     return parcours;
	     
	}
	
	//Vérifie si la diff de hauteur des sous-arbres est entre 1 et -1. =>  A TESTER
	public boolean estEquilibre(){
		boolean result = false;
		if(this.getDroite().hauteur()>0 || this.getGauche().hauteur()>0){
			 if(this.getDroite().hauteur()>0) return this.getDroite().estEquilibre();
			 if(this.getGauche().hauteur()>0) return this.getGauche().estEquilibre();
		}else{
			int diff = this.getGauche().hauteur()-this.getDroite().hauteur();
			result = (diff <2 && diff > -2);
		}
		return result;
	}
	
	//Compter la hauteur de l'arbre binaire ==> Ne fonctionne pas
	public int hauteur(){
		int hauteur=0;
		if (this.estVide()) hauteur += -1;
        else{
        	if(!this.getGauche().estVide() || !this.getGauche().estVide()){
        		if(!this.getGauche().estVide() && this.getGauche()!=null) hauteur += 1+hauteur+this.getGauche().hauteur();
        		if(!this.getDroite().estVide() && this.getDroite()!=null) hauteur += 1+hauteur+this.getDroite().hauteur();
        	}
        }
		return hauteur;
	}
	
	
	//A FAIRE
	public AB rotationG(){
		return new AB(null,null,null);
	}
	
}