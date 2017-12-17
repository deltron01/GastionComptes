package aa.bb.cc;

public abstract class Compte implements ICompte{ // une classe abstraite n'a aucune signification jusqu'à ce que vous en créez une classe dérivée!

	private int code;
	protected float solde;
	
	public Compte(int code, float solde) {
		this.code = code;
		this.solde = solde;
	}

	public Compte() {

	}
	/*public final void verser(float mt){ // final = on n'a pas le droit de la redéfinir dans une classe dérivée
		this.solde = this.solde + mt;
	}
	public void retirer(float mt){
		System.out.println(" method retirer() mère-");
		this.solde = this.solde -mt;
	}

	public float getSolde() {
		return solde;
	}*/

	public String toString() {
		return "Compte [ Code = " + this.code+", Solde = "+this.solde+" ]";
	}
	public abstract void afficher();

	public void verser(float mt) {
		this.solde = this.solde + mt;
	}

	public void retirer(float mt) {
		System.out.println(" method retirer() mère-");
		this.solde = this.solde -mt;	
	}

	public float getSolde() {
		return solde;
	}
}
