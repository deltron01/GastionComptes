package aa.bb.cc;

public final class CompteSimple extends Compte { // final = on n'a pas le droit de h�riter de cette classe
	
	private float decouvert;
    private final float taux = 2; // final = interdire la modification de la valeur de la variable.
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}
/*
 *  <Final> est utilis� pour deux raisons :
 *       1- raison de s�curit� (emp�cher h�ritage, redifintion ou modification selon l'entit� surlaquelle on applique ce final
 *       2- raison d'optimisation : une variable final est plac� dans une zone m�moire � acc�s plus rapide.
 *       donc, dans la conception si on a un attribut qui ne change pas, il est pr�conis� de le d�clarer FINAL.
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
