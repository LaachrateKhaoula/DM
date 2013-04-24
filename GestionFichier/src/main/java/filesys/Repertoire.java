package filesys;

import java.util.ArrayList;

import filesysTest.ReperException;

public class Repertoire extends Racine
{
    // instance variables - replace the example below with your own
    private ArrayList<Racine> biblio;

    /**
     * Constructor for objects of class Repertoire
     */
    public Repertoire(String nom)
    {
        // initialise instance variables
        super(nom);
        
        biblio = new ArrayList<Racine>();
    }
   /* public Repertoire getParent()
    {
    	for(Racine aux: biblio)
    		if(this.equals())
    }*/
    public void ajout(Racine uneRacine)
    {
    	if (uneRacine==null)throw new ReperException("reference null");
    		{System.out.println("la reference est null");}
    	
    		for( Racine aux : biblio)
        	{	if (aux.getNom().equals(uneRacine.getNom())) throw new ReperException("meme nom");
        		{System.out.println(" Nom deja existant ");}	
        	}    	
    	if(this.equals(uneRacine)) throw new ReperException(" meme reference de repertoire ");
    		{System.out.println(" reference  deja existante ");}
    	biblio.add(uneRacine);
    }
    
    public int getTaille()
    {
        int taille = 0;
        //parcours liste
        for (Racine aux : biblio)
            taille += aux.getTaille();
        if(taille <=0) new ReperException("Taille negative");
        {System.out.println("taille negative");}
        return taille;
    }
    
    


}

