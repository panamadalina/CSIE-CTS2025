package s6.testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import s6.clase.CentruComercial;
import s6.clase.ETipMagazin;
import s6.clase.Magazin;
import s6.exceptii.ExceptieMagazin;

public class TestGetCelMaiMareMagazin {
	static Magazin m1;
	static Magazin m2;
	static Magazin m3;
	static Magazin m4;
	static Magazin m5;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m1 = new Magazin("Magazin1",15,ETipMagazin.DECORATIUNI,30);
		m2 = new Magazin("Magazin2",17,ETipMagazin.COSMETICE,70);
		m3 = new Magazin("Magazin3",10,ETipMagazin.HAINE,40);
		m4 = new Magazin("Magazin4",14,ETipMagazin.HAINE,20);
		m5 = new Magazin("Magazin5",20,ETipMagazin.COSMETICE,100);
	}

	@Test
	public void testRight() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = new ArrayList<Magazin>();
		listaM.add(m1);
		listaM.add(m2);
		listaM.add(m3);
		listaM.add(m4);
		listaM.add(m5);
		
		CentruComercial cc = new CentruComercial("Mall", 1000, listaM);
		
		String actual = cc.getCelMaiMareMagazin(ETipMagazin.HAINE);
		String expected = "Magazin3";
		assertEquals("lista ce contine magazine tip HAINE",expected, actual);
	}
	
	@Test(expected = ExceptieMagazin.class)
	public void testException() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = new ArrayList<Magazin>();
		CentruComercial cc = new CentruComercial("Mall",1000,listaM);
		
		cc.getCelMaiMareMagazin(ETipMagazin.HAINE);
		fail("nu arunca exceptie cand lista magazine size = 0");
		//lista magazine nu contine magazine, deci trebuie sa arunce exceptie
	}
	
	@Test(expected = ExceptieMagazin.class)
	public void testExistence() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = null;
		CentruComercial cc = new CentruComercial("Mall",1000,listaM);
		cc.getCelMaiMareMagazin(ETipMagazin.HAINE);
		fail("nu arunca exceptie cand lista magazine = null");
		//trebuie sa arunce exceptie cand lista magazine = null
	}
	
	@Test(expected = ExceptieMagazin.class)
	public void testExistence2() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = new ArrayList<Magazin>();
		listaM.add(m1);
		listaM.add(m2);
		listaM.add(m5);
		CentruComercial cc = new CentruComercial("Mall",1000,listaM);
		cc.getCelMaiMareMagazin(ETipMagazin.HAINE);
		fail("nu arunca exceptie cand in lista magazine nu se gasesc HAINE");
		//testare existence atunci cand ceea ce cautam nu se afla in lista magazine
	}
	
	@Test
	public void testExtremeLimits() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = new ArrayList<>();
		listaM.add(m1);
		CentruComercial cc = new CentruComercial("Mall", 1000, listaM);
		String actual = cc.getCelMaiMareMagazin(ETipMagazin.DECORATIUNI);
		String expected = "Magazin1";
		assertEquals("lista magazine cu 1 magazin",expected, actual);
	}
	
	//folosita pentru CrossCheck
	String getCelMaiMareMagazin(ArrayList<Magazin> listaM, ETipMagazin tip) throws ExceptieMagazin {
		if(listaM == null || listaM.size() == 0)
			throw new ExceptieMagazin();
		boolean gasit = false;
		//initializare best cu o suprafata minima acceptata de validarile constructorului
		ArrayList<Magazin> listaMTip = new ArrayList<>();
	
		for(Magazin m: listaM) {
			if(m.getTipMagazin() == tip)
				listaMTip.add(m);
		}
		
		if(listaMTip.size() == 0)
			throw new ExceptieMagazin();
		Magazin result = listaMTip.get(0);
		for(Magazin m: listaMTip)
			if(m.getSuprafataMp()>result.getSuprafataMp())
				result = m;
		return result.getDenumire();
	}
	
	@Test
	public void testCrossCheck() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = new ArrayList<Magazin>();
		listaM.add(m1);
		listaM.add(m2);
		listaM.add(m3);
		listaM.add(m4);
		listaM.add(m5);
		
		CentruComercial cc = new CentruComercial("Mall", 1000, listaM);
		
		//folosit acelasi input ca la testare right
		//expected este rezultatul furnizat de o metoda de referinta
		//metoda face acelasi lucru dar folosind o alta logica de rezolvare
		String actual = cc.getCelMaiMareMagazin(ETipMagazin.HAINE);
		String expected = this.getCelMaiMareMagazin(listaM, ETipMagazin.HAINE);
		assertEquals("lista ce contine magazine tip HAINE",expected, actual);
	}
	
	@Test
	public void testPerformance() throws ExceptieMagazin {
		ArrayList<Magazin> listaM = new ArrayList<>();
		for(int i=1;i<=10;i++)
			listaM.add(new Magazin("Magazin"+i,10+i,ETipMagazin.DECORATIUNI,30+i));
		CentruComercial cc = new CentruComercial("Mall",1000,listaM);
		
		long startTime = System.currentTimeMillis();
		cc.getCelMaiMareMagazin(ETipMagazin.DECORATIUNI);
		long endTime= System.currentTimeMillis();
		assertTrue("verif performance max 10 milisec", endTime-startTime <= 10);
	}

}
