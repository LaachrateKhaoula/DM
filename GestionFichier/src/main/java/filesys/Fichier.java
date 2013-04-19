package filesys;

public class Fichier extends Racine
{
    // instance variables - replace the example below with your own
    private int taille;

    /**
     * Constructor for objects of class Fichier
     */
    public Fichier(String parNom, int parTaille)
    {
        // initialise instance variables
        super(parNom);
        taille = parTaille;
    }
    
    public int getTaille()
    {
        return taille;
    }

}