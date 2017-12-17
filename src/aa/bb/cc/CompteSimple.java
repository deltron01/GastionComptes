package aa.bb.cc;

public final class CompteSimple extends Compte { // final = on n'a pas le droit de hériter de cette classe
	
	private float decouvert;
    private final float taux = 2; // final = interdire la modification de la valeur de la variable.
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}
/*
 *  <Final> est utilisé pour deux raisons :
 *       1- raison de sécurité (empêcher héritage, redifintion ou modification selon l'entité surlaquelle on applique ce final
 *       2- raison d'optimisation : une variable final est placé dans une zone mémoire à accès plus rapide.
 *       donc, dans la conception si on a un attribut qui ne change pas, il est préconisé de le déclarer FINAL.
 *   

 */
	public void retirer(float mt) {
		System.out.println(" method retirer() fille-");
		if(mt < getSolde()+decouvert){
			solde = solde - mt;
		} 
	}

	public void afficher() {
		System.out.println(" c'est un compte simple");
		
	}
	

}
