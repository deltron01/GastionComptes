package aa.tt;

import aa.bb.cc.Compte;
import aa.bb.cc.CompteCourant;
import aa.bb.cc.CompteSimple;

public class App {
	
	
	
     public static void main(String[] args) {
		
    	 Compte c = new CompteSimple(11, 4000, 500);
    	 c.verser(5000);
    	 c.retirer(3000);
    	 System.out.println(c.toString());
	}
}
