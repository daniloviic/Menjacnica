package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(Valuta valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		valuta.setProdajni(prodajni);
		valuta.setKupovni(kupovni);
		valuta.setSrednji(srednji);
		valuta.setDatum(datum);
		
		kursnaLista.add(valuta);
	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		valuta.setDatum(datum);
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).equals(valuta)){
				kursnaLista.remove(i);
				return;
			}
		}
		
	}

	@Override
	public double vratiKurs(Valuta valuta, GregorianCalendar datum) {
		valuta.setDatum(datum);
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).equals(valuta)){
				return kursnaLista.get(i).getSrednji();
			}
		}
		return 0;
	}

}
