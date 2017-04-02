package menjacnicaInterfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajKurs(Valuta valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum);
	public double vratiKurs(Valuta valuta, GregorianCalendar datum);
}
