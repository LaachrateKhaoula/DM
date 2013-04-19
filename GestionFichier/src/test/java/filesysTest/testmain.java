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
	@Test(expected=ReperException.class)
	public void testReferenceNull() {
		Repertoire repe=new Repertoire("music");
	    Racine fichier=null;
		repe.ajout(fichier);
		assertNull(fichier);
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
	

}
