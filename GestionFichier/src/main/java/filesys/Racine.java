package filesys;

public abstract class Racine
{
    // instance variables - replace the example below with your own
    private String nom;

    /**
     * Constructor for objects of class Racine
     */
    public Racine(String parNom)
    {
        // initialise instance variables
       nom = parNom;
    }
    
    
    
    public String getNom() {
		return nom;
	}



	public abstract int getTaille();
    
}

