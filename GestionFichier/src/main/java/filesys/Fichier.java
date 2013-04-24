package filesys;

import filesysTest.ReperException;

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
        if(parTaille <= 0) throw new ReperException("Taille negative");
        {System.out.println("Taille negative");}
        taille = parTaille;
    }
    
    public int getTaille()
    {
        return taille;
    }

}