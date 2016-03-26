package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKursValute(Valuta val, double prodajniKurs,
			double kupovniKurs, double srednjiKurs, GregorianCalendar dat);

	public void obrisiKursValute(Valuta val, GregorianCalendar dat);

	public Kurs pronadjiIvratiKursValute(Valuta val, GregorianCalendar dat);

}
