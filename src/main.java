public class main {

	public static void main(String[] args) {

		AB g = new AB("927");
		AB f = new AB("727");
		AB e = new AB("431");		
		AB d = new AB("100");		
		AB c = new AB("800",f,g);
		AB b = new AB("250",d,e);
		AB a = new AB("688");

		System.out.println("Hauteur de l'arbre");
		System.out.println(a.hauteur());
		System.out.println(" ");
		
		System.out.println("Taille de l'arbre");
		System.out.println(a.taille());
		System.out.println(" ");
		
		System.out.println("Parcours préfixe");
		System.out.println(a.parcoursPrefixe());
		System.out.println(" ");
		
		System.out.println("est-il équilibré ? :");
		System.out.println(a.estEquilibre());
		System.out.println(" ");


		
	}

}

