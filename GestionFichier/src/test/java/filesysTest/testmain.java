package filesysTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import filesys.Fichier;
import filesys.Racine;
import filesys.Repertoire;

public class testmain {

	/*@Before
	public void setUp() throws Exception {
	}*/

	@Test
	public void testInitialisationRep() {
		Repertoire repe=new Repertoire("music");
		assertTrue(repe.getNom()=="music");
	}
	@Test
	public void testReferenceNull() {
		Repertoire repe=new Repertoire("music");
	    Racine fichier=null;
		repe.ajout(fichier);
		//assertNull(fichier);
	}
	
	@Test(expected=ReperException.class)
	public void testMemeNom() {
		Repertoire repe=new Repertoire("music");
		Fichier fic=new Fichier("fic1", 5);	
		repe.ajout(fic);
		repe.ajout(fic);
		assertSame(fic, fic);
	}
	@Test(expected=ReperException.class)
	public void testMemeRep() {
		Repertoire repe=new Repertoire("music");			
		repe.ajout(repe);		
		assertSame(repe, repe);
	}
	@Test(expected=ReperException.class)
	public void testTaille()
	{
		Repertoire rep1=new Repertoire("music");
		Repertoire rep2=new Repertoire("pop");
		Fichier fic1= new Fichier("fic1",-5);
		Fichier fic2= new Fichier("fic2",-10);
		rep1.ajout(fic1);
		rep1.ajout(rep2);
		rep1.ajout(fic2);
		assertTrue(rep1.getTaille()>0);
	}
	}


