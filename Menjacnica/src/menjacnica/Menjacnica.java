package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKursValute(Valuta val, double prodajniKurs,
			double srednjiKurs, double kupovniKurs, GregorianCalendar dat) {

	}

	@Override
	public void obrisiKursValute(Valuta val, GregorianCalendar dat) {

	}

	@Override
	public Kurs pronadjiIVratiKursValute(Valuta val, GregorianCalendar dat) {
		return null;
	}

}
