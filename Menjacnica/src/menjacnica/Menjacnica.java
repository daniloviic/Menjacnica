package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(Valuta valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		
		valuta.setKupovni(kupovni);
		valuta.setProdajni(prodajni);
		valuta.setSrednji(srednji);
		valuta.setDatum(datum);
		
		kursnaLista.addLast(valuta);
		
	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getNaziv().equals(valuta.getNaziv()) && kursnaLista.get(i).getDatum()==datum){
				kursnaLista.remove(i);
				return;
			}
		}
		
	}

	@Override
	public double vratiKurs(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getNaziv().equals(valuta.getNaziv()) && kursnaLista.get(i).getDatum()==datum){
				return kursnaLista.get(i).getSrednji();
			}
		}
		return 0;
	}

}
